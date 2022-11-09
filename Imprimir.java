/**
 *  Adri
 */
public class Imprimir {
    public static void main(String[] args) {

        String nombre = "Adri";         

        int edad = 19;

        String primero = "Primero";
        String segundo = "Segundo";
        String tercero = "Tercero";

        int a = 2;
        double b = 6.3;
        double resultado = 1.5;
        

        System.out.printf("Hola\n");                                                    //Ejercicio 1

        System.out.printf("Hola %s\n", nombre);                                         //Ejercicio 2

        System.out.printf("Hola, me llamo %s y tengo %s años\n", nombre, edad);         //Ejercicio 3

        System.out.printf("Nombre: %s\nEdad: %s\n", nombre, edad);                      //Ejercicio 4

        System.out.printf("%s\\%s\\%s\n", primero, segundo, tercero);                   //Ejercicio 5

        System.out.printf("%.1f/%s = %.1f\n", b, a, resultado);                         //Ejercicio 6
    }
}
