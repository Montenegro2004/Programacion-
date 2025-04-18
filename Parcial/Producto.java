public abstract class Producto {
    protected ProductoImplementacion implementacion;

    public Producto(ProductoImplementacion implementacion) {
        this.implementacion = implementacion;
    }

    public abstract void mostrarDetalles();
}
