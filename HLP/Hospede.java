package lasvegas;

public class Hospede extends Pessoa {

    protected String codCliente;

    public Hospede(String nome, String cpf, String rg){

        System.out.println("oi");
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.codCliente = this.geraCodReserva();

    }

    public String getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(String codCliente) {
        this.codCliente = codCliente;
    }

    @Override
    public String toString() {
        return "\n Hospede"+
                "\nNome: "+nome+
                "\nCPF: "+cpf+
                "\nRG: "+rg+
                "\nCOD: "+getCodCliente();
    }

    @Override
    public String geraCodReserva() {

        int randomNum = 1000+ (int)(Math.random() * 9999) ;
        return Integer.toString(randomNum)+"-2";
    }


}

