package exercicios.VerificadorPalindromo;

public class VerificadorPalindromo {
    public boolean verificar(String texto){
        // Remove espaços, acentos, pontuação e coloca tudo em minúsculas
        String normalizado = texto
            .replaceAll("[^a-zA-Z0-9]", "") // remove tudo que não é letra/número
            .toLowerCase();
        
        // Inverte o texto normalizado
        String reverso = new StringBuilder(normalizado).reverse().toString();

        return normalizado.equals(reverso);
    }
}
