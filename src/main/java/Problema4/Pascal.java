package Problema4;

/**
 *
 * @author Omar Tc
 */
public class Pascal {
    
    public  int combinacionesRecursivo(int n, int m){
       
        if (m==0 || n==m) { //estado base
            return 1;   
        }
        return combinacionesRecursivo(n-1, m-1)+combinacionesRecursivo(n-1, m);
    }
    
    public int CombinacionIterativa(int n, int m) {
        int resultado = 1;
        for (int i = 0; i < m; i++) {
            resultado *= (n - i);
            resultado /= (i + 1);
        }
        return resultado;
    }
    
    public int CombinacionIterativaTrianguloPascal(int n, int m) {
        int[][] pascal = new int[n + 1][m + 1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= Math.min(i, m); j++) {
                if (j == 0 || j == i) {
                    pascal[i][j] = 1;
                } else {
                    pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
                }
            }
        }
        return pascal[n][m];
    }

    
}
