package exercicios.ConversorTemperatura;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    ConversorTemperatura conversor = new ConversorTemperatura();

    System.out.println("==== Conversor de Temperatura ====");
    System.out.println("1 - Celsius -> Fahrenheit");
    System.out.println("2 - Fahrenheit -> Celsius");
    System.out.print("Escolha uma opção: ");
    int opcao = input.nextInt();

    if (opcao == 1) {
        System.out.print("Digite a temperatura em Celsius: ");
            double celsius = input.nextDouble();
            double fahrenheit = conversor.celsiusToFahrenheit(celsius);
            System.out.printf("Resultado: %.2f °F\n", fahrenheit);
    } else if (opcao == 2) {
        System.out.print("Digite a temperatura em Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        double celsius = conversor.fahrenheitToCelsius(fahrenheit);
        System.out.printf("Resultado: %.2f °C\n", celsius);
    } else {
        System.out.println("Opção inválida!");
    }

    input.close();

    }
}
