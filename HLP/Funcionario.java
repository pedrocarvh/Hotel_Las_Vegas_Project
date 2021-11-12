package lasvegas;

public class Funcionario extends Pessoa{

    protected int registration, address;
    protected String office;
    protected short accessLevel;
    protected int admissionDate;
    private Hotel hotel;

    public Funcionario(String name,String rg, String cpf,int registration,int address,String office, short accessLevel,
                       int admissionDate, Hotel hotel){
        this.name = name;
        this.hotel = hotel;
        this.cpf = cpf;
        this.rg = rg;
        this.registration = registration;
        this.address = address;
        this.office = office;
        this.accessLevel = accessLevel;
        this.admissionDate = admissionDate;
    }

    public int getRegistration() {
        return registration;
    }

    public void setRegistration(int registration) {
        this.registration = registration;
    }

    public int getAddress() {
        return address;
    }

    public void setAddress(int address) {
        this.address = address;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public short getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(short accessLevel) {
        this.accessLevel = accessLevel;
    }

    public int getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(int admissionDate) {
        this.admissionDate = admissionDate;
    }

    public void cadastrarHospede(Hospede hospede){
        hotel.addHospede(hospede);
    }
}
