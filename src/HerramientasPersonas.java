public class HerramientasPersonas {
    public static String getLetraNif(int numeroDni){
        //12345678
        //(nº DNI - ((nº DNI /23 )*23))
        int resultado = ( numeroDni -((numero Dni /23)*23));
       
        String secuencia = "TRWAGMYFPDXBNJZSQVHLCKET";
        char letra  = secuencia.charAt(resultado);
        String letraConvertida = 
            String.valueOf(letra);
         return letraConvertida;   
             
        
        }
    //QUISIERA UN METODO QUE RECIBA UN NIF/DNI
    //Y NOS DEVUELVA SI ES VALIDO O NO 

    public static boolean validarNif(String nif) {
              
    }

    }
