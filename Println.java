/** 
 *  Adri
*/

public class Println {  
	//Campos
	String nombre;

	public static void main (String[] args) {
		//Variables
		String minombre, miapellido;
		minombre = "Adri "; 						//Variable porque la declaramos dentro del main
    	miapellido = "Merino";
		int miedad;
		long horas = 3874623944598659837L;
		float nota = 5.4F;
		double resultado = 43.25663131334243;
		miedad = 19;

		System.out.println ("Hola, me llamo " + minombre + miapellido + " y tengo " + miedad + " años"); 
		System.out.println ("¡Adiós mundo!"); 
		
		miedad = 99;
		System.out.println (miedad);
		System.out.print ("Quedan " + horas + " horas, he sacado un: " + nota + " y hace: " + resultado + 
		" grados de temperatura en el Sahara.");

		if (miedad == 99){
			System.out.println ("Tengo 99 años");
		}
		else if (miedad == 8){
			System.out.println ("Tengo 8 años");
		}
		else {
			System.out.println ("Tengo otra edad");
		}
	}		
}