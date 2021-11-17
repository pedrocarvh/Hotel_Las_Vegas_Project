package lasvegas;

public class Funcionario extends Pessoa{

    protected int registration;
    private String address;
    protected String office;
    protected String admissionDate;
    private double salario;
    private Hotel hotel;
    public boolean ativo;

    public Funcionario(String name,String rg, String cpf,int registration,double salario,String address,String office,
                       String admissionDate,Hotel hotel,boolean ativo){
        super();
        this.name = name;
        this.hotel = hotel;
        this.cpf = cpf;
        this.rg = rg;
        this.registration = registration;
        this.salario = salario;
        this.address = address;
        this.office = office;
        this.admissionDate = admissionDate;
        this.ativo = ativo;
    }

    public int getRegistration() {
        return registration;
    }

    public void setRegistration(int registration) {
        this.registration = registration;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(String admissionDate) {
        this.admissionDate = admissionDate;
    }

    public void cadastrarHospede(Hospede hospede){
        hotel.addHospede(hospede);
    }

    public boolean isAtivo(boolean b) {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public void criarReserva(Reserva reserva){
        if(isAtivo(ativo)) {
            if (reserva.getApartamento().isDisponibilidade()) {
                hotel.addReserva(reserva);
                reserva.setCode(hotel.geraCodReserva());
                reserva.getApartamento().setDisponibilidade(false);
            }else {
                System.out.println("Quarto não disponivel!");
            }
        }else{
            System.out.println("\nERROR 1 - Funcionario não cadastrado!");
            System.out.println("Não foi possivel realizar a reserva");
        }
    }

    public void consultaHospede(Hospede hospede){
        if(isAtivo(ativo)) {
            System.out.println("Nome:       " + hospede.getName());
            System.out.println("CPF:        " + hospede.getCpf());
            System.out.println("RG:         " + hospede.getRg());
            System.out.println("Guest Code: " + hospede.getGuestCode());
        }
        else{
            System.out.println("\nERROR 2 - Funcionario não cadastrado!");
            System.out.println("Não foi possivel realizar a consulta do hospede");
        }
    }

    public void verificaDisponibilidade(){
        if(isAtivo(ativo)) {
            System.out.println("\n\tQUARTOS DISPONIVEIS: \n");
            for( int i = 0; i < hotel.getApartamentos().size(); i++){
                if(hotel.getApartamentos().get(i).isDisponibilidade()) {
                    System.out.println("Quarto num: " + hotel.getApartamentos().get(i).getNumApartment()+ " Tipo: "
                        + hotel.getApartamentos().get(i).getapartmentType());
                }
            }}
        else{
            System.out.println("\nERROR 3 - Funcionario não cadastrado!");
            System.out.println("Não foi possivel verificar a disponibilidade");
        }
    }
}
