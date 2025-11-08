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
}
