public class Pruebas2 {
    public static void main(String[] args) {
        //Declarar x e y
        int x = 1;
        int y = 2;
        
        //Crear bloque donde se imprima x 
        {
            System.out.println(x);
        }
    
            //Crear variable z
            int z = 3;
            //Bloque dentro
                //Imprimir z
                //Imprimir x e y
            {
                System.out.println(z);
                System.out.println(x);
                System.out.println(y);
            }
        
        //Crear bloque donde se imprima y
        {
        System.out.println(y);
        }
    }
}
