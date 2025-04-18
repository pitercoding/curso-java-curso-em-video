package exercicios.VerificadorPalindromo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VerificadorPalindromo verificador = new VerificadorPalindromo();

        System.out.println("Digite uma palavra ou frase:");
        String entrada = scanner.nextLine();

        boolean resultado = verificador.verificar(entrada);

        if (resultado) {
            System.out.println("É um palíndromo!");
        } else {
            System.out.println("Não é um palíndromo.");
        }

        scanner.close();
    }
}
