/**
 *  Adri
 */
public class PruebaConversionNoSegura {
    public static void main (String[] args) {
        //Declaro variable doble a
        double a;
        //Declaro variable entera b
        int b;
        //Inicializo a con el valor 99
        a = 99;
        //Asigno la variable b con el valor de la variable a
        b = (int)a;
        //Imprimo el valor de a
        System.out.println ("Valor de a: " + a);
        //Imprimo el valor de b
        System.out.println ("Valor de b: " + b);
    } 
}

