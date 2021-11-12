package lasvegas;

public class Hospede extends Pessoa {

    protected int guestCode;

    public Hospede(String name, String cpf, String rg, int guestCode){
        this.name = name;
        this.cpf = cpf;
        this.rg = rg;
        this.guestCode = guestCode;
    }



    public int getGuestCode() {
        return guestCode;
    }

    public void setGuestCode(int guestCode) {
        this.guestCode = guestCode;
    }

    //cadastrarHospede,consultarHospede, atualizarCadastro
}
