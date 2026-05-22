import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1, num2, num3, mayor;

        System.out.print("Ingrese el primer número: ");
        num1 = sc.nextInt();

        System.out.print("Ingrese el segundo número: ");
        num2 = sc.nextInt();

        System.out.print("Ingrese el tercer número: ");
        num3 = sc.nextInt();

        mayor = num1;

        if (num2 > mayor) {
            mayor = num2;
        }

        if (num3 > mayor) {
            mayor = num3;
        }

        System.out.println("El número mayor es: " + mayor);
    }
}