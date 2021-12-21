package lasvegas;

public abstract class Funcionario extends Pessoa {

    protected String idFuncionario;
    protected double salario = 1000;
    protected Hotel hotel;
    public boolean ativo;

    public boolean isAtivo(boolean ativo) {
        return this.ativo;
    }

    public double valorSalario(){
        return salario;
    }

    public void setAtivo(boolean ativo){
        this.ativo = ativo;
    }

}