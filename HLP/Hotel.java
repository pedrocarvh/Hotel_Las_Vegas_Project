package lasvegas;

import java.util.ArrayList;

public class Hotel {

    private String nomeHotel;
    private ArrayList <Hospede> hospedes = new ArrayList<>();
    private ArrayList <Funcionario> funcionarios = new ArrayList<>();
    private Gerente gerente;

    public void addHospede(Hospede hospede){
        this.hospedes.add(hospede);
    }
    public void mostrarHospedes(){
        if (this.hospedes.size() > 0){
            System.out.println("------- Lista de Hospedes -------");
            for(Hospede hospedes : this.hospedes){
                System.out.println("Hospede: "+ hospedes.getName() );
            }
        }
    }
    public void addFuncionario(Funcionario funcionario){
        this.funcionarios.add(funcionario);
    }
    public void mostrarFuncionarios(){
        if(this.funcionarios.size()>0){
        System.out.println("--- Lista de Funcionarios ---");
            for(Funcionario funcionarios: this.funcionarios){
                System.out.println("\t\t "+ funcionarios.getName());
            }
        System.out.println("\t\t "+ gerente.getName());
        }
    }
    public void contrataGerente(Gerente gerente){
        this.gerente = gerente;
    }
}
