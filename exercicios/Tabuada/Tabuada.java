package exercicios.Tabuada;

public class Tabuada {
    private int numero;

    // Construtor
    public Tabuada(int numero) {
        this.numero = numero;
    }

    // Método para mostrar a tabuada
    public void mostrarTabuada() {
        System.out.println("\n--- Tabuada do " + numero + " ---");
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}
