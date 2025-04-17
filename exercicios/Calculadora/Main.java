import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite a operação (+, -, *, /): ");
        String op = scanner.next();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        double resultado = 0;

        switch (op) {
            case "+":
                resultado = calc.somar(num1, num2);
                break;
            case "-":
                resultado = calc.subtrair(num1, num2);
                break;
            case "*":
                resultado = calc.multiplicar(num1, num2);
                break;
            case "/":
                resultado = calc.dividir(num1, num2);
                break;
            default:
                System.out.println("Operação inválida.");
                return;
        }

        System.out.println("Resultado: " + resultado);
        scanner.close();
    }
}

