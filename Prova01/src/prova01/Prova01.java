/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prova01;

/**
 *
 * @author Piter
 */
public class Prova01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int v0 = 3; // v0 começa com valor 3.
        int v1 = v0++; //v1 recebe o valor atual de v0 (que é 3), e depois v0 aumenta para 4.
        int v2 = ++v1; //v1 aumenta para 4, e então v2 recebe esse novo valor (4). 
        v1 += v0; // v1 aumenta pelo valor atual de v0 (que é 4), então v1 vira 8.
        v2 += --v1; //v1 diminui para 7, e então v2 aumenta por esse novo valor de v1, então v2 vira 4 + 7 = 11.
        
        System.out.println(v0);
        System.out.println(v1);
        System.out.println(v2);
    }
    
}
