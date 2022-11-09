/**
 *  Adri
 */
public class PruebaDiaSemanaSwitch {
    public static void main(String[] args) {
        
        String lunes = "Es lunes";
        String martes = "Es martes";
        String miercoles = "Es miércoles";
        String jueves = "Es jueves";
        String viernes = "Es viernes";
        String finde = "¡Es fin de semana!";

        String novalido = "Día no válido";

        int dia = 6;

        switch (dia) {

            case 1: System.out.println(lunes);
                break;

            case 2: System.out.println(martes);
                break;

            case 3: System.out.println(miercoles);
                break;

            case 4: System.out.println(jueves);
                break;

            case 5: System.out.println(viernes);
                break;

            case 6: System.out.println(finde);
                break;

            case 7: System.out.println(finde);
                break;      
            
            default: System.out.println(novalido);
                break;
        }
    }
}
