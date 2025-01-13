import java.util.Scanner;

public class Ejecucion {

    public static void main(String[] args) {
        //CREAMOS TECLADO 
        Scanner teclado =new Scanner(System.in);
        //MENSAJE PARA PEDIR NUMEROS 
        System.out.println("Introduzca numero 1:");
        //ALMACENAMOS EL DATO QUE HA ESVCRITO
        String entrada  =teclado.nextLine();
        //ALMACENAMOS EL NUMERO 1
        int numero1 =Integer.parseInt(entrada);
        System.out.println("Introduzca el num2 ");
        //ALMACENAMOS DE NUEVO LO QUE HA ESCRITO EL USUARIO
        entrada = teclado.nextLine();
        //ALMACENAMOS EL NUMERO 2 
        int numero2 = Integer.parseInt(entrada);
        //CREAMOS UN MENU PARA LAS OPCIONES DEL USUARIO
        //CREAMOS UN MENU PARA LAS OPCIONES DEL USUARIO
       // Calculadora.mostrarMenu();
        System.out.println("-----------------");
        System.out.println("Selecione una opción ");
        System.out.println("1.- Sumar");
        System.out.println("2.- Restar");
        System.out.println("3.- Multiplicar");
        System.out.println("4.- Dividir");
        //CAPTURAMOS LO QUE HA ESCRITO EL USUARIO 
        entrada  = teclado.nextLine();
        //CAPTURAMOS LA OPCION SELECCIONADA 
        int opcion =Integer.parseInt(entrada);

        int resultado = 0 ;
        if (opcion == 1) {
            resultado = Calculadora.sumarNumeros(numero1, numero2);
        }else if (opcion ==2){
            resultado = Calculadora.restarNumeros(numero1, numero2);

        }else if (opcion ==3){
            resultado =Calculadora.multiplicarNumeros(numero1, numero2);

        }else if (opcion == 4){
            resultado =Calculadora.dividirNumeros(numero1, numero2);

        }
        System.out.println("Resultado: " + resultado);

    }
}
    


        // SI NECESITAMOS LLAMAR METODOS /FUNCIONES 
        //DE OTRAS CLASES, SIMPLEMENTES ESCRIBIMOS EL
        //NOMBRE DE LA CLASE Y EL METODO
       

    


