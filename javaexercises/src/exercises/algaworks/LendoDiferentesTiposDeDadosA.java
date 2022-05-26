package exercises.algaworks;

import java.util.Scanner;

public class LendoDiferentesTiposDeDadosA {
    public static void main(String[] args) {
        System.out.println("====================");

        Scanner scanner = new Scanner(System.in);
        //*****************************************
        System.out.print(" >>> Digite um decimal: ");
        double numeroDecimal = scanner.nextDouble();
        System.out.println("O número decimal digitado " + "foi " + numeroDecimal);

        //*************************************

        System.out.print(" >>> Digite um Inteiro: ");
        int numeroInteiro = scanner.nextInt();
        System.out.println("O número Inteiro digitado " + "foi " + numeroInteiro);

        //*************************************

        System.out.print(" >>> Digite um boolean(true ou false): ");
        boolean booleano = scanner.nextBoolean();
        System.out.println("O booleando digitado" + "foi " + booleano);

        //*************************************

        scanner.close();

        System.out.println("Fim");
        System.out.println("*********************************************");
    }
}

