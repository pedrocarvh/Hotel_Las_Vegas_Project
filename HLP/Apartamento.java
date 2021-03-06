package lasvegas;

public class Apartamento {

    private final int numApartamento;
    private final String tipoApartamento;
    private boolean disponibilidade;
    private double preco;

    public Apartamento(int numApartamento, String tipoApartamento, boolean disponibilidade){
        this.numApartamento = numApartamento;
        this.tipoApartamento = tipoApartamento;
        this.disponibilidade = disponibilidade;
    }

    public int getNumApartamento(){
        return numApartamento;
    }

    public String getTipoApartamento() {
        return tipoApartamento;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public double getPreco() {
        switch (this.tipoApartamento){
            case "BASIC":
                this.preco = 100.00;
                break;
            case "PREMIUM":
                this.preco = 300.00;
                break;
            case "DELUXE":
                this.preco = 600.00;
                break;
        }
        return  preco;
    }
}
