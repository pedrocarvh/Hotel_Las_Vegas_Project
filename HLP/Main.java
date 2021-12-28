package lasvegas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Hotel lasVegas = new Hotel();

        // CRIANDO DADOS PARA UM GERENTE
        Gerente artur = new Gerente("Artur","38281243832","383729", lasVegas);

        // CRIANDO DADOS PARA UM FUNCIONARIO
        Recepcionista ademir = new Recepcionista("Ademir ","21900750","92929282333",
                "RUA SÃO FRANCISCO",lasVegas);

        // CRIANDO QUARTOS
        Apartamento basic = new Apartamento(1,"BASIC",true);
        Apartamento premium = new Apartamento(2,"PREMIUM",true);
        Apartamento deluxe = new Apartamento(3,"DELUXE",true);

        // CADASTRANDO NO SISTEMA
        lasVegas.adicionarApartamento(basic);
        lasVegas.adicionarApartamento(premium);
        lasVegas.adicionarApartamento(deluxe);

        // CADASTRANDO O GERENTE NO SISTEMA
        lasVegas.contratarGerente(artur);

        // CADASTRANDO O FUNCIONARIO NO SISTEMA
        artur.contratarFuncionario(ademir);

        // CRIANDO DADOS PARA UM HOSPEDE
        Hospede juninho = new Hospede("Juninho","23929219121","304282845");
        Hospede anderson = new Hospede("Anderson","382821332","32828211");
        Hospede michel = new Hospede("Michel","3222821332","313828211");

        // CADASTRANDO O CLIENTE NO SISTEMA
        ademir.cadastrarHospede(juninho);
        ademir.cadastrarHospede(anderson);
        ademir.cadastrarHospede(michel);

        // CRIANDO UMA RESERVA
        Reserva r1 = new Reserva(anderson,premium,"01/01/2022","16/01/2022");
        Reserva r2 = new Reserva(juninho,deluxe,"03/01/2022","07/01/2022");
        Reserva r3 = new Reserva(michel,basic,"15/11/2021","17/11/2021");

        // CADASTRANDO UMA RESERVA NO SISTEMA
        //ademir.verificaDisponibilidade();
        //ademir.criarReserva(r1);
        //lasVegas.mostrarReserva(r1);

        //ademir.verificaDisponibilidade();
        //ademir.criarReserva(r2);
        //lasVegas.mostrarReserva(r2);

        //ademir.verificaDisponibilidade();
        //ademir.criarReserva(r3);
        //lasVegas.mostrarReserva(r3);

        // CONSULTA DE RESERVAS ATIVAS
        //lasVegas.mostrarReservas();
        //ademir.verificaDisponibilidade();

        int opcao;
        Scanner entrada = new Scanner(System.in);

        boolean loop = true;
        int cont = 0;

        while(loop){

            System.out.println("\n--HOTEL LAS VEGAS --\n");
            System.out.println("1-Mostrar Quartos Disponiveis");
            System.out.println("2-Criar Reserva");
            System.out.println("3-Mostrar Todas Reservas");
            System.out.println("4-Sair\n");

            opcao = entrada.nextInt();

            switch (opcao){
                case 1:
                    ademir.verificarDisponibilidade();
                    break;
                case 2:
                    switch (cont){
                        case 0:
                            ademir.criarReserva(r1);
                            lasVegas.mostrarReserva(r1);
                            cont++;
                            break;
                        case 1:
                            ademir.criarReserva(r2);
                            lasVegas.mostrarReserva(r2);
                            cont++;
                            break;
                        case 2:
                            ademir.criarReserva(r3);
                            lasVegas.mostrarReserva(r3);
                            cont++;
                            break;
                        default:
                            System.out.println("Todas reservas foram feitas");
                    }
                    break;

                case 3:
                    lasVegas.mostrarReservas();
                    break;
                case 4:
                    loop = false;
                    System.out.println("Encerrado");
                    break;
            }
        }
    }
}
