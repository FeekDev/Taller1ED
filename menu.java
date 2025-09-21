import java.util.Scanner;

public class menu {

    protected matriz nuevMatriz = new matriz(3, 3);
    protected int opcion;
    protected Scanner scanner = new Scanner(System.in);

    public void mostrarMenu() {

        int max;
        vectores vectores;
        matriz matriz;
        System.out.print("Antes de iniciar, indique el tamaño del vector: ");
        max = scanner.nextInt();
        vectores = new vectores(max);
        listaSimple lista = new listaSimple();

        System.out.println("Creando vector... \n");

        do {

            mostrarOpciones();

            opcion = scanner.nextInt();

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
                        String nombre;
                        System.out.print("Ingrese el nombre de la persona: ");
                        nombre = scanner.next();
                        int posicion = vectores.buscarPersona(nombre);
                        vectores.eliminarPersona(posicion);
                    } else {
                        System.out.println("El vector esta vacio");
                    }
                    break;
                case 4:
                    if (!vectores.vectorVacio()) {
                        System.out.print("Ingrese el nombre a buscar: ");
                        String nombre = scanner.next();
                        vectores.buscarPersona(nombre);
                        System.out.println("persona encontrada: " + nombre +
                                " en la posicion " + vectores.buscarPersona(nombre));
                    } else {
                        System.out.println("El vector esta vacio");
                    }
                    break;
                default:
                    System.out.println("Opcion no valida");
            }

        } while (opcion != 5);

        System.out.println("Saliendo del sistema");

    }

    public void mostrarMatriz() {
        if (!nuevMatriz.matrizVacia()) {

            do {

                mostrarOpciones();
                opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        if (!nuevMatriz.matrizLlena()) {
                            System.out.print("Ingrese el nombre: ");
                            String nombre = scanner.next();
                            System.out.print("Ingrese el apellido: ");
                            String apellido = scanner.next();
                            System.out.print("Ingrese el peso: ");
                            float peso = scanner.nextFloat();
                            System.out.print("Ingrese la altura: ");
                            float altura = scanner.nextFloat();

                            persona p = new persona(nombre, apellido, peso, altura);
                            nuevMatriz.agregar(p);
                        } else {
                            System.out.println("La matriz esta llena");
                        }
                        break;

                    case 2:
                        nuevMatriz.mostrarMatriz();
                        break;
                    case 3:
                        if (!nuevMatriz.matrizVacia()) {
                            System.out.print("Ingrese el nombre de la persona a eliminar: ");
                            String nombre = scanner.next();
                            int posicion = nuevMatriz.buscarPersona(nombre);
                            nuevMatriz.eliminar(posicion);
                        } else {

                        }
                        break;
                    case 4:
                        if (!nuevMatriz.matrizVacia()) {
                            System.out.print("Ingrese el nombre a buscar: ");
                            String nombre = scanner.next();
                            nuevMatriz.buscarPersona(nombre);
                            System.out.println("persona encontrada: " + nombre +
                                    " en la posicion " + nuevMatriz.buscarPersona(nombre));
                        } else {
                            System.out.println("La matriz esta vacia");
                        }
                    default:
                        break;
                }

            } while (opcion != 5);

        } else {
            System.out.println("La matriz esta vacia");
        }
    }

    public void mostrarOpciones() {
        System.out.print("\nSeleccione una opcion: ");
        System.out.println("\n===== MENÚ PRINCIPAL =====");
        System.out.println("1) Agregar persona");
        System.out.println("2) Mostrar personas");
        System.out.println("3) Eliminar persona");
        System.out.println("4) Buscar persona");
        System.out.println("5) Salir");
    }

}
