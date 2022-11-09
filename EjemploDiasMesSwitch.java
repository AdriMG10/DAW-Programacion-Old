public class EjemploDiasMesSwitch {

    enum Mes {
        ENERO, 
        FEBRERO, 
        MARZO,
        ABRIL,
        MAYO,
        JUNIO,
        JULIO,
        AGOSTO,
        SEPTIEMBRE,
        OCTUBRE,
        NOVIEMBRE,
        DICIEMBRE, 
        DESCONOCIDO 
    }
    public static void main(String[] args) {

        String mes28 = "Este mes tiene 28 días";
        String mes30 = "Este mes tiene 30 días";
        String mes31 = "Este mes tiene 31 días";

        String novalido = "Mes desconocido";

        Mes diasDelMes = Mes.JUNIO;

        switch (diasDelMes) {

            case ENERO: case MARZO: case MAYO: case JULIO: case AGOSTO: case OCTUBRE: case DICIEMBRE: System.out.println(mes31);
                break;

            case FEBRERO: System.out.println(mes28);
                break;

            case ABRIL: case JUNIO: case SEPTIEMBRE: case NOVIEMBRE: System.out.println(mes30);
                break;

            default: System.out.println(novalido);
                break;
        }
    }
}
