public class CamaraImplementacion implements ProductoImplementacion {
    private String marca;
    private String modelo;
    private int numero;

    public CamaraImplementacion(int numero, String marca, String modelo) {
        this.numero = numero;
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Cámara: " + marca + " " + modelo + " (Producto #" + numero + ")");
    }
}
