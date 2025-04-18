public class ImpresionImplementacion implements ProductoImplementacion {
    private String tipo;
    private int numero;
    private String descripcion;

    public ImpresionImplementacion(int numero, String tipo, String descripcion) {
        this.numero = numero;
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Impresión tipo: " + tipo + " (Producto #" + numero + ") - " + descripcion);
    }
}