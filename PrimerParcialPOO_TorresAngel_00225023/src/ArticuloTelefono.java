public class ArticuloTelefono extends Articulo {
    int almacenamiento;
    String color;

    public ArticuloTelefono(String nombre, String modelo, int almacenamiento, String color) {
        super(nombre, modelo);
        this.almacenamiento = almacenamiento;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    @Override
    public double obtenerPrecio() {

        return precio;
    }

    @Override
    public void obtenerDescripcion() {
        System.out.println("Este articulo tiene " + almacenamiento +"cantidad de almacenamiento y es de"+ color);

    }
}
