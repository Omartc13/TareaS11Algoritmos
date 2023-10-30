package Problema2;

import java.util.Scanner;

/**
 *
 * @author Omar Tc
 */
public class Palindromo {

    public boolean compro(String cad) {
        cad=cad.replaceAll("\\s", "");
        if (cad.length()<=1) {
            return true;
        }
        
        if (cad.charAt(0)!=cad.charAt(cad.length()-1)) {
            return false;
        }
        
        return compro(cad.substring(1,cad.length()-1));
    }

    public String vuel(String cadena) {
        char[] letras = new char[cadena.length()];
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < cadena.length(); i++) {
            char le = cadena.charAt(i);
            letras[i] = le;
        }
        for (int j = letras.length - 1; j >= 0; j--) {
            resultado.append(letras[j]);
        }
        return cadena = resultado.toString();
    }
}
