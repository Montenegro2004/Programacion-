public class FotoImplementacion implements ProductoImplementacion {
    private String fichero;
    private double tamanoMB;
    private int numero;

    public FotoImplementacion(int numero, String fichero) {
        this.numero = numero;
        this.fichero = fichero;
        this.tamanoMB = 1 + Math.random() * 9;
        this.tamanoMB = Math.round(tamanoMB * 100.0) / 100.0;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Foto: " + fichero + " (Producto #" + numero + ")");
    }
}
