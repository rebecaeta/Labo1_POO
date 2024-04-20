public class ArticuloComputadora extends Articulo{
      int capacidadMemoria;
      String marca;

    public ArticuloComputadora(String nombre, String modelo, int capacidadMemoria, String marca) {
        super(nombre, modelo);
        this.capacidadMemoria = capacidadMemoria;
        this.marca= marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCapacidadMemoria() {
        return capacidadMemoria;
    }

    public void setCapacidadMemoria(int capacidadMemoria) {
        this.capacidadMemoria = capacidadMemoria;
    }

    @Override
    public double obtenerPrecio() {
        return precio;
    }

    @Override
    public void obtenerDescripcion() {
        System.out.println("Este articulo tiene "+ capacidadMemoria+ " capacidad de memoria y es de la marca "+ marca);


    }
}
