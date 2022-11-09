public class BucleAleatorioBreak {                                  //No sé hacerlo
    public static void main(String[] args) {
        
        final int MAX = 500;
        final int SALIR = 10;
        
        int numrandom = (int)Math.floor(Math.random()*MAX);

        String no = " no es el número"; 
        String si = " es el número!";
 
        for (int i = numrandom; i != SALIR; i = numrandom)

        System.out.println(numrandom + si);
    }
}
