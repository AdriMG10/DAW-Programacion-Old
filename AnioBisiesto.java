public class AnioBisiesto {
    /**
     * <p>Calcula si un año dado a través de una variable es un año bisiesto o no, mostrando este resultado en la consola.</p>
     * 
     * @author Adri
     * @version 1.0 
     * @param args main  
     * 
     */

    public static void main (String[] args) {

        int anio = 2022;                                                            //Creo la variable año y le asigno un año
        
        if (anio % 400 == 0)                                                        //Si el año es divisible entre 400:
            System.out.println ("El año " + anio + " es bisiesto");                 //Imprime que es bisiesto

        else 
            if ((anio % 4 == 0) && (anio % 100 != 0))                               //Si el año es divisible entre 4 y no divisible entre 100:
                System.out.println ("El año " + anio + " es bisiesto");             //Imprime que es bisiesto

            else
                System.out.println ("El año " + anio + " no es bisiesto");          //Si no, imprime que no es bisiesto    
    }
}