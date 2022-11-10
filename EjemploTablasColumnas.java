public class EjemploTablasColumnas {

    private static final int N = 10;
    public static void main(String[] args) {

        for (int i = 1; i <= N; i++) {
            System.out.print("Tabla del " + i + "\t");
        }

        System.out.print("\n");

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                System.out.print(i + " x " + j + " = " + i * j + "\t");
            }

            System.out.print("\n");
        }
    }
}

