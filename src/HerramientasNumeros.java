public class HerramientasNumeros {
 public static void  mostraCollatz(int numero) {
    while (numero ! = 1) 
    //COMPROBAMOS EL NUMERO
      if (numero % 2 == 0){
        numero = numero / 2;
      }else{
        //MULTIPLICAMOS POR 3 +1
        numero = numero * 3 + 1;
      }
      
    System.out.println(numero);
    
    
        
    }
    
 }

 //VAMOS A CREAR UN METODO private QUE NOS DEVOLVERA EL MENSAJE
 //"par:" 8. "impar:" + 15 
 private static String getNumeroCollatz(int numero){
    String mensaje = "";
    if (numero % 2 == 0){
        
    }

    }
 }
