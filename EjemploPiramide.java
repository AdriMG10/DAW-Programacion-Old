public class EjemploPiramide {
    public static void main(String[] args) {

        final int NUMFILAS = 10;

        String asterisco = "*";

        for (int altura = 1; altura <= NUMFILAS; altura++) {

            for (int espacio = 1; espacio <= NUMFILAS - altura; espacio++)
                System.out.print(" ");

            for (int asteriscos = 1; asteriscos <= (altura * 2) - 1; asteriscos++)
                System.out.print(asterisco);    

            System.out.println();
        }
    }
}
