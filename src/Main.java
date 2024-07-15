public class Main {
    public static void main(String[] args) {
        GestorEmpleados gestor = new GestorEmpleados();
        PantallaEmpleados pantalla = new PantallaEmpleados(gestor);
        pantalla.mostrarMenu();
    }
}