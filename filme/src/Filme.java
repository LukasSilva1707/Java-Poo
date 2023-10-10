public class Filme {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;

    // public Filme(String nome, int anoDeLancamento, boolean incluidoNoPlano) {
    // this.nome = nome;
    // this.anoDeLancamento = anoDeLancamento;
    // this.incluidoNoPlano = incluidoNoPlano;
    // }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

}
