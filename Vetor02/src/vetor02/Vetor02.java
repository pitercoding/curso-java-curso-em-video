/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor02;

import java.util.Scanner;

/**
 *
 * @author Piter
 */
public class Vetor02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] mes = {
                "Janeiro", "Fevereiro", "Março", "Abril",
                "Maio", "Junho", "Julho", "Agosto",
                "Setembro", "Outubro", "Novembro", "Dezembro"
            };   
        int[] tot = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o ano para verificar: ");
        int ano = scanner.nextInt();
        scanner.close();
        
        // Verifica se o ano é bissexto
         boolean bissexto = false;
         if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
             bissexto = true;
         }
         
         // Atualiza os dias de fevereiro se o ano for bissexto
         if (bissexto) {
             tot[1] = 29; // Fevereiro está no índice 1
             System.out.println("Ano Bissexto!");
         }
        System.out.println("\nDias de cada mês no ano de " + ano + ":");
        
        for (int c=0; c<mes.length; c++){
            System.out.println("O mês de " + mes[c] + " tem " 
                    + tot[c] + " dias ao todo.");
        }
    }
    
}
