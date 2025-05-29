/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programamedia;

import java.util.Scanner;

/**
 *
 * @author camil
 */
public class ProgramaMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in); //Criando objeto
        System.out.print("Primeira Nota: "); //Pedindo primeira nota
        float n1 = teclado.nextFloat(); //Colocando primeira nota em n1
        System.out.print("Segunda Nota: "); //Pedindo segunda nota
        float n2 = teclado.nextFloat(); //Colocando segunda nota em n2
        float m = (n1 + n2) / 2; //Calculandom média
        System.out.println("A média é " + m); //Lendo média
        
        //Condição para saber se foi aprovado
        if (m > 7){
            System.out.println("Parabéns! Aprovado.");
        }
    }
    
}
