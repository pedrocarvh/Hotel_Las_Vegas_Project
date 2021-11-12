package lasvegas;

public class CadastroHospede{

    protected Hospede hospede;
    protected int numApartment;;
    protected float housingValue;
    protected int numPeoples;
    private Reserva reserva;

    public CadastroHospede(Reserva reserva,int numApartment,float housingValue,int numPeoples){
        this.reserva = reserva;
        this.numApartment = numApartment;
        this.housingValue = housingValue;
        this.numPeoples = numPeoples;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public int getNumApartment() {
        return numApartment;
    }

    public void setNumApartment(int numApartment) {
        this.numApartment = numApartment;
    }

    public float getHousingValue() {
        return housingValue;
    }

    public void setHousingValue(float housingValue) {
        this.housingValue = housingValue;
    }

    public int getNumPeoples() {
        return numPeoples;
    }

    public void setNumPeoples(int numPeoples) {
        this.numPeoples = numPeoples;
    }
}
