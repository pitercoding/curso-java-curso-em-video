/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comparacaostring;

/**
 *
 * @author Piter
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome1 = "Piter";
        String nome2 = "Piter";
        String nome3 = new String("Piter");
        String res;
        
        //Mostra diferente devido a forma de criação do objeto
        // res = (nome1 == nome3)? "igual" : "diferente";
        
        //Mostra que o conteúdo é igual
        res = nome1.equals(nome3) ? "igual" : "diferente";
        System.out.println(res);
    }
    
}
