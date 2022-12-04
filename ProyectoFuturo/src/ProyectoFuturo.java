public class ProyectoFuturo {
    public ProyectoFuturo(){}
    static String veredicto(String valor1, String valor2) {

        if (valor1.equals(valor2)) {
            return "Bien. Pero una hora de estudio para cada módulo puede ser insuficiente.";
        }
        if (Integer.parseInt(valor1) < Integer.parseInt(valor2)){
            return "Poco tiempo de estudio. Debes dedicar más tiempo.";
        }
        return "Ideal. Trabajas los contenidos en casa.";
    }
    public static void main(String[] args) {

        /*String n,o, s;
        n=args[1];
        o=args[2];
        ProyectoFuturo str1= new ProyectoFuturo();

        s=str1.veredicto(n,o);*/
        ProyectoFuturo str1= new ProyectoFuturo();
        str1.veredicto(args[1],args[2]);

        System.out.println("Estudiante " + args[0] +" : " + ProyectoFuturo);

    }
}
/*public class ProyectoFuturo {
    public ProyectoFuturo(){}
    public String veredicto(String valor1, String valor2) {

        if (valor1.equals(valor2)) {
            return "Bien. Pero una hora de estudio para cada módulo puede ser insuficiente.";
        }
        if (Integer.parseInt(valor1) < Integer.parseInt(valor2)){
            return "Poco tiempo de estudio. Debes dedicar más tiempo.";
        }
        return "Ideal. Trabajas los contenidos en casa.";
    }
    public static void main(String[] args) {

        String n,o, s;
        n=args[1];
        o=args[2];
        ProyectoFuturo str1= new ProyectoFuturo();

        s=str1.veredicto(n,o);

        System.out.println("Estudiante " + args[0] +" : " +s);

    }
}*/


