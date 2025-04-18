public class ProductoConcreto extends Producto {

    public ProductoConcreto(ProductoImplementacion implementacion) {
        super(implementacion);
    }

    @Override
    public void mostrarDetalles() {
        implementacion.mostrarDetalles();
    }
}
