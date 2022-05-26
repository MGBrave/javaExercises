package exercises.algaworks;

public class Vetores {
    public static void main(String[] args) {
        System.out.println("===============================");

        double[] precoProdutos = new double[]{ 150.0, 20.0, 30.0, 100.0 };

        double precoProduto = precoProdutos[2];

        System.out.println("O preço do segundo produto é " + precoProduto);
        // Alterando o valor da posição 2 (de índice 1).
        precoProdutos[1] = 41.0;
        System.out.println("O segundo produto teve seu preço alterado.");
        // Vai imprimir 41.0 ao invés de 20.0.
        // Repare também que estou mandando imprimir diretamente
        // pelo array, sem a intermediação de uma variável como
        // foi na impressão do trecho anterior.
        System.out.println("O preço do segundo produto é " + precoProdutos[1]);

        System.out.println("\nFim!");
        System.out.println("===============================");
    }
}
