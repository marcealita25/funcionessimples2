public class HerramientasPersonas {
    public static String getDiaNacimiento(int dia, int mes, int anyo){
        //comprobamos enero y febrero
          if (mes ==1){
             mes =13;
             anyo--;
          }
           //almacenamos en variables diferentes cada operacion matematica 
           int op1 = (mes +1)*3/5;
           int op2 = anyo / 4;
           int op3 =anyo / 100;
           int op4 = anyo / 400;


           int op5 = dia +  (mes *2) + anyo + op1 + op2 - op3 + op4 +2;
           int op6 = op5 /7
           int resultado = op5 - (OP6 *7);
           String diaSemana = "";
           if (resultado == 0){
             diaSemana = "Sabado";
           }else if (resultado == 1){
            diaSemana = "Domingo";
           }else if (resultado == 2){
            diaSemana = "Lunes";
           }else if (resultado == 3){
            diaSemana = "Martes";
           }else if (resultado == 4){
            diaSemana = "Miercoles"; 
           }else if (resultado == 5){
            diaSemana = "Jueves";
           }else if (resultado == 6){
            diaSemana = "Viernes";
              
            


    public static String getLetraNIF(int numeroDni){
        int resultado = (numeroDni - ((numeroDni / 23) * 23));
        String secuencia = "TRWAGMYFPDXBNJZSQVHLCKET";
        char letra = secuencia.charAt(resultado);
        String letraConvertida =
            String.valueOf(letra);
        return letraConvertida;
    }

    //QUISIERA UN METODO QUE RECIBA UN NIF/DNI
    //Y NOS DEVUELVA SI ES VALIDO O NO
    public static boolean validarNIF(String nif){
        int longitud = nif.length() - 1;
        //RECUPERAR EL ULTIMO CARACTER
        char ultimaLetra = nif.charAt(longitud);
        //ELIMINAMOS EL ULTIMO CARACTER
        String soloNumeros = 
            nif.substring(0, longitud);
        //NECESITAMOS CONVERTIR LOS TIPOS
        int numeroDni = Integer.parseInt(soloNumeros);
        //CONVERTIMOS LA LETRA A STRING PARA COMPARAR
        String letraComparacion = 
            String.valueOf(ultimaLetra);
        //LLAMAMOS AL METODO QUE NOS DEVUELVE UNA LETRA
        String resultado = getLetraNIF(numeroDni);
        return resultado.equals(letraComparacion);
    }
}
