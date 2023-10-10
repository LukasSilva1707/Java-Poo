public class App {
    public static void main(String[] args) throws Exception {

        Filme filme = new Filme();

        filme.setNome("Interestelar");
        filme.setAnoDeLancamento(2014);
        filme.setIncluidoNoPlano(true);

        System.out.println("Nome do filme: " + filme.getNome());
        System.out.println("Seu ano de lançamento foi: " + filme.getAnoDeLancamento());
        System.out.println("ele esta incluido no seu plano? " + filme.isIncluidoNoPlano());

    }
}
