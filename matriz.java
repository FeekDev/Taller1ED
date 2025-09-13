public class matriz {
    private int fila;
    private int columna;
    private int c;
    private int f;
    private persona matriz[][];

    public matriz() {
    }

    public matriz(int filas, int columnas) {
        this.fila = filas;
        this.columna = columnas;
        this.f = filas;
        this.c = columnas;
        matriz = new persona[filas][columnas];
    }

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }

    public persona[][] getMatriz() {
        return matriz;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public void setC(int c) {
        this.c = c;
    }

    public void setF(int f) {
        this.f = f;
    }

    public void setMatriz(persona[][] matriz) {
        this.matriz = matriz;
    }

    public boolean matrizVacia() {
        if (this.f == this.fila && this.c == this.columna)
            return true;
        else
            return false;
    }

    public boolean matrizLlena() {
        if (this.f == this.fila - 1 && this.c == this.columna - 1)
            return true;
        else
            return false;
    }

    public void agregar(persona p) {
        if (!matrizLlena()) {
            if (this.c < this.columna) {
                matriz[this.f][this.c] = p;
                this.c++;
            } else {
                this.f++;
                this.c = 0;
                matriz[this.f][this.c] = p;
                this.c++;
            }
        }

    }
}