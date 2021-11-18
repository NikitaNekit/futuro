package futuro;
public class ed{

public static void main(String[]args){
    System.out.println("Estudiate " + args[0] + ": " + veredicto(args[1], args[2]));
        }
        private static String veredicto(String valor1, String valor2){
            if (valor1.equals(valor2)) {
                return "Bien. Pero una hora de estudio para cada módulo puede ser insuficiente.";
            }
            if (Integer.valueOf(valor1) > Integer.valueOf(valor2)){ //Cambiamos la lógica, para que vaya bien
                return "Poco tiempo de estudio. Debes dedicar más tiempo.";
            }
            return "Ideal. Trabajas los contenidos en casa.";
        }
}