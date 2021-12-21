package lasvegas;

import java.util.ArrayList;

public class Hotel {

    private final ArrayList <Hospede> hospedes = new ArrayList<>();
    private final ArrayList<Funcionario> funcionarios = new ArrayList<>();
    private Gerente gerente;
    private final ArrayList <Reserva> reservas = new ArrayList<>();
    private final ArrayList <Apartamento> apartamentos = new ArrayList<>();

    public void addHospede(Hospede hospede){
        this.hospedes.add(hospede);
    }

    public void addFuncionario(Funcionario funcionario){
        this.funcionarios.add(funcionario);
    }

    public void mostrarFuncionarios(){
        System.out.println("\n\t !Hotel LasVegas! ");
        System.out.println(" \n " +"Gerente:"+ gerente.getNome() + "\n Id: " + gerente.idFuncionario +
                "\n R$: " + gerente.salario);
        if(this.funcionarios.size()>0){
            for(Funcionario funcionarios: this.funcionarios){
                System.out.println("\n Recepcionista:" +funcionarios.getNome() + "\n Id: " + funcionarios.idFuncionario +
                        "\n R$: " + funcionarios.salario);
            }
        }
    }

    public void contrataGerente(Gerente gerente){
        this.gerente = gerente;
        gerente.valorSalario();
    }

    public void addReserva(Reserva reserva) {
        reservas.add(reserva);
    }


    public void mostrarReserva(Reserva reserva) {

        if(reservas.contains(reserva) ) {
            System.out.println(reserva);
        }else{
            System.out.println("Reserva Inexistente");
        }
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

    public void removeFuncionario(Funcionario funcionario){
        funcionarios.remove(funcionario);
    }

    public void addApartamento(Apartamento apartamento){
        apartamentos.add(apartamento);
    }

    public ArrayList<Apartamento> getApartamentos() {
        return apartamentos;
    }

}
