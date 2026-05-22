import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        // Estructuras IF anidadas para las 3 condiciones posibles
        if (numero > 0) {
            System.out.println("El número es POSITIVO.");
        } else if (numero < 0) {
            System.out.println("El número es NEGATIVO.");
        } else {
            System.out.println("El número es NEUTRO (Cero).");
        }

        scanner.close();
    }
}