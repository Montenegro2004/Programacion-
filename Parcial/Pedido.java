import java.util.ArrayList;
import java.util.Date;

public class Pedido {
    private Cliente cliente;
    private ArrayList<Producto> productos;
    private Date fecha;
    private int numeroTarjetaCredito;
    private int numeroPedido;

    private Pedido(PedidoBuilder builder, int numeroPedido) {
        this.numeroPedido = numeroPedido;
        this.cliente = builder.cliente;
        this.productos = builder.productos;
        this.fecha = builder.fecha;
        this.numeroTarjetaCredito = builder.numeroTarjetaCredito;
    }

    public void mostrarPedido() {
        System.out.println("===== PEDIDO =====");
        System.out.println("Número de pedido: " + numeroPedido);
        System.out.println("Cliente: " + cliente.getNombre() + " (CI: " + cliente.getCedula() + ")");
        System.out.println("Fecha: " + fecha);
        System.out.println("Tarjeta de crédito: " + numeroTarjetaCredito);
        System.out.println("Productos del pedido:");
        for (Producto p : productos) {
            p.mostrarDetalles();
        }
        System.out.println("=======================");
    }

    public static class PedidoBuilder {
        private Cliente cliente;
        private ArrayList<Producto> productos = new ArrayList<>();
        private Date fecha;
        private int numeroTarjetaCredito;

        public PedidoBuilder setCliente(Cliente cliente) {
            this.cliente = cliente;
            return this;
        }

        public PedidoBuilder addProducto(Producto producto) {
            productos.add(producto);
            return this;
        }

        public PedidoBuilder setFecha(Date fecha) {
            this.fecha = fecha;
            return this;
        }

        public PedidoBuilder setNumeroTarjetaCredito(int numero) {
            this.numeroTarjetaCredito = numero;
            return this;
        }

        public Pedido build(int numero) {
            return new Pedido(this, numero);
        }
    }
}
