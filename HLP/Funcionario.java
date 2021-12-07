package lasvegas;

public class Funcionario extends Pessoa{

    private int idFuncionario;
    private String atividade;
    private String dataAdmissao;
    private double salario;
    private Hotel hotel;
    public boolean ativo;

    public Funcionario(String nome, String rg,String cpf, int idFuncionario, double salario, String endereco,
                       String atividade,String dataAdmissao, Hotel hotel,boolean ativo){

        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.idFuncionario = idFuncionario;
        this.salario = salario;
        this.endereco = endereco;
        this.atividade = atividade;
        this.dataAdmissao = dataAdmissao;
        this.hotel = hotel;
        this.ativo = ativo;
    }
    public Funcionario(){
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setidFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getAtividade() {
        return atividade;
    }

    public void setAtividade(String atividade) {
        this.atividade = atividade;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean isAtivo(boolean ativo) {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public void cadastrarHospede(Hospede hospede){
        hotel.addHospede(hospede);
    }

    public void criarReserva(Reserva reserva){
        if(isAtivo(ativo)) {
            if (reserva.getApartamento().isDisponibilidade()) {
                hotel.addReserva(reserva);
                reserva.setCodigo(hotel.geraCodReserva());
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
}
