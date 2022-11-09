public class PruebaMayorMenor {
    public static void main(String[] args) {

        int a = 6;
        int b = 2;

        int mayor = (a>b)? a:b;
        int menor = (a>b)? b:a;

        String resultado = "El mayor es: " + mayor + " y el menor es: " + menor;
       
        if (a>=b) {
            mayor = a;
        }
        else {
            mayor = b;
        }

        System.out.println(resultado);

    }
}
