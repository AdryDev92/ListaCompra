package model;

public class Producto {

        private String nombre;
        private double precio;


    public Producto(String nombre, double precio) {
        this.setNombre(nombre);
        this.setPrecio(precio);
    }

    public Producto() {
        this.getPrecio();
    }


    //Accesores

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {

        if (nombre.equals("")){
            this.nombre = "Sin nombre";
        } else {
            this.nombre = nombre;
        }

    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio < 0){
            this.precio = 0.0;
        }else {
            this.precio = precio;
        }
    }

    @Override
    public String toString() {
        return nombre + "" + ", " + precio + "€";
    }
}
