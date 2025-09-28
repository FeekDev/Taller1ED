import java.util.Scanner;

public class menu {

    protected matriz nuevaMatriz;
    protected int opcion;
    protected Scanner scanner = new Scanner(System.in);
    protected vectores vectores;
    protected listaSimple lista = new listaSimple();
    protected int max;
    protected matriz matriz;

    public void mostrarMenu() {

        int opcionMenu;

        do {
            System.out.println("\n===== MENÚ DE ESTRUCTURAS DE DATOS =====");
            System.out.println("1) Vector");
            System.out.println("2) Matriz");
            System.out.println("3) Lista Simple");
            System.out.println("4) Salir");
            System.out.print("Seleccione una opcion: ");
            opcionMenu = scanner.nextInt();

            switch (opcionMenu) {
                case 1:
                    mostrarVector();
                    break;
                case 2:
                    mostrarMatriz();
                    break;
                case 3:
                    mostrarLista();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion no valida. Intente de nuevo.");
                    break;
            }

        } while (opcionMenu != 4);
    }

    public void mostrarVector() {
        System.out.print("Antes de iniciar, indique el tamaño del vector: ");
        max = scanner.nextInt();
        vectores = new vectores(max);

        System.out.println("Creando vector... \n");

        if (!vectores.vectorLleno()) {

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
                    default:
                        break;
                }

            } while (opcion != 5);

        } else {
            System.out.println("El vector esta lleno");
        }
    }

    public void mostrarMatriz() {

        System.out.print("Antes de iniciar, indique el numero de filas: ");
        int filas = scanner.nextInt();
        System.out.print("Indique el numero de columnas: ");
        int columnas = scanner.nextInt();
        nuevaMatriz = new matriz(filas, columnas);

        System.out.println("Creando matriz... \n");

        if (!nuevaMatriz.matrizVacia()) {

            do {

                mostrarOpciones();
                opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        if (!nuevaMatriz.matrizLlena()) {
                            System.out.print("Ingrese el nombre: ");
                            String nombre = scanner.next();
                            System.out.print("Ingrese el apellido: ");
                            String apellido = scanner.next();
                            System.out.print("Ingrese el peso: ");
                            float peso = scanner.nextFloat();
                            System.out.print("Ingrese la altura: ");
                            float altura = scanner.nextFloat();

                            persona p = new persona(nombre, apellido, peso, altura);
                            nuevaMatriz.agregar(p);
                        } else {
                            System.out.println("La matriz esta llena");
                        }
                        break;

                    case 2:
                        nuevaMatriz.mostrarMatriz();
                        break;
                    case 3:
                        if (!nuevaMatriz.matrizVacia()) {
                            System.out.print("Ingrese el nombre de la persona a eliminar: ");
                            String nombre = scanner.next();
                            int posicion = nuevaMatriz.buscarPersona(nombre);
                            nuevaMatriz.eliminar(posicion);
                        } else {

                        }
                        break;
                    case 4:
                        if (!nuevaMatriz.matrizVacia()) {
                            System.out.print("Ingrese el nombre a buscar: ");
                            String nombre = scanner.next();
                            nuevaMatriz.buscarPersona(nombre);
                            
                            if (nuevaMatriz.buscarPersona(nombre) != -1) {
                                System.out.println("persona encontrada: " + nombre +
                                        " en la posicion " + nuevaMatriz.buscarPersona(nombre));
                            } else {
                                System.out.println("Persona no encontrada en la matriz");
                            }

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

    public void mostrarLista() {

        listaSimple lista = new listaSimple();

        do {

            mostrarOpciones();
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre: ");
                    String nombre = scanner.next();
                    System.out.print("Ingrese el apellido: ");
                    String apellido = scanner.next();
                    System.out.print("Ingrese el peso: ");
                    float peso = scanner.nextFloat();
                    System.out.print("Ingrese la altura: ");
                    float altura = scanner.nextFloat();

                    persona p = new persona(nombre, apellido, peso, altura);
                    lista.agregarAlInicio(p);
                    break;

                case 2:
                    lista.mostrarLista();
                    break;
                case 3:
                    if (!lista.listaVacia()) {
                        String nombreEliminar;
                        System.out.print("Ingrese el nombre de la persona: ");
                        nombreEliminar = scanner.next();
                        lista.eliminarDelInicio(nombreEliminar);
                    } else {
                        System.out.println("La lista esta vacia");
                    }
                    break;
                case 4:
                    if (!lista.listaVacia()) {
                        System.out.print("Ingrese el nombre a buscar: ");
                        String nombreBuscar = scanner.next();
                        lista.buscarPersona(nombreBuscar);
                    } else {
                        System.out.println("La lista esta vacia");
                    }
                default:
                    break;
            }

        } while (opcion != 5);
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
