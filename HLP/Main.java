package lasvegas;


import java.lang.reflect.GenericArrayType;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Hotel lasVegas = new Hotel();

        Gerente artur = new Gerente("Artur","38281243832","383729",1204,
                500.00,lasVegas);
        Funcionario ademir = new Funcionario("Ademir ","21900750","92929282333",3132,17,
                "Gerente",(short) 5,15,lasVegas);

        lasVegas.contrataGerente(artur);
        artur.contrataFuncionario(ademir);

        Hospede juninho = new Hospede("Juninho","23929219121","304282845",4328);
        Hospede anderson = new Hospede("Anderson","382821332","32828211",9393);

        ademir.cadastrarHospede(juninho);
        ademir.cadastrarHospede(anderson);
        lasVegas.mostrarHospedes();
        lasVegas.mostrarFuncionarios();


       //Calendar c = Calendar.getInstance();
       //Date data = c.getTime();
       //DateFormat h = DateFormat.getDateInstance(DateFormat.SHORT);
       //System.out.println(h.format(data));

    }
}
