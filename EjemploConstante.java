public class EjemploConstante {
    final static int MAX = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Integer a, b, c, resmul, resmax;
        double respot;

        a = 2;
        b = 3;
        c = 4;
        
        resmul = (a + b) * c;

        respot = Math.pow(a, b);

        resmax = Math.max(a, MAX);
        
        System.out.println(resmul);
        System.out.println(respot);  
        System.out.println(MAX);
        System.out.println(resmax);


    }
}
