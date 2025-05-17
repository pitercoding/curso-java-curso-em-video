package idiomasistema;

import java.util.Locale;

public class IdiomaSistema {
    public static void main(String[] args) {
        Locale idioma = Locale.getDefault();
        System.out.print("O idioma do seu sistema está configurado para: ");
        System.out.println(idioma.getDisplayLanguage());
    }
    
}
