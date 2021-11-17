package lasvegas;

import javax.swing.*;
import java.text.ParseException;
import java.util.Scanner;

;public class Main {

    public static void main(String[] args) throws ParseException {


        Hotel lasVegas = new Hotel();

        // CRIANDO DADOS PARA UM GERENTE
        Gerente artur = new Gerente("Artur","38281243832","383729",1204,
                800.00,lasVegas);

        // CRIANDO DADOS PARA UM FUNCIONARIO
        Funcionario ademir = new Funcionario("Ademir ","21900750","92929282333",3132,
                600.00,"RUA SÃO FRANCISCO","Faz Tudo","13/11",lasVegas,true);

        // CRIANDO QUARTO
        Apartamento basic = new Apartamento(1,"BASIC",true);
        Apartamento premium = new Apartamento(2,"PREMIUM",true);
        Apartamento deluxe = new Apartamento(3,"DELUXE",true);

        lasVegas.addApartamento(basic);
        lasVegas.addApartamento(premium);
        lasVegas.addApartamento(deluxe);

        // CADASTRANDO O GERENTE NO SISTEMA
        lasVegas.contrataGerente(artur);

        // CADASTRANDO O FUNCIONARIO NO SISTEMA
        artur.contrataFuncionario(ademir);

        // CRIANDO DADOS PARA UM HOSPEDE
        Hospede juninho = new Hospede("Juninho","23929219121","304282845",4328);
        Hospede anderson = new Hospede("Anderson","382821332","32828211",9393);
        Hospede michel = new Hospede("Michel","3222821332","313828211",2421);

        // CADASTRANDO O CLIENTE NO SISTEMA
        ademir.cadastrarHospede(juninho);
        ademir.cadastrarHospede(anderson);
        ademir.cadastrarHospede(michel);

        // IMPRIMINDO LISTA DOS HOSPEDES E FUNCIONARIOS
        lasVegas.mostrarHospedes();
        lasVegas.mostrarFuncionarios();

        // CRIANDO UMA RESERVA
        Reserva gratis = new Reserva(anderson,premium,"14/11/2021","16/11/2021");
        Reserva dois = new Reserva(juninho,deluxe,"14/11/2021","15/11/2021");
        Reserva tres  = new Reserva(michel,basic,"15/11/2021","17/11/2021");


        // CADASTRANDO UMA RESERVA NO SISTEMA
        ademir.verificaDisponibilidade();
        ademir.criarReserva(gratis);
        ademir.criarReserva(dois);

        lasVegas.mostrarReservas();
        ademir.verificaDisponibilidade();

        lasVegas.mostrarReserva(gratis);
        lasVegas.mostrarReserva(dois);


        artur.demiteFuncionario(ademir);
        ademir.criarReserva(tres);

        ademir.consultaHospede(anderson);
        ademir.verificaDisponibilidade();

    }
}
