import java.util.Scanner;

public class menu {
    public void mostrarMenu() {
        System.out.println("Bienvenido al sistema de gestion de personas");
        System.out.println("1. Agregar persona");
        System.out.println("2. Mostrar personas");
        System.out.println("3. Eliminar persona");
        System.out.println("4. Buscar persona");
        System.out.println("5. Salir");

        Scanner scanner = new Scanner(System.in);
        int max;
        vectores vectores;
        System.out.print("Indique el tamaño del vector: ");
        max = scanner.nextInt();
        vectores = new vectores(max);
        System.out.print("Seleccione una opcion: ");
        int opcion = scanner.nextInt();

        while (opcion != 5) {
            switch (opcion) {
        case 1:
            if (!vectores.vectorLleno()) {
                System.out.print("Ingrese el nombre: ");
                String nombre = scanner.next();
                System.out.print("Ingrese el apellido: ");
                String apellido = scanner.next();
                System.out.print("Ingrese el peso: ");
                float peso = scanner.nextFloat();
                System.out.print("Ingrese la altura: ");
                float altura = scanner.nextFloat();

                persona p = new persona(nombre, apellido, peso, altura);
                vectores.agregarPersona(p);
            } else {
                System.out.println("El vector esta lleno");
            }
            break;
                case 2:
                    vectores.mostrarVector();
                    break;
                case 3:
                    if (!vectores.vectorVacio()) {
                        System.out.print("Ingrese la posicion a eliminar (0 a " + vectores.getIndice() + "): ");
                        int posicion = scanner.nextInt();
                        vectores.eliminarPersona(posicion);
                    } else {
                        System.out.println("El vector esta vacio");
                    }
                    break;
                default:
                    System.out.println("Opcion no valida");
            }

            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
        }

        System.out.println("Saliendo del sistema...");
        scanner.close();
    }
}
    
