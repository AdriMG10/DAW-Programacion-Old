import java.util.Scanner;

public class ParImpar {
    public static void main (String[] args) {

        long num;
        String introduce = "Introduce un entero:";
        String par = "El entero introducido es par";
        String impar = "El entero introducido es impar";

        Scanner leer = new Scanner (System.in);

        System.out.println (introduce);
        num = leer.nextLong();

        if (num % 2 == 0) 
            System.out.println (par);

        else 
            System.out.println (impar);           
    }
}