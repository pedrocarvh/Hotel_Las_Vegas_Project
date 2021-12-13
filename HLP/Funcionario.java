package lasvegas;

public abstract class Funcionario extends Pessoa {

    protected String idFuncionario;
    protected String atividade;
    protected String dataAdmissao;
    protected double salario = 1000;
    protected Hotel hotel;
    public boolean ativo;

    public String getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(String idFuncionario) {
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
        return this.ativo;
    }

    public void setAtivo(boolean ativo) {
    }

    public double valorSalario(){
        return salario;
    }

}