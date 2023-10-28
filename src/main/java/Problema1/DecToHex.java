
package Problema1;

public class DecToHex {

    /**
     *
     * @param numeroDecimal
     * @return
     */
    public String Convertir(int numeroDecimal) {

        int residuo = numeroDecimal % 16;
        String letra = " ";
        
        //Fase básica: Condición
        while (numeroDecimal > 0) {
            //Fase recursiva
            if (residuo < 10) {
                return Convertir(numeroDecimal / 16) + residuo;
            }
            
            switch (residuo) {
                case 10:
                    letra = "A";
                    break;
                case 11:
                    letra = "B";
                    break;
                case 12:
                    letra = "C";
                    break;
                case 13:
                    letra = "D";
                    break;
                case 14:
                    letra = "E";
                    break;
                case 15:
                    letra = "F";
                    break;
                case 16:
                    letra = "G";
                    break;
            }
            
             return Convertir(numeroDecimal / 16) + letra;
        }
        
        //Si numeroDecimal es menor a 0, no rregresar ningún valor
     return "";
    }
}
