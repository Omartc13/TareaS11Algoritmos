package Problema1;

/**
 *
 * @author Omar Tc
 */
public class Preuba {

    public static void main(String[] args) {

        int n = 65029;
        
    }

    
    
    public int hexa(int n) {
        int residuo;
        residuo = n % 16;
        String cadena = "";
        
        n = hexa(n / 16);
        cadena = cadena + residuo;
        return Integer.parseInt(cadena);
    }
}
