package lasvegas;

public class Gerente extends Funcionario {

    public Gerente(String nome, String cpf, String rg, double salario, Hotel hotel){

        this.hotel = hotel;
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.idFuncionario = this.geraCodReserva();
        this.salario = salario;
    }

    public void contrataFuncionario(Funcionario funcionario){
        hotel.addFuncionario(funcionario);
        funcionario.setAtivo(true);
    }

    public void aumentaSalario(Funcionario funcionario, int porcentatem){
        funcionario.setSalario(funcionario.getSalario()+ funcionario.getSalario() * (porcentatem/100.0));
    }

    public void demiteFuncionario(Funcionario funcionario){
        hotel.removeFuncionario(funcionario);
        funcionario.setAtivo(false);
    }

    @Override
    public String geraCodReserva() {

        int randomNum = 1000+ (int)(Math.random() * 9999) ;
        return Integer.toString(randomNum)+"-0";
    }
}
