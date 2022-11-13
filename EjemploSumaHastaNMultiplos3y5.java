public class EjemploSumaHastaNMultiplos3y5 {
    public static void main(String[] args) {

        int suma3 = 0;
        int suma5 = 0;
        int sumatotal = 0;

        final int N = 10;

        for (int i = 1; i <= N; i++) {
            if (i % 3 == 0)
                suma3 += i;   
        }

        for (int j = 1; j <= N; j++) {
            if (j % 5 == 0)
                suma5 += j; 
        }

        sumatotal = suma3 + suma5;

        System.out.println("La suma de los múltiplos de 3 y 5 hasta " + N + " es igual a: " + sumatotal);
    }
}
