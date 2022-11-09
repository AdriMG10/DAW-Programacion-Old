/**
 *  Adri
 */

import java.util.Scanner;

public class AnioBisiesto {

    public static void main (String[] args) {

        int anio;
        String introduce = "Introduce un año:";
        String bisiesto = "El año introducido es bisiesto";
        String nobisiesto = "El año introducido no es bisiesto";

        Scanner leer = new Scanner (System.in);

        System.out.println (introduce);
        anio = leer.nextInt();

        if (anio % 400 == 0) 
            System.out.println (bisiesto);

        else 
            if ((anio % 4 == 0) && (anio % 100 != 0))
                System.out.println (bisiesto);

            else
                System.out.println (nobisiesto);   
            
    }
}