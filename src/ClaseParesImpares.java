public class ClaseParesImpares {

    public static void getRangoNumeros(int inicio, int fin, boolean pares) {
        if (pares == true){
            getNumerosPares(inicio, fin);
        }
            
        
        
        
    }
    public static void getNumerosPares(int inicio, int fin) {
        //BUCLE DESDE INICIO HASTA FIN
        for (int i = inicio; i <= fin; i ++){
            //PREGUNTAMOS PÒR LOS PARES
            if (i%2==0){
                System.out.println(" Par: "+ i);
            }
        }
        
    }


     
     public static void getNumeroImpares(int inicio, int fin){

        for(int i = inicio; i<=fin; i ++){

            if(i%2!=0){
                System.out.println("Impar" +i);
            }
        }
     }
}