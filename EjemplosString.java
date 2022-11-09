public class EjemplosString {
    public static void main(String[] args) {

        //Crear una variable String
        String nombre = "Adri";
        String apellido = "Merino";
        double edad = 19;
        double resultado = 0.67;
        int a = 2;
        int b = 3;
        double c = 6.3;
        double resultado2 = 1.5;

        //Imprimir el valor de la variable
        System.out.println("Hola " + nombre);

        //Imprimir con formato
        System.out.printf("Hola %s %s, ¿qué tal?\n", nombre, apellido);

        //Que imprima: Hola Adri Merino, tengo: 19 años
        System.out.printf("Hola %s %s, tengo: %.4f años\n", nombre, apellido, edad);

        //Imprimir 2\3 = "0.75"
        System.out.printf("%s\\%s = %.2f\n", a, b, resultado);

        //Imprimir 6.3\2 = 1.5
        System.out.printf("%.1f\\%s = %.1f\n", c, a, resultado2);

        //       
    } 
}
