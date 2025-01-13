import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;


public class EjecucionPersonas {

    public static void main(String[] args) {
        //12345678Z
        //NECESITAMOS RECUPERAR LA ULTIMA LETRA DEL
        //TEXTO charArt(... length
        //POR OTRO LADO NECESITO LA CADENA SIN EL 
        //ULTIMO CARACTER  substring()
        String dni ="12345678Z";
        //PROBAMOS A SEPARAR 
        //AVERIGUAR LA LONGITUD
        int longitud =dni.length()-1;
        //recuperar el ultimo caracter
        chart ultimaletra = dni.charAt(longitud);
        System.out.println(ultimaLetra);

        
    }
    public static void main(String[] args) {
        Scanner teclado  = new Scanner (System.in);
        System.out.println("Introduzca numero de NIF");
        String entrada  = teclado.nextLine();

        int numeroDni = Integer.parse
        
    }

}
