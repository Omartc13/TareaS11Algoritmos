
package Problema3;


public class VueltaString {
    
        public String Voltear(String oracion) {
 
        String oracionNueva= " ";
        //Definimos el ultimo caracter de la oracion en una variable
        char caracterFinal = oracion.charAt(oracion.length() - 1);
        
        //Fase basica: Si la oración tiene 1 letra, devuelve la misma oracion
        if (oracion.length() == 1) {
            return oracion;
            
        } else {
            //Esta variable actualizará la oración desde el index 0 hasta el index final  -1
            oracionNueva = oracion.substring(0, oracion.length()-1);
        }
        
        //Fase iterativa: Concatenará el caracter final y llamará al método nuevamente, ahora con un index menos (Ejm: "Y dale U" ---> "Y dale ")
        return caracterFinal + Voltear(oracionNueva);
    }
}

    

