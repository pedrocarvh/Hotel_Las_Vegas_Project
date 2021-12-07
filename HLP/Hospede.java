package lasvegas;

public class Hospede extends Pessoa {

    protected int codCliente;

    public Hospede(String nome, String cpf, String rg){

        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.codCliente = this.getCodCliente();
    }

    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    @Override
    public String geraCodReserva() {

        int randomNum = 1000+ (int)(Math.random() * 9999) ;
        return Integer.toString(randomNum)+"-2";
    }
}

