import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double nota1, nota2, nota3, promedio;

        System.out.print("Ingrese la nota 1: ");
        nota1 = sc.nextDouble();

        System.out.print("Ingrese la nota 2: ");
        nota2 = sc.nextDouble();

        System.out.print("Ingrese la nota 3: ");
        nota3 = sc.nextDouble();

        // Validar notas entre 0 y 10
        if ((nota1 >= 0 && nota1 <= 10) &&
                (nota2 >= 0 && nota2 <= 10) &&
                (nota3 >= 0 && nota3 <= 10)) {

            promedio = (nota1 + nota2 + nota3) / 3;

            System.out.println("Promedio: " + promedio);

            if (promedio >= 6) {
                System.out.println("Estudiante APROBADO");
            } else {
                System.out.println("Estudiante REPROBADO");
            }

        } else {
            System.out.println("Error: Las notas deben estar entre 0 y 10");
        }
    }
}