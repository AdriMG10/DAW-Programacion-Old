public class EjemploSumaMultiplos3y5 {
    public static void main(String[] args) {

        final int TRES = 3;
        final int CINCO = 5;

        int suma3 = 0;
        int suma5 = 0;
        int sumatotal = 0;

        final int N = 3;

        for (int i = 1; i <= (TRES * N); i++) {
            if (i % 3 == 0)
                suma3 += i;   
        }

        System.out.println("Los primeros " + N + " múltiplos de 3 suman: " + suma3);

        for (int i = 1; i <= (CINCO * N); i++) {
            if (i % 5 == 0)
                suma5 += i;   
        }

        System.out.println("Los primeros " + N + " múltiplos de 5 suman: " + suma5);

        sumatotal = suma3 + suma5;

        System.out.println("La suma de los múltiplos de ambos es igual a: " + sumatotal);
    }
}
