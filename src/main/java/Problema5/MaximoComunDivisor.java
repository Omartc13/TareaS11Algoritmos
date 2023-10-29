
package Problema5;


public class MaximoComunDivisor {

    public int CalcularMCD(int numMayor, int numMenor) {

        //Fase básica: Si el residuo, el cual será el numero menor debido a la recursividad, es 0, el MCD será el número menor, el cual pasará a sobreescribir al número mayor por la recursividad
        if (numMenor == 0) {
            return numMayor;

        } else {
            //Fase recursiva: El numero menor pasará a ser el número mayor y el divisor será ahora el residuo
            return CalcularMCD(numMenor, numMayor % numMenor);
        }
    }
}




