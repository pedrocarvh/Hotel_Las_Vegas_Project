package lasvegas;

public class Hospede extends Pessoa {

    protected final String idHospede;

    public Hospede(String nome, String cpf, String rg){

        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.idHospede = this.geraCodReserva();

    }

    public String getIdHospede() {
        return idHospede;
    }
    
    @Override
    public String toString() {
        return "\n Hospede"+
                "\nNome: "+nome+
                "\nCPF: "+cpf+
                "\nRG: "+rg+
                "\nCOD: "+ getIdHospede();
    }

    private String geraCodReserva() {

        int randomNum = 1000+ (int)(Math.random() * 9999) ;
        return randomNum +"-2";
    }

}

