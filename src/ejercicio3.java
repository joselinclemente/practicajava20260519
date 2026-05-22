import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de la compra: $");
        double compra = scanner.nextDouble();

        double descuento = compra * 0.10;
        double totalPagar = compra - descuento;

        System.out.println("Monto del descuento (10%): $" + descuento);
        System.out.println("Total a pagar: $" + totalPagar);

        scanner.close();
    }
}