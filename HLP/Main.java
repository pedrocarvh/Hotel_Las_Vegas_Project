package lasvegas;

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
        lasVegas.addApartamento(basic);
        lasVegas.addApartamento(premium);
        lasVegas.addApartamento(deluxe);

        // CADASTRANDO O GERENTE NO SISTEMA
        lasVegas.contrataGerente(artur);

        // CADASTRANDO O FUNCIONARIO NO SISTEMA
        artur.contrataFuncionario(ademir);

        // CRIANDO DADOS PARA UM HOSPEDE
        Hospede juninho = new Hospede("Juninho","23929219121","304282845");
        Hospede anderson = new Hospede("Anderson","382821332","32828211");
        Hospede michel = new Hospede("Michel","3222821332","313828211");

        // CADASTRANDO O CLIENTE NO SISTEMA
        ademir.cadastrarHospede(juninho);
        ademir.cadastrarHospede(anderson);
        ademir.cadastrarHospede(michel);

        // IMPRIMINDO LISTA DOS HOSPEDES E FUNCIONARIOS
        lasVegas.mostrarFuncionarios();

        // CRIANDO UMA RESERVA
        Reserva r1 = new Reserva(anderson,premium,"01/01/2022","16/01/2022");
        Reserva r2 = new Reserva(juninho,deluxe,"03/01/2022","07/01/2022");
        Reserva r3 = new Reserva(michel,deluxe,"15/11/2021","17/11/2021");

        // CADASTRANDO UMA RESERVA NO SISTEMA
        ademir.verificaDisponibilidade();
        ademir.criarReserva(r1);
        lasVegas.mostrarReserva(r1);

        ademir.verificaDisponibilidade();
        ademir.criarReserva(r2);
        lasVegas.mostrarReserva(r2);

        ademir.verificaDisponibilidade();
        ademir.criarReserva(r3);
        lasVegas.mostrarReserva(r3);

        // CONSULTA DE RESERVAS ATIVAS
        lasVegas.mostrarReservas();
        ademir.verificaDisponibilidade();

    }
}
