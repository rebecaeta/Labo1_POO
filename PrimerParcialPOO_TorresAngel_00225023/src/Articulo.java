public abstract class Articulo implements PrecioDescripcion{
    String nombre;
    String modelo;
    String descripcion;
    double precio;

    public Articulo() {
    }

    public Articulo(String nombre, String modelo) {
        this.nombre = nombre;
        this.modelo = modelo;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
