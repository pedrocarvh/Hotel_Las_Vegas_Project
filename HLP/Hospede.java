package lasvegas;

public class Hospede extends Pessoa {

    protected int codCliente;

    public Hospede(String nome, String cpf, String rg, int codCliente){
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.codCliente = codCliente;
    }

    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }
}

