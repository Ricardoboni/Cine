public class Cine {
    Pelicula pelicula;
    int precioEntrada;
    Asiento[][] asientos;

    public Cine(Pelicula pelicula, int precioEntrada) {
        this.pelicula = pelicula;
        this.precioEntrada = precioEntrada;
        this.asientos = new Asiento[8][9];
        for (int fila = 0; fila < 8; fila++) {
            for (int columna = 0; columna < 9; columna++) {
                char letraColumna = (char) ('A' + columna);
                asientos[fila][columna] = new Asiento(8 - fila, letraColumna);
            }
        }
    }

    void mostrarAsientos() {
        // Agrega el código para mostrar el estado de los asientos aquí
    }

    void venderEntrada(Espectador espectador, int fila, int columna) {
        // Agrega el código para vender la entrada aquí
    }
}
