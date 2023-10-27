package Problema1;

/**
 *
 * @author Omar Tc
 */
public class DecAHEx {

//    public int decAHexa(int n){
//        String hex
//        if (n<=9) {
//            return n;
//        }
//        if (n<=10) {
//            
//        }
//        
//    }
    public int convertirhexa(int n) {
        if (n <= 9) {
            n = n;
        }
        if (n >= 10 || n <= 15) {

            switch (n) {
                case 10:
                    n = Integer.parseInt("A");
                    break;
                case 11:
                    n = Integer.parseInt("B");
                    break;
                case 12:
                    n = Integer.parseInt("C");
                    break;
                case 13:
                    n = Integer.parseInt("D");
                    break;
                case 14:
                    n = Integer.parseInt("E");
                    break;
                case 15:
                    n = Integer.parseInt("F");
                    break;

            }

        }
        return n;
    }

}
