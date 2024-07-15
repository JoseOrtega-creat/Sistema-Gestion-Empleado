public class PantallaEmpleados {
    private GestorEmpleados gestor;

    public PantallaEmpleados(GestorEmpleados gestor) {
        this.gestor = gestor;
    }

    public void mostrarMenu() {
        while (true) {
            System.out.println("**********************************");
            System.out.println("***** Gestión de Empleados *******");
            System.out.println("**********************************");
            System.out.println(Constantes.MENSAJE_OPCION);
            System.out.println("1. " + Constantes.OPCION_AGREGAR_EMPLEADO);
            System.out.println("2. " + Constantes.OPCION_MOSTRAR_EMPLEADOS);
            System.out.println("3. " + Constantes.OPCION_SALIR);
            System.out.println("----------------------------------");
            System.out.print("Opción: ");
            int opcion = Util.leerEntero("");

            switch (opcion) {
                case 1:
                    this.agregarEmpleado();
                    break;
                case 2:
                    System.out.println("//// LISTA DE EMPLEADOS ////");
                    this.gestor.mostrarEmpleados();
                    System.out.println("//// FIN DE LA LISTA ////");
                    break;
                case 3:
                    System.out.println(Constantes.MENSAJE_SALIDA);
                    return;
                default:
                    System.out.println(Constantes.ERROR_OPCION_INVALIDA);
                    break;
            }
        }
    }

    private void agregarEmpleado() {
        System.out.println("**** Agregar Nuevo Empleado ****");
        String nombre = Util.leerCadena("Ingrese nombre del empleado: ");
        int edad = Util.leerEntero("Ingrese edad del empleado: ");
        double salario = Util.leerDouble("Ingrese salario del empleado: ");
        Empleado nuevoEmpleado = new Empleado(nombre, edad, salario);
        gestor.agregarEmpleado(nuevoEmpleado);
        System.out.println("Empleado agregado exitosamente.");
        System.out.println("********************************");
    }
}