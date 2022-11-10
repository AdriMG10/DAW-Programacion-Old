public class EjemploFactorial {
    public static void main(String[] args) {
        
        final int num = 4;
        int resultado = 1;

        for (int i = num; i > 0; i--) 
            resultado *= i;
        
        System.out.println(num + "! es igual a: " + resultado);     
    }
}
