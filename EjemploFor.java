public class EjemploFor {
    public static void main(String[] args) {
        
        int i;
        
        for (i = 0; i < 5; i++)                 //for (i=0; condición, última línea código)
            System.out.println("i: " + i);

        for (int a = 5; a > 0; a--)             //Declaramos el entero 'a' en el propio for y hace que su scope sea solo el for
            System.out.println("a: " + a);      //La letra i se suele usar como contador en bucles
    }
}
