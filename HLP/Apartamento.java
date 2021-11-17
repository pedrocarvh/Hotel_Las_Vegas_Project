package lasvegas;

public class Apartamento {

    protected int numApartment;
    protected String apartmentType;
    protected boolean disponibilidade;
    private double price;

    public Apartamento(int numApartment, String apartmentType, boolean disponibilidade){
        this.numApartment = numApartment;
        this.apartmentType = apartmentType;
        this.disponibilidade = disponibilidade;
    }

    public int getNumApartment() {
        return numApartment;
    }

    public void setNumApartment(int numApartment) {
        this.numApartment = numApartment;
    }

    public String getapartmentType() {
        return apartmentType;
    }

    public void setapartmentType(String apartmentType) {
        this.apartmentType = apartmentType;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public double getPrice() {
        switch (this.apartmentType){
            case "BASIC":
                this.price = 100.00;
                break;
            case "PREMIUM":
                this.price = 300.00;
                break;
            case "DELUXE":
                this.price = 600.00;
                break;
        }
        return price;
    }
}
