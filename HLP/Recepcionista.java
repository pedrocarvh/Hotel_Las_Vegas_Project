package lasvegas;

public class Recepcionista extends Funcionario {

    public Recepcionista(String nome, String rg,String cpf, String endereco, Hotel hotel){

        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.idFuncionario = this.geraCodReserva();
        this.salario = this.valorSalario();
        this.endereco = endereco;
        this.hotel = hotel;
    }

    public void cadastrarHospede(Hospede hospede){
        hotel.adicionarHospede(hospede);
    }

    public void criarReserva(Reserva reserva){
        if(isAtivo(ativo)) {
            if (reserva.getApartamento().isDisponibilidade()) {
                hotel.adicionarReserva(reserva);
                reserva.getApartamento().setDisponibilidade(false);
                System.out.println("\n\n\n======= Criando Reserva =======");
            }else {
                System.out.println("Quarto selecionado nao disponivel");
            }
        }else{
            System.out.println("\nERROR 1 - Funcionario não cadastrado!");
            System.out.println("Não foi possivel realizar a reserva");
        }
    }

    public void verificarDisponibilidade(){
        if(isAtivo(ativo)) {
            System.out.println("\n----------------------------------\n");
            System.out.println("\tQUARTOS DISPONIVEIS: \n");
            for( int i = 0; i < hotel.getApartamentos().size(); i++){
                if(hotel.getApartamentos().get(i).isDisponibilidade()) {
                    System.out.println("Quarto Number - " + hotel.getApartamentos().get(i).getNumApartamento()+ " Tipo: "
                            + hotel.getApartamentos().get(i).getTipoApartamento());
                }
            }
            System.out.println("\n----------------------------------\n");
        }
        else{
            System.out.println("\nERROR 3 - Funcionario não cadastrado!");
            System.out.println("Não foi possivel verificar a disponibilidade");
        }
    }

    private String geraCodReserva() {

        int randomNum = 1000+ (int)(Math.random() * 9999) ;
        return randomNum +"-1";
    }

    public double valorSalario(){
        return salario*1.5;
    }

    @Override
    public String toString() {
        return null;
    }
}
