import java.util.Scanner;

public class Util {
    private static Scanner scanner = new Scanner(System.in);

    public static String leerCadena(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextLine();  // Asegura que se lee hasta el final de la línea
    }

    public static int leerEntero(String mensaje) {
        System.out.print(mensaje);
        while (!scanner.hasNextInt()) {
            scanner.next(); // descartar entrada incorrecta
            System.out.print("Por favor, introduzca un número entero válido: ");
        }
        int number = scanner.nextInt();
        scanner.nextLine(); // Consume el salto de línea que queda pendiente después de leer un número
        return number;
    }

    public static double leerDouble(String mensaje) {
        System.out.print(mensaje);
        while (!scanner.hasNextDouble()) {
            scanner.next(); // descartar entrada incorrecta
            System.out.print("Por favor, introduzca un número válido: ");
        }
        double number = scanner.nextDouble();
        scanner.nextLine(); // Consume el salto de línea que queda pendiente después de leer un número
        return number;
    }
}
