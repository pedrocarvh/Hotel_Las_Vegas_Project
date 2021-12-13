package lasvegas;

public class Recepcionista extends Funcionario {

    public Recepcionista(String nome, String rg,String cpf, String endereco,
                       String atividade,String dataAdmissao, Hotel hotel,boolean ativo){

        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.idFuncionario = this.geraCodReserva();
        this.salario = this.valorSalario();
        this.endereco = endereco;
        this.atividade = atividade;
        this.dataAdmissao = dataAdmissao;
        this.hotel = hotel;
        this.ativo = ativo;
    }

    //Construtor Vazio

    public Recepcionista(){
    }

    public void cadastrarHospede(Hospede hospede){
        hotel.addHospede(hospede);
    }

    public void criarReserva(Reserva reserva){
        if(isAtivo(ativo)) {
            if (reserva.getApartamento().isDisponibilidade()) {
                hotel.addReserva(reserva);
                reserva.getApartamento().setDisponibilidade(false);
            }else {
                System.out.println("Quarto não disponivel!");
            }
        }else{
            System.out.println("\nERROR 1 - Funcionario não cadastrado!");
            System.out.println("Não foi possivel realizar a reserva");
        }
    }

    public void consultaHospede(Hospede hospede){
        if(isAtivo(ativo)) {
            System.out.println("Nome:       " + hospede.getNome());
            System.out.println("CPF:        " + hospede.getCpf());
            System.out.println("RG:         " + hospede.getRg());
            System.out.println("Guest Code: " + hospede.getCodCliente());
        }
        else{
            System.out.println("\nERROR 2 - Funcionario não cadastrado!");
            System.out.println("Não foi possivel realizar a consulta do hospede");
        }
    }

    public void verificaDisponibilidade(){
        if(isAtivo(ativo)) {
            System.out.println("\n\tQUARTOS DISPONIVEIS: \n");
            for( int i = 0; i < hotel.getApartamentos().size(); i++){
                if(hotel.getApartamentos().get(i).isDisponibilidade()) {
                    System.out.println("Quarto Number - " + hotel.getApartamentos().get(i).getNumApartamento()+ " Tipo: "
                            + hotel.getApartamentos().get(i).getTipoApartamento());
                }
            }
        }
        else{
            System.out.println("\nERROR 3 - Funcionario não cadastrado!");
            System.out.println("Não foi possivel verificar a disponibilidade");
        }
    }

    public String geraCodReserva() {

        int randomNum = 1000+ (int)(Math.random() * 9999) ;
        return Integer.toString(randomNum)+"-1";
    }

    public double valorSalario(){
        return salario*1.5;
    }
}
