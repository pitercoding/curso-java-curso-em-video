/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadoresaritmeticos;

/**
 *
 * @author Piter
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Operadores Aritméticos (+ - * / %)
        int n1 = 3;
        int n2 = 5;
        float m = (n1 + n2) / 2;
        System.out.println("A média é igual a " + m);
        
        // Operadores Unários (++ --)
        int numero = 5;
        int valor = 5 + ++numero;
        System.out.println("Valor está valendo: " + valor);
        System.out.println("O valor de numero é: " + numero);
        
        // Operadores de Atribuição (+= -= *= /= %=)
        int x = 4;
        x += 2; // x = x + 2
        System.out.println("O valor de x é: " + x);
        
        // Classe Math -> Arredondamentos (Math.abs Math.floor Math.ceil Math.round)
        float v = 8.9f;
        int ar = (int) Math.floor(v);
        System.out.println("Arredondando pra baixo: " + ar);
        
        // Valor aleatório
        double ale = Math.random();
        System.out.println("Gerando valor aleatório: " + ale);
                
    }
    
}
