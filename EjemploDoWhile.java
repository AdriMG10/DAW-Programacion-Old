public class EjemploDoWhile {

    public static void main(String[] args) {
        
        int i = 0;
        int a = 5;

        do {
            System.out.println("i: " + i);
            i++;
        } while (i <= 5);

        do {
            System.out.println("a: " + a);
            a--;
        } while (a > 0);
    }
}
