package lasvegas;

import java.text.ParseException;
import java.util.ArrayList;

public class Hotel {

    private String nomeHotel;
    private ArrayList <Hospede> hospedes = new ArrayList<>();
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();
    private Gerente gerente;
    private ArrayList <Reserva> reservas = new ArrayList<>();
    private Reserva reserva;
    private ArrayList <Apartamento> apartamentos = new ArrayList<>();

    public void addHospede(Hospede hospede){
        this.hospedes.add(hospede);
    }

    public void mostrarHospedes(){

        if (this.hospedes.size() > 0){

            System.out.println("[CLIENTES CADASTRADOS]");
            for(Hospede hospedes : this.hospedes){
                System.out.println("Name: " + hospedes.getNome() + " - code: " + hospedes.codCliente);
            }
        }
    }

    public void addFuncionario(Funcionario funcionario){
        this.funcionarios.add(funcionario);
    }

    public void mostrarFuncionarios(){
        System.out.println("\n Gerentes Hotel LasVegas:  "+ gerente.getNome());
        if(this.funcionarios.size()>0){
            System.out.println("\n [FUNCIONARIOS] ");
            for(Funcionario funcionarios: this.funcionarios){
                System.out.println("\t "+ funcionarios.getNome());
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

        int randomNum = 1000+ (int)(Math.random() * 9999) ;
        return randomNum;
    }

    public void mostrarReserva(Reserva reserva) throws ParseException {

        System.out.println("\n!Reserve Successfully!\n   booking details");
        System.out.println("-Nome Cliente  ...  " + reserva.getHospede().getNome());
        System.out.println("-Reserve Type  ...  "+ reserva.getApartamento().getTipoApartamento());
        reserva.reserveDate();
        System.out.println("-Codigo Reserva...  " + reserva.getCodigo());
        System.out.println("-Arrival Date  ...  " + reserva.getDataEntrada());
        System.out.println("-Exit Date     ...  " + reserva.getDataSaida());
        System.out.println("-Valor Reserva ...  R$ " + reserva.cobrarReserva());
    }

    public void mostrarReservas(){
        System.out.println("\n\nReservas realizadas:");
        for (Reserva valor : reservas) {
            System.out.println(" -------------------");
            valor.reserveDate();
            System.out.println("Nome Cliente:" +valor.getHospede().getNome());
            System.out.println("Tipo Quarto:" + valor.getApartamento().getTipoApartamento());
            System.out.println("Codigo Reserva: " + valor.getCodigo());
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
