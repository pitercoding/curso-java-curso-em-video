/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor05;

import java.util.Arrays;

/**
 *
 * @author Piter
 */
public class Vetor05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int v[] = new int[20];
        Arrays.fill(v, 0);
        for (int valor: v){
            System.out.print(valor + " ");
        }
        
        System.out.println("\n");
        
        int vetor[] = new int[30];
        Arrays.fill(vetor, 3);
        for (int valor: vetor){
            System.out.print(valor + " ");
        }
    }
    
}
