public class BucleAleatorio {
    public static void main(String[] args) {
        
        final int MAX = 500;
        final int SALIR = 10;
        
        int numrandom = (int)Math.floor(Math.random()*MAX);

        String no = " no es el número"; 
        String si = " es el número!";
 
        while (numrandom != SALIR) {
            System.out.println(numrandom + no );
            numrandom = (int)Math.floor(Math.random()*MAX);   
        }

        System.out.println(numrandom + si);
    }
}
