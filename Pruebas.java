public class Pruebas {
    static int c = 4;
    public static void main(String[] args) {
        int a = 2;

        System.out.println(a);
        System.out.println(c);

        {
            int b = 3;
            System.out.println(b);
            System.out.println(c);
        }
    }

    void miMetodo () {
        System.out.println(c);
    }
}
