import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static ArrayList<Articulo> articulos;

    public static void main(String[] args) {
        menuPrincipal();
    }

        private static void menuPrincipal{
            Scanner sc = new Scanner(System.in);
            int op;
            while (true) {
                try {
                    menuPrincipal();
                    op = sc.nextInt();
                    if (op == 0) {
                        System.out.println("Saliendo del programa, hasta luego...");
                        break;
                    }

                    switch (op) {
                        case 1:
                            agregarArticulo();
                            break;
                        case 2:
                            modificarArticulo();
                            break;
                        case 3:
                            mostrarListaProductos();
                            break;
                        default:
                            System.out.println("Opcion no valida");
                            break;

                    }
                } catch (InputMismatchException e){
                    System.out.println("Ingresar opcion valida");


            }
        }
    }


    public  static void menuPrincipal(){
        System.out.println(" Bienvenido al sistema de inventario");
        System.out.println(" Ingrese una opcion: ");
        System.out.println("1. Regristrar articulo elecetronico");
        System.out.println("2. Modificar articulo electronico ");
        System.out.println("3. Consultar todos los articulos ");
        System.out.println("0. Salir del programa ");

    }

    private static void agregarArticulo(){
    Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre del articulo");
        String nombre = sc.nextLine();
        System.out.println("Ingreser la marca");
        String marca = sc.nextLine();
        if (tipoArticulo()) {

        }


        }


    private static void tipoArticulo(){
    Scanner sc= new Scanner(System.in);
    int opcion = 0;
        System.out.println("Ingrese el tipo de articulo: ");
        System.out.println("1. Telefono");
        System.out.println("2. Computadora");
        sc.nextInt();
        try{
        if (opcion == 1){
            System.out.println("Ingrese el numero del espacio de almacenamiento");
            sc.nextInt();
            System.out.println("Ingrese el color del telefono");
            sc.nextLine();}
        else{
            System.out.println("Ingrese la cantidad de memoria ");
            sc.nextInt();
            System.out.println("Ingrese la marca de la computadora ");
            sc.nextLine();}
        catch(InputMismatchException) {
            System.out.println("Ingrese opcion valida");
            }

    }

    public static void modificarArticulo() {

    }

    private  static void mostrarListaProductos(){
        System.out.println("Lista de productos");
        for (int i = 0; i < articulos.size(); i++) {
            Articulo articulo = articulos.get(i);
            System.out.println("Nombre:"+ articulo.nombre);
            System.out.println("Modelo:" + articulo.modelo);
        }
        }
}

    }
}