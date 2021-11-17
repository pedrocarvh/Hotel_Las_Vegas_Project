package lasvegas;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Random;

public class Hotel {
    private String nomeHotel;
    private ArrayList <Hospede> hospedes = new ArrayList<>();
    private ArrayList <Funcionario> funcionarios = new ArrayList<>();
    private Gerente gerente;
    private ArrayList <Reserva> reservas = new ArrayList<>();
    private Reserva reserva;
    private ArrayList <Apartamento> apartamentos = new ArrayList<>();

    public void addHospede(Hospede hospede){
        this.hospedes.add(hospede);
    }

    public void mostrarHospedes(){

        if (this.hospedes.size() > 0){

            System.out.println("-> [Lista de Hospedes] <-");
            System.out.println("CODE -      NAME");
            for(Hospede hospedes : this.hospedes){
                System.out.println(hospedes.guestCode+ " -    " + hospedes.getName());
            }
        }
    }
    public void addFuncionario(Funcionario funcionario){
        this.funcionarios.add(funcionario);
    }

    public void mostrarFuncionarios(){
        System.out.println("\nGERENTE:  "+ gerente.getName());
        if(this.funcionarios.size()>0){
        System.out.println("\n [FUNCIONARIOS] ");
            for(Funcionario funcionarios: this.funcionarios){
                System.out.println("\t "+ funcionarios.getName());
            }
        }
    }
    public void contrataGerente(Gerente gerente){
        this.gerente = gerente;
    }

    public void addReserva(Reserva reserva) {
        this.reserva = reserva;
        reservas.add(reserva);
    }

    public int geraCodReserva(){

        int randomNum = 1000+ (int)(Math.random() * 9999);
        return randomNum;
    }

    public void mostrarReserva(Reserva reserva) throws ParseException {

        System.out.println("\n!Reserve Successfully!\n   booking details");
        System.out.println("-Nome Cliente  ...  " + reserva.getHospede().getName());
        System.out.println("-Reserve Type  ...  "+ reserva.getApartamento().getapartmentType());
        reserva.reserveDate();
        System.out.println("-Codigo Reserva...  " + reserva.getCode());
        System.out.println("-Arrival Date  ...  " + reserva.getArrivalDate());
        System.out.println("-Exit Date     ...  " + reserva.getExitDate());
        System.out.println("-Valor Reserva ...  R$ " + reserva.cobrarReserva());
    }

    public void mostrarReservas(){
        System.out.println("\n\nReservas realizadas:");
        for (Reserva value : reservas) {
            System.out.println(" -------------------");
            value.reserveDate();
            System.out.println("Nome Cliente:" +value.getHospede().getName());
            System.out.println("Tipo Quarto:" + value.getApartamento().getapartmentType());
            System.out.println("Codigo Reserva: " + value.getCode());
            System.out.println(" -------------------");
        }
    }
    public void aumentarSalario(Gerente gerente, int porcentagem){
        gerente.setSalario(gerente.getSalario()+gerente.getSalario()*porcentagem/100);
    }

    public void removeFuncionario(Funcionario funcionario){
        funcionarios.remove(funcionario);
    }

    public void addApartamento(Apartamento apartamento){
        apartamentos.add(apartamento);
    }

    public ArrayList<Apartamento> getApartamentos() {
        return apartamentos;
    }

    public void setApartamentos(ArrayList<Apartamento> apartamentos) {
        this.apartamentos = apartamentos;
    }
}
