package lasvegas;

public class Apartamento {

    protected int numApartment;
    protected String typeApartment;
    protected boolean disponibilidade;

    public int getNumApartment() {
        return numApartment;
    }

    public void setNumApartment(int numApartment) {
        this.numApartment = numApartment;
    }

    public String getTypeApartment() {
        return typeApartment;
    }

    public void setTypeApartment(String typeApartment) {
        this.typeApartment = typeApartment;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
}
