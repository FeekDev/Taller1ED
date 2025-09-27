public class listaSimple {
    
    protected nodo inicio;
    protected nodo fin;
    
    public listaSimple() {
        this.inicio = null;
        this.fin = null;
    }
    
    public boolean listaVacia() {
        return inicio == null;
    }
    
    public void agregarAlInicio(persona p) {
        nodo nuevo = new nodo(p);
        if (listaVacia()) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }
    }
    
    public void agregarAlFinal(persona p) {
        nodo nuevo = new nodo(p);
        if (listaVacia()) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
    }
    
    public void mostrarLista() {
        if (!listaVacia()) {
            nodo actual = inicio;
            while (actual != null) {
                System.out.println(actual.getDato().toString());
                actual = actual.getSiguiente();
            }
        } else {
            System.out.println("La lista esta vacia");
        }
    }

    public void eliminarDelInicio() {
        if (!listaVacia()) {
            inicio = inicio.getSiguiente();
            if (inicio == null) {
                fin = null;
            }
        } else {
            System.out.println("La lista esta vacia");
        }
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "ListaSimple [inicio=" + inicio + ", fin=" + fin + "]";
    }
    
}