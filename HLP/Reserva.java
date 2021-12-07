package lasvegas;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva {

    private Hospede hospede;
    private Funcionario funcionario;
    private boolean statusReserva;
    private String dataEntrada;
    private String dataSaida;
    public Hotel hotel;
    private String tipoApartamento;
    private int codigo;
    private Apartamento apartamento;
    private double valorReserva;


    public Reserva(Hospede hospede,Apartamento apartamento, String dataEntrada){
        this.apartamento = apartamento;
        this.hospede = hospede;
        this.dataEntrada = dataEntrada;
    }
    public Reserva(Hospede hospede,Apartamento apartamento, String dataEntrada,String dataSaida){
        this.apartamento = apartamento;
        this.hospede = hospede;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
    }

    public boolean isStatusReserva() {
        return statusReserva;
    }

    public void setStatusReserva(boolean statusReserva) {
        this.statusReserva = statusReserva;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = this.dataEntrada;
    }

    public String getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(String dataSaida) {
        this.dataSaida = dataSaida;
    }

    public String getTipoApartamento() {
        return tipoApartamento;
    }

    public void setTipoApartamento(String tipoApartamento) {
        this.tipoApartamento = tipoApartamento;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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
        return apartamento.getPreco();
    }

    public void reserveDate(){
        Calendar c = Calendar.getInstance();
        Date data = c.getTime();
        DateFormat h = DateFormat.getDateInstance(DateFormat.SHORT);
        System.out.println("-Reserve Date  ...  "+ h.format(data));
    }

    public long diferencaDatas() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dataUm = sdf.parse(this.dataEntrada);
        Date dataDois = sdf.parse((this.dataSaida));
        long diffEmMil = Math.abs(dataDois.getTime()- dataUm.getTime());
        long diff = TimeUnit.DAYS.convert(diffEmMil,TimeUnit.MILLISECONDS);
        return diff;
    }
    public double cobrarReserva() throws ParseException {
        double cobranca;
        cobranca = (this.diferencaDatas()+1)*this.getApartamento().getPreco();
        return cobranca;
    }
}

