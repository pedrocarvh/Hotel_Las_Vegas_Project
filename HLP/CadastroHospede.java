package lasvegas;

public class CadastroHospede {

    private Hospede hospede;
    private int numApartamento;
    private float valorHospedagem;
    private int numeroDePessoas;
    private Reserva reserva;

    public CadastroHospede(Reserva reserva,int numApartamento, float valorHospedagem, int numeroDePessoas){
        this.reserva = reserva;
        this.numApartamento = numApartamento;
        this.valorHospedagem = valorHospedagem;
        this.numeroDePessoas = numeroDePessoas;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public int getNumApartamento() {
        return numApartamento;
    }

    public void setNumApartamento(int numApartamento) {
        this.numApartamento = numApartamento;
    }

    public float getValorHospedagem() {
        return valorHospedagem;
    }

    public void setValorHospedagem(float valorHospedagem) {
        this.valorHospedagem = valorHospedagem;
    }

    public int getNumeroDePessoas() {
        return numeroDePessoas;
    }

    public void setNumeroDePessoas(int numeroDePessoas) {
        this.numeroDePessoas = numeroDePessoas;
    }
}
