package lasvegas;

public class Gerente extends Funcionario {

    public Gerente(String nome, String cpf, String rg, Hotel hotel){

        this.hotel = hotel;
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.idFuncionario = this.geraCodReserva();
        this.salario = this.valorSalario();
    }

    public void contrataFuncionario(Funcionario funcionario){
        hotel.addFuncionario(funcionario);
        funcionario.setAtivo(true);
        funcionario.valorSalario();
    }

    private String geraCodReserva() {

        int randomNum = 1000+ (int)(Math.random() * 9999) ;
        return randomNum +"-0";
    }

    public double valorSalario(){
        return salario*2;
    }

    @Override
    public String toString() {
        return null;
    }
}
