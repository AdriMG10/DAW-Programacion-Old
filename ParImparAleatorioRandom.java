/**
 *  Adri
 */

import java.util.Random;

public class ParImparAleatorioRandom {
    public static void main (String[] args) {

        Random random = new Random();

        int upperbound = 101;

        int numalea = random.nextInt(upperbound);

        String par = numalea + " es par";
        String impar = numalea + " es impar";

        if (numalea % 2 == 0) 
            System.out.println (par);

        else 
            System.out.println (impar);           
    }
}