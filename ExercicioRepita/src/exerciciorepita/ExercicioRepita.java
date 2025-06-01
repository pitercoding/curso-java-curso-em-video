/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciorepita;

import javax.swing.JOptionPane;
/**
 *
 * @author camil
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, s=0, tot=-1, par=-1, impar=0, cem=0;
        float media;
        
        do {
          n = Integer.parseInt(JOptionPane.showInputDialog(null, 
                  "<html>Informe um número: <br><em>(Valor 0 interrompe)</em></html>"));  
          
          s += n; // Somatório dos números
          
          tot++; // Total de números digitados
          
          if (n % 2 == 0){ //Testando e incrementando se é par
              par++;
          } else {
              impar++; //Testando e incrementando se é impar
          }
          
          if (n>=100){ // Testando e incrementando números acima de 100
              cem++;
          }
          
        } while (n != 0);
        media = s / tot; // Média
        
        JOptionPane.showMessageDialog(null, "<html>Resultado Final <hr>" 
                + "<br>Somatório: " + s 
                + "<br>Total de Números: " + tot 
                + "<br>Total de Pares: " + par
                + "<br>Total de Ímpares: " + impar
                + "<br>Total Acima de 100: " + cem
                + "<br>Média dos Valores: " + media
                + "</html>");
        
    }
    
}
