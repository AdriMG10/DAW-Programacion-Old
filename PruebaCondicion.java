/**
 *  Adri
 */
public class PruebaCondicion {
    public static void main(String[] args) {
        
        int a=2;
        int b=2;

        String A= a + " es mayor que " + b;
        String B= b + " es mayor que " + a;
        String Iguales= a + " y " + b + " son iguales";

        if (a>b) {
            System.out.println(A);
        }

        else {
            if (b>a) {
                System.out.println(B);
            }
            else {
                System.out.println(Iguales);    
            }             
        }

        String resultado = (a>=b)?A:B;
        System.out.println(resultado);  
    }
}
