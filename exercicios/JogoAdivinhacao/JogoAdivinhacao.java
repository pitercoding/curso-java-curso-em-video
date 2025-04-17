package exercicios.JogoAdivinhacao;

import java.util.Scanner;

public class JogoAdivinhacao {

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);

        int numeroSecreto = (int) (Math.random() * 100) + 1; // número entre 1 e 100
        int tentativa = 0;
        int contadorTentativas = 0;

        System.out.println("Jogo de Adivinhação");
        System.out.println("Tente adivinhar o número entre 1 e 100!");

        while (tentativa != numeroSecreto) {
            System.out.print("Digite seu palpite: ");
            tentativa = scanner.nextInt();
            contadorTentativas++;

            if (tentativa < numeroSecreto) {
                System.out.println(" O número é maior!");
            } else if (tentativa > numeroSecreto) {
                System.out.println(" O número é menor!");
            } else {
                System.out.println(" Parabéns! Você acertou em " + contadorTentativas + " tentativas.");
            }
        }

        scanner.close();
    }

    // Método principal para rodar o jogo
    public static void main(String[] args) {
        JogoAdivinhacao jogo = new JogoAdivinhacao();
        jogo.iniciar();
    }
}
