public class EjemploNMultiplos {

    static int N = 3;

    static int NUM = 7;

    public static void main(String[] args) {

        int i = NUM;

        while (i <= (N * NUM)) {
            System.out.println(i);
            i = i + NUM;
        }
    }
}
