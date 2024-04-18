package Entidades;

public class Producto {
    
        private String nombre;
        private int precio;
        private int cantidadStock;

    public Producto(String nombre, int precio, int cantidadStock){
            this.nombre = nombre;
            this.precio = precio;
            this.cantidadStock = cantidadStock;
        }

        public String getNombre () {
            return nombre;
        }

        public void setNombre (String nombre){
            this.nombre = nombre;
        }

        public int getPrecio () {
            return precio;
        }

        public void setPrecio ( int precio){
            this.precio = precio;
        }

        public int getCantidadStock () {
            return cantidadStock;
        }

        public void setCantidadStock ( int cantidadStock){
            this.cantidadStock = cantidadStock;
        }

        public void imprimirInformacion () {
            System.out.println("Nombre: " + nombre);
            System.out.println("Precio: $" + precio);
            System.out.println("Cantidad en stock: " + cantidadStock);
        }
    }

