public class PruebaEnums {

    enum Dia {
        LUNES, 
        MARTES, 
        MIERCOLES,
        JUEVES,
        VIERNES,
        SABADO,
        DOMINGO, 
        DESCONOCIDO 
    }

    public static void main(String[] args) {

        String lunes = "Es lunes";
        String martes = "Es martes";
        String miercoles = "Es miércoles";
        String jueves = "Es jueves";
        String viernes = "Es viernes";
        String finde = "¡Es fin de semana!";

        String novalido = "Día no válido";

        Dia diaDeHoy = Dia.DESCONOCIDO;

        switch (diaDeHoy) {

            case LUNES: System.out.println(lunes);
                break;

            case MARTES: System.out.println(martes);
                break;

            case MIERCOLES: System.out.println(miercoles);
                break;

            case JUEVES: System.out.println(jueves);
                break;

            case VIERNES: System.out.println(viernes);
                break;

            case SABADO: System.out.println(finde);
                break;

            case DOMINGO: System.out.println(finde);
                break;      
            
            default: System.out.println(novalido);
                break;
        }
    }
}
