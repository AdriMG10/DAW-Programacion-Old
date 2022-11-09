public class PruebaDiaSemana {
    public static void main(String[] args) {
        
        String lunes = "Es lunes";
        String martes = "Es martes";
        String miercoles = "Es miércoles";
        String jueves = "Es jueves";
        String viernes = "Es viernes";
        String finde = "¡Es fin de semana!";

        int dia = 7;

        if (dia == 1)
        System.out.println(lunes);

        else if (dia == 2)
        System.out.println(martes);

        else if (dia == 3)
        System.out.println(miercoles);

        else if (dia == 4)
        System.out.println(jueves);

        else if (dia == 5)
        System.out.println(viernes);

        else if ((dia == 6) || (dia == 7))
        System.out.println(finde);    
    }
}
