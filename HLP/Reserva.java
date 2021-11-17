package lasvegas;

import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva {

    private Hospede hospede;
    private Funcionario funcionario;
    private boolean reserveStatus;
    private String arrivalDate;
    private String exitDate;
    public Hotel hotel;
    private String tipoApartamento;
    private int code;
    private Apartamento apartamento;
    private double valorReserva;


    public Reserva(Hospede hospede,Apartamento apartamento, String arrivalDate){
        this.apartamento = apartamento;
        this.hospede = hospede;
        this.arrivalDate = arrivalDate;
    }
    public Reserva(Hospede hospede,Apartamento apartamento, String arrivalDate,String exitDate){
        this.apartamento = apartamento;
        this.hospede = hospede;
        this.arrivalDate = arrivalDate;
        this.exitDate = exitDate;
    }

    public boolean isReserveStatus() {
        return reserveStatus;
    }

    public void setReserveStatus(boolean reserveStatus) {
        this.reserveStatus = reserveStatus;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getExitDate() {
        return exitDate;
    }

    public void setExitDate(String exitDate) {
        this.exitDate = exitDate;
    }

    public String getTipoApartamento() {
        return tipoApartamento;
    }

    public void setTipoApartamento(String tipoApartamento) {
        this.tipoApartamento = tipoApartamento;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Hospede getHospede() {
        return hospede;
    }

    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }

    public Apartamento getApartamento() {
        return apartamento;
    }

    public void setApartamento(Apartamento apartamento) {
        this.apartamento = apartamento;
    }

    public double getValorReserva() {
        return apartamento.getPrice();
    }

    public void reserveDate(){
        Calendar c = Calendar.getInstance();
        Date data = c.getTime();
        DateFormat h = DateFormat.getDateInstance(DateFormat.SHORT);
        System.out.println("-Reserve Date  ...  "+ h.format(data));
    }

    public long diferencaDatas() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dataUm = sdf.parse(this.arrivalDate);
        Date dataDois = sdf.parse((this.exitDate));
        long diffEmMil = Math.abs(dataDois.getTime()- dataUm.getTime());
        long diff = TimeUnit.DAYS.convert(diffEmMil,TimeUnit.MILLISECONDS);
        return diff;
    }
    public double cobrarReserva() throws ParseException {
        double cobranca;
        cobranca = (this.diferencaDatas()+1)*this.getApartamento().getPrice();
        return cobranca;
    }
}
