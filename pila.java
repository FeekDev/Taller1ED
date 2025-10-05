public class pila {

    protected int max = 10;
    protected int tope;
    protected persona[] pilaPrimaria;
    protected persona[] pilaAuxiliar;;

    public pila() {
    }

    public pila(int Max) {
        this.max = Max;
        this.tope = -1;
        this.pilaPrimaria = new persona[this.max];
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getTope() {
        return tope;
    }

    public void setTope(int tope) {
        this.tope = tope;
    }

    public persona[] getpilaPrimaria() {
        return pilaPrimaria;
    }

    public void setpilaPrimaria(persona[] pilaPrimaria) {
        this.pilaPrimaria = pilaPrimaria;
    }

    public boolean pilaVacia() {
        return tope == -1;
    }

    public boolean pilaLlena() {
        return tope == max - 1;
    }

    public void push(persona p) {
        if (!pilaLlena()) {
            tope ++;
            pilaPrimaria[tope] = p;
        } else {
            System.out.println("Pila llena. No se puede agregar el elemento.");
        }
    }

    public persona pop() {
        if (!pilaVacia()) {
            persona elemento = pilaPrimaria[tope];
            tope --;
            pilaAuxiliar[tope] = elemento;
            return elemento;
        } else {
            System.out.println("Pila vacia. No se puede eliminar el elemento.");
            return null;
        }
    }

    
}
