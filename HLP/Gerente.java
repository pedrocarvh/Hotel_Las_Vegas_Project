package lasvegas;

import java.util.Scanner;

public class Gerente extends Pessoa{

    private int registration;
    private double salario;
    private Hotel hotel;

    public Gerente(String name, String cpf, String rg, int registration, double salario, Hotel hotel){
        this.hotel = hotel;
        this.name = name;
        this.cpf = cpf;
        this.rg = rg;
        this.registration = registration;
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void contrataFuncionario(Funcionario funcionario){
        hotel.addFuncionario(funcionario);
        funcionario.setAtivo(true);
    }

    public void aumentaSalario(Funcionario funcionario, int porcentatem){
        funcionario.setSalario(funcionario.getSalario()+ funcionario.getSalario() * (porcentatem/100.0));
    }
    public void demiteFuncionario(Funcionario funcionario){
        hotel.removeFuncionario(funcionario);
        funcionario.setAtivo(false);
    }
}
