package Entidades;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {
    private List<Producto> productos;

    public Supermercado() {
        this.productos = new ArrayList<>();
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public Producto buscarProducto(String nombre) {
        for (Producto producto : productos) {
            if (producto.getNombre().equals(nombre)) {
                return producto;
            }
        }
        return null;
    }

    public void realizarCompra(Cliente cliente) {
        for (Producto producto : cliente.getCarrito()) {
            Producto productoEnInventario = buscarProducto(producto.getNombre());
            if (productoEnInventario != null && productoEnInventario.getCantidadStock() > 0) {
                productoEnInventario.setCantidadStock(productoEnInventario.getCantidadStock() - 1);
            }
        }
        cliente.getCarrito().clear();
    }

    public void mostrarInventario() {
        System.out.println("Inventario del supermercado:");
        for (Producto producto : productos) {
            producto.imprimirInformacion();
            System.out.println();
        }
    }
}
