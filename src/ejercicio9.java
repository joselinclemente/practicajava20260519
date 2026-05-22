import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double compra, descuento = 0, total;

        System.out.print("Ingrese el valor de la compra: ");
        compra = sc.nextDouble();

        if (compra < 100) {
            descuento = 0;

        } else if (compra >= 100 && compra <= 300) {
            descuento = compra * 0.10;

        } else if (compra > 300) {
            descuento = compra * 0.15;
        }

        total = compra - descuento;

        System.out.println("Descuento aplicado: $" + descuento);
        System.out.println("Monto a pagar: $" + total);
    }
}
