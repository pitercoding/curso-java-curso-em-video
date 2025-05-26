package tiposprimitivos;

import java.util.Scanner;

public class TiposPrimitivos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.print("Digite a nota do aluno: ");
        float nota = teclado.nextFloat();
        // float nota = (float) 8.5;  #Forma alternativa. Declaração com Typecast
        
        // System.out.print("A nota é " + nota); #Sem pular linha
        // System.out.println("A nota é " + nota); #Pulando linha
        // System.out.printf("A nota de %s é %.2f \n", nome,  nota); #printf formata, nese caso o (%) nome/número com (.2) duas casas decimais, (\n) pula linha
        System.out.format("A nota de %s é %.2f \n", nome,  nota); //Mesma coisa que "printf". Format formata, nese caso o (%) nome/número com (.2) duas casas decimais, (\n) pula linha
    }
    
}
