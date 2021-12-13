package lasvegas;

import java.text.ParseException;

public class Main {

    public static void main(String[] args) throws ParseException {

        Hotel lasVegas = new Hotel();

        // CRIANDO DADOS PARA UM GERENTE
        Gerente artur = new Gerente("Artur","38281243832","383729", lasVegas);

        // CRIANDO DADOS PARA UM FUNCIONARIO
        Recepcionista ademir = new Recepcionista("Ademir ","21900750","92929282333",
                "RUA SÃO FRANCISCO","Faz Tudo","13/11",lasVegas,true);

        /* Funcionario pedro = new Funcionario();
        Scanner id = new Scanner(System.in);

        System.out.println("Nome");
        pedro.setNome(id.nextLine());

        System.out.println("RG: ");
        pedro.setRg(id.nextLine());

        System.out.println("CPF: ");
        pedro.setCpf(id.nextLine());

        System.out.println("REGISTRO: ");
        pedro.setidFuncionario(id.nextInt());

        System.out.println("SALARIO: ");
        pedro.setSalario(id.nextDouble());

        //Esvaziando o buffer
        id.nextLine();

        System.out.println("ENDERECO: ");
        pedro.setEndereco(id.nextLine ());

        System.out.println("FUNÇÃ0: ");
        pedro.setAtividade(id.nextLine());

        System.out.println("DATA DE ADMISSÃO ");
        pedro.setDataAdmissao(id.nextLine());

         */

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
        //artur.contrataFuncionario(pedro);

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
        System.out.println(anderson.getCodCliente());


    }
}
