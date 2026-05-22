import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la nota 1: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Ingrese la nota 2: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Ingrese la nota 3: ");
        double nota3 = scanner.nextDouble();

        double promedio = (nota1 + nota2 + nota3) / 3;

        System.out.println("El promedio obtenido es: " + promedio);

        // Estructura de control IF para evaluar la condición
        if (promedio >= 6.0) {
            System.out.println("Estado: APROBADO");
        } else {
            System.out.println("Estado: REPROBADO");
        }

        scanner.close();
    }
}