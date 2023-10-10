import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String produto = "teclado mecanico";
        int quantidade = 50, opcao = 0;

        imprimeValores(produto, quantidade);

        do {
            System.out.println("Escolha uma opção, por gentileza");
            System.out.println("1 - Consultar estoque");
            System.out.println("2 - Adicionar produtos");
            System.out.println("3 - Retirar produtos");
            System.out.println("4 - Mudar o nome do produto");
            System.out.println("5 - Sair");
            opcao = sc.nextInt();

            if (opcao == 1) {
                imprimeValores(produto, quantidade);
            }

            if (opcao == 2) {
                quantidade = adicionar(quantidade);
                estoqueBaixo(quantidade);
            }

            if (opcao == 3) {
                quantidade = retirar(quantidade);
                estoqueBaixo(quantidade);
            }

            if (opcao == 4) {
                produto = mudarNome(produto);
            }

        } while (opcao != 5);

        sair();

    }

    public static void imprimeValores(String produto, int quantidade) {
        System.out.println("nome do produto: " + produto);
        System.out.println("quantidade do produto é: " + quantidade);
        // System.out.println("valor da sua opção é: " + opcao);
    }

    public static int adicionar(int quantidade) {
        Scanner sc = new Scanner(System.in);
        int adicionaProduto;
        System.out.println("Digite quantos produtos deseja adicionar");
        adicionaProduto = sc.nextInt();
        return quantidade += adicionaProduto;
    }

    public static int retirar(int quantidade) {
        Scanner sc = new Scanner(System.in);
        int retiradaDeProdutos;
        System.out.println("Digite a quantidade de produtos que deseja retirar ");
        retiradaDeProdutos = sc.nextInt();
        return quantidade -= retiradaDeProdutos;
    }

    public static String mudarNome(String produto) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o novo nome para o Produto");
        return produto = sc.nextLine();
    }

    public static void sair() {
        System.out.println("Obrigado por usar nosso sistema :) ");
    }

    public static void estoqueBaixo(int quantidade) {
        if (quantidade <= 10) {
            System.out.println("Seu estoque esta baixo");
        }
    }
}
