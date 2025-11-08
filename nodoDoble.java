public class nodoDoble {
    protected persona dato;
    protected nodoDoble siguiente;
    protected nodoDoble anterior;

    public nodoDoble() {
    }

    public nodoDoble(persona dato) {
        this.dato = dato;
        this.siguiente = null;
        this.anterior = null;
    }

    public persona getDato() {
        return dato;
    }

    public void setDato(persona dato) {
        this.dato = dato;
    }

    public nodoDoble getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(nodoDoble siguiente) {
        this.siguiente = siguiente;
    }

    public nodoDoble getAnterior() {
        return anterior;
    }

    public void setAnterior(nodoDoble anterior) {
        this.anterior = anterior;
    }

}
