package lasvegas;

public class Reserva {

    private int reserveCode;
    private String reserveDate;
    private String arrivalDate;
    private Hospede hospede;
    private Funcionario funcionario;
    private String apartmentType;
    private boolean reserveStatus;
    private String exitDate;

    public Reserva(int reserveCode,String reserveDate,String arrivalDate,String apartmentType){
        this.reserveCode = reserveCode;
        this.reserveDate = reserveDate;
        this.arrivalDate = arrivalDate;
        this.apartmentType = apartmentType;
    }
    public Reserva(int reserveCode,String reserveDate,String arrivalDate,String apartmentType,String exitDate){
        this.reserveCode = reserveCode;
        this.reserveDate = reserveDate;
        this.arrivalDate = arrivalDate;
        this.apartmentType = apartmentType;
        this.exitDate = exitDate;
    }

    public int getReserveCode() {
        return reserveCode;
    }

    public void setReserveCode(int reserveCode) {
        this.reserveCode = reserveCode;
    }

    public String getReserveDate() {
        return reserveDate;
    }

    public void setReserveDate(String reserveDate) {
        this.reserveDate = reserveDate;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getApartmentType() {
        return apartmentType;
    }

    public void setApartmentType(String apartmentType) {
        this.apartmentType = apartmentType;
    }

    public boolean isReserveStatus() {
        return reserveStatus;
    }

    public void setReserveStatus(boolean reserveStatus) {
        this.reserveStatus = reserveStatus;
    }

    public String getExitDate() {
        return exitDate;
    }

    public void setExitDate(String exitDate) {
        this.exitDate = exitDate;
    }
}
