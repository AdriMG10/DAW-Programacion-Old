public class EjemploWhile {
    public static void main(String[] args) {
        
        int i = 1;
        int a = 5;

        while (i <= 5) {
            System.out.println("i: " + i);
            i++;                          //Es igual a i = i + 1
        }

        while (a > 0) {
            System.out.println("a: " + a);
            a--;                          
        }
    }
}
