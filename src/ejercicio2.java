import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el radio de la circunferencia: ");
        double radio = scanner.nextDouble();

        // Usamos Math.PI para mayor precisión
        double area = Math.PI * Math.pow(radio, 2);

        System.out.println("El área de la circunferencia es: " + area);

        scanner.close();
    }
}
