package lasvegas;

public abstract class Pessoa{

    protected String nome;
    protected String cpf;
    protected String rg;
    protected String endereco;

    public abstract String toString();

    public String getNome() {
        return nome;
    }
}
