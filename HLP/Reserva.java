package lasvegas;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva {

    private final Hospede hospede;
    private boolean statusReserva;
    private final String dataEntrada;
    private final String dataSaida;
    private String idReserva;
    private final Apartamento apartamento;

    public Reserva(Hospede hospede,Apartamento apartamento, String dataEntrada,String dataSaida){
        this.apartamento = apartamento;
        this.hospede = hospede;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.idReserva = this.geraCodReserva();
    }

    public String getCodigo() {
        return idReserva;
    }

    public Hospede getHospede() {
        return hospede;
    }

    public Apartamento getApartamento() {
        return apartamento;
    }

    public void dataReserva(){
        Calendar c = Calendar.getInstance();
        Date data = c.getTime();
        DateFormat h = DateFormat.getDateInstance(DateFormat.SHORT);
        System.out.println("-Reserve Date  ...  "+ h.format(data));
    }

    public long tempoEstadia() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dataUm = sdf.parse(this.dataEntrada);
        Date dataDois = sdf.parse((this.dataSaida));
        long diffEmMil = Math.abs(dataDois.getTime()- dataUm.getTime());
        return TimeUnit.DAYS.convert(diffEmMil,TimeUnit.MILLISECONDS);
    }

    public String geraCodReserva(){
        int id = 1000+ (int)(Math.random() * 9999);
        switch (this.apartamento.getTipoApartamento()){
            case "BASIC":
                idReserva = id+"-0";
                break;
            case "PREMIUM":
                idReserva = id+"-1";
                break;
            case "DELUXE":
                idReserva = id+"-2";
                break;
        }
        return idReserva;
    }

    @Override
    public String toString() {
        try {
            return
                    "\nCliente: " + hospede.getNome() +
                    "\nData Entrada: " + dataEntrada +
                    "\nData Saida: " + dataSaida +
                    "\nTipo Apartamento: " + apartamento.getTipoApartamento() +
                    "\nID Reserva: " + idReserva+
                    "\nValor Reserva: R$" + tempoEstadia()*apartamento.getPreco() +
                            "\n\n======= Reserva Concluida =======";
        } catch (ParseException e) {
            e.printStackTrace();
            return "error";
        }
    }
}

