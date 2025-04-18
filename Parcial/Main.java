import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Juan Pérez", "123456789");
        Cliente cliente2 = new Cliente("Ana Gómez", "987654321");
        Cliente cliente3 = new Cliente("Luis Martínez", "456789123");

        Producto camara1 = new ProductoConcreto(new CamaraImplementacion(1, "Canon", "EOS 4000D"));
        Producto camara2 = new ProductoConcreto(new CamaraImplementacion(2, "Nikon", "D3500"));
        Producto camara3 = new ProductoConcreto(new CamaraImplementacion(3, "Sony", "Alpha 6000"));

        Producto foto1 = new ProductoConcreto(new FotoImplementacion(4, "playa.jpg"));
        Producto foto2 = new ProductoConcreto(new FotoImplementacion(5, "montaña.jpg"));
        Producto foto3 = new ProductoConcreto(new FotoImplementacion(6, "ciudad.jpg"));
        Producto foto4 = new ProductoConcreto(new FotoImplementacion(7, "naturaleza.jpg"));

        // Ahora las impresiones son productos simples, sin contener otros productos
        Producto impresion1 = new ProductoConcreto(
                new ImpresionImplementacion(8, "Color", "Colección de paisajes"));
        Producto impresion2 = new ProductoConcreto(
                new ImpresionImplementacion(9, "Blanco y negro", "Fotos artísticas"));
        Producto impresion3 = new ProductoConcreto(
                new ImpresionImplementacion(10, "Color", "Recuerdos de viaje"));

        Pedido pedido1 = new Pedido.PedidoBuilder()
                .setCliente(cliente1)
                .addProducto(camara1)
                .addProducto(foto1)          // Ahora añadimos las fotos directamente al pedido
                .addProducto(foto2)          // en lugar de agruparlas en una impresión
                .addProducto(impresion1)
                .setFecha(new Date())
                .setNumeroTarjetaCredito(123456)
                .build(100);
        pedido1.mostrarPedido();

        Pedido pedido2 = new Pedido.PedidoBuilder()
                .setCliente(cliente2)
                .addProducto(camara2)
                .addProducto(foto3)
                .addProducto(impresion2)
                .setFecha(new Date())
                .setNumeroTarjetaCredito(654321)
                .build(101);
        pedido2.mostrarPedido();

        Pedido pedido3 = new Pedido.PedidoBuilder()
                .setCliente(cliente3)
                .addProducto(camara3)
                .addProducto(foto4)
                .addProducto(impresion3)
                .setFecha(new Date())
                .setNumeroTarjetaCredito(789012)
                .build(102);
        pedido3.mostrarPedido();
        }
}