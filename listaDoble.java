public class listaDoble {
    protected nodoDoble inicio;
    protected nodoDoble fin;

    public listaDoble() {
        this.inicio = null;
        this.fin = null;
    }

    public boolean listaVacia() {
        return inicio == null;
    }

    public void agregarAlInicio(persona p) {
        nodoDoble nuevo = new nodoDoble(p);
        if (listaVacia()) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            nuevo.setSiguiente(inicio);
            inicio.setAnterior(nuevo);
            inicio = nuevo;
        }
    }

    public void mostrarLista() {
        if (!listaVacia()) {
            nodoDoble actual = inicio;
            while (actual != null) {
                System.out.println("Nombre: " + actual.dato.getNombre() + " Apellido:  " + actual.dato.getApellido() +
                        ", Peso: " + actual.dato.getPeso() +
                        ", Altura: " + actual.dato.getAltura());
                actual = actual.getSiguiente();
            }
        } else {
            System.out.println("La lista esta vacia");
        }
    }

    public void eliminarDelInicio(String nombre) {
        if (!listaVacia()) {
            if (inicio.getDato().getNombre().equalsIgnoreCase(nombre)) {
                if (inicio == fin) {
                    inicio = null;
                    fin = null;
                } else {
                    inicio = inicio.getSiguiente();
                    inicio.setAnterior(null);
                }
                System.out.println("Persona eliminada: " + nombre);
            } else {
                System.out.println("La persona no se encuentra al inicio de la lista");
            }
        } else {
            System.out.println("La lista esta vacia");
        }
    }

    public void buscarPersona(String nombre) {
        if (!listaVacia()) {
            nodoDoble actual = inicio;
            boolean encontrado = false;
            while (actual != null) {
                if (actual.getDato().getNombre().equalsIgnoreCase(nombre)) {
                    System.out.println("Nombre: " + actual.getDato().getNombre() + " Apellido: " + actual.getDato().getApellido() +
                            ", Peso: " + actual.getDato().getPeso() +
                            ", Altura: " + actual.getDato().getAltura());
                    encontrado = true;
                    break;
                }
                actual = actual.getSiguiente();
            }
            if (!encontrado) {
                System.out.println("Persona no encontrada: " + nombre);
            }
        } else {
            System.out.println("La lista esta vacia");
        }
    }

}
