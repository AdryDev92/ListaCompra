package controller;

import model.Producto;

import java.util.*;
import java.util.ArrayList;


public class ListaCompra {

    private ArrayList<Producto> miLista = new ArrayList<>();


    public void mostrarMenu() {

        Scanner input = new Scanner(System.in);
        int opcion;

        System.out.println();
        System.out.println("===============================");
        System.out.println("|      LISTA DE LA COMPRA     |");
        System.out.println("===============================");
        System.out.println("| 1 - Añadir producto         |");
        System.out.println("| 2 - Eliminar producto       |");
        System.out.println("| 3 - Mostrar lista artículos |");
        System.out.println("| 4 - Consultar importe total |");
        System.out.println("| 0 - Pagar                   |");
        System.out.println("===============================");

        System.out.println("Selecciona una opción: ");
        opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    addItem();
                    break;
                case 2:
                    deleteItem();
                    break;
                case 3:
                    mostrarLista();
                    break;
                case 4:
                    consultarImporte();
                    break;
                case 0:
                    pagar();
                    break;
                default:
            }


    }


    /**
     * Añade un producto al arrayList con un nombre y un precio
     */
    public void addItem(){

        Scanner input = new Scanner(System.in);
        String articulo;
        double precio;

            System.out.println("Introduce producto:");
            articulo = input.nextLine();

            System.out.println("Precio:");
            precio = input.nextDouble();

        Producto producto = new Producto(articulo,precio);

        miLista.add(producto);
        mostrarMenu();

            }


    /**
     * Método que muestra la lista de productos
     */
    public void mostrarLista(){

        for ( Producto item: miLista) {
            System.out.println(miLista.indexOf(item) + " - " + item);
        }
        mostrarMenu();
    }

    /**
     * Borra un elemento del arrayList por su índice
     */
    public void deleteItem(){
        Scanner input = new Scanner(System.in);
        int index;

        for ( Producto item: miLista ) {
            System.out.println(miLista.indexOf(item) + " - " + item);
        }

        System.out.println("\nSelecciona el indice a borrar: ");
        index = input.nextInt();

        if (index < miLista.size()){
            miLista.remove(index);
        }
        mostrarLista();

    }

    public void consultarImporte(){
        double importe = 0.0;
        for (Producto producto: miLista) {
            importe+= producto.getPrecio();
        }
        System.out.printf("%.2f €",importe);
        mostrarMenu();
    }

    public static void pagar(){

        System.out.println("!PAGADO!");
    }

}




