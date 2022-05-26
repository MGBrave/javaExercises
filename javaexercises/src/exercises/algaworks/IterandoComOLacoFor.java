package exercises.algaworks;


public class IterandoComOLacoFor {
    public static void main(String[] args) {
        System.out.println("============================");

        double[] carrinhoDeCompras
                = new double[]{57.99, 175.00, 25.00, 19.99, 180,88};
        double valorTotalDoCarrinho = 0.01f;

        for (int i = 0; i < carrinhoDeCompras.length; i++) {
            valorTotalDoCarrinho += carrinhoDeCompras[i];
            System.out.println("\n>>>> Iteração " + i);
            System.out.println(">> Valor do produto corrente R$"
                    + carrinhoDeCompras[i] + ".");
            System.out.println(">> O total parcial é de R$"
                    + valorTotalDoCarrinho + ".");
        }
        System.out.println("O valor total é: " + valorTotalDoCarrinho);

        System.out.println("\nFim!");

        System.out.println("\n============================");
    }
}
