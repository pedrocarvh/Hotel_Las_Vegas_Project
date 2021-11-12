package lasvegas;

public class Gerente extends Pessoa{

    private int codIdentificacao;
    private double salario;
    private Hotel hotel;


    public Gerente(String name, String cpf, String rg, int codIdentificacao, double salario, Hotel hotel){
        this.hotel = hotel;
        this.name = name;
        this.cpf = cpf;
        this.rg = rg;
        this.codIdentificacao = codIdentificacao;
        this.salario = salario;


    }

    public void contrataFuncionario(Funcionario funcionario){
        hotel.addFuncionario(funcionario);
    }
}
