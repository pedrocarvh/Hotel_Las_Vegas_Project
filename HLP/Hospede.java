package lasvegas;

public class Hospede extends Pessoa {

    protected final String codCliente;

    public Hospede(String nome, String cpf, String rg){

        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.codCliente = this.geraCodReserva();

    }

    public String getCodCliente() {
        return codCliente;
    }
    
    @Override
    public String toString() {
        return "\n Hospede"+
                "\nNome: "+nome+
                "\nCPF: "+cpf+
                "\nRG: "+rg+
                "\nCOD: "+getCodCliente();
    }

    private String geraCodReserva() {

        int randomNum = 1000+ (int)(Math.random() * 9999) ;
        return randomNum +"-2";
    }


}

