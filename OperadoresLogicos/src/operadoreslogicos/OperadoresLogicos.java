/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadoreslogicos;

/**
 *
 * @author Piter
 */
public class OperadoresLogicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x, y, z;
        x = 4;
        y = 7;
        z = 12;
        boolean r;
        // r = (x<y && y<z) ? true : false;
        // r = (x<y && y==z) ? true : false;
        // r = (x<y || y==z) ? true : false;
        r = (x<y ^ y==z) ? true : false;  //Ou exclusivo. Ou um ou outro
        System.out.println(r);
    }
    
}
