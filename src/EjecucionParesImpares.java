import java.util.Scanner;

public class EjecucionParesImpares {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Programa Pares Impares");
        System.out.println("Programa un inicio");

        String entrada  = teclado.nextLine();

        int inicio = Integer.parseInt(entrada);

        System.out.println("Introduzca numero final");

        entrada = teclado.nextLine();
        int fin = Integer.parseInt(entrada);
        ClaseParesImpares.getNumerosPares(inicio, fin);
        ClaseParesImpares.getRangoNumeros(inicio, fin, true);
        ClaseParesImpares.getRangoNumeros(inicio, fin, false);
    }

}
