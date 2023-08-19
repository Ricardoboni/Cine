public class Main {
    public static void main(String[] args) {
        Pelicula pelicula = new Pelicula("Ejemplo de Película", "2 horas", 12, "Director Ejemplo");
        Cine cine = new Cine(pelicula, 10);
        Espectador espectador = new Espectador("Ejemplo Espectador", 18, 20);

        System.out.println("Asientos disponibles:");
        cine.mostrarAsientos();

        System.out.println("\nIntentando vender entrada...");
        cine.venderEntrada(espectador, 3, 4);

        System.out.println("\nAsientos después de la venta:");
        cine.mostrarAsientos();
    }
}
