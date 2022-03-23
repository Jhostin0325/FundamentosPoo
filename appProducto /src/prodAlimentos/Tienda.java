package prodAlimentos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class Tienda {
    List<Perecedero> productosPerecedero;
    List<NoPerecedero> productosNoPerecedero;

    /**
     *
     */
    public Tienda() {
        productosPerecedero =new ArrayList<>();
        productosNoPerecedero =new ArrayList<>();
    }

    /**
     *
     * @param perecedero
     */
    public void agregarPerecedero(Perecedero perecedero){
        productosPerecedero.add(perecedero);
    }

    /**
     *
     * @param noPerecedero
     */
    public void agregarNoPerecedero(NoPerecedero noPerecedero){
        productosNoPerecedero.add(noPerecedero);
    }

    /**
     *
     */
    public void mostrarPerecederos(){
        for (Perecedero perecedero : productosPerecedero){
            System.out.println(perecedero);
        }
    }

    /**
     *
     */
    public void mostrarNoPerecederos(){
        for (NoPerecedero noPerecedero : productosNoPerecedero){
            System.out.println(noPerecedero);
        }
    }

    /**
     *
     * @param codigo
     * @param cantidad
     * @return
     */
    public int venta(int codigo, int cantidad){
        int precio = 0;
        for (Perecedero perecedero : productosPerecedero) {
            if (perecedero.codigo == codigo) {
                if (perecedero.cantidadActual >= cantidad) {
                    int cantidadFinal = perecedero.cantidadActual - cantidad;
                    perecedero.setCantidadActual(cantidadFinal);
                    precio = perecedero.calcularPrecio(cantidad);
                    perecedero.mostrarVenta(cantidad);
                    System.out.println(precio);
                }
            }
        }
        for (NoPerecedero noPerecedero : productosNoPerecedero) {
            if (noPerecedero.codigo == codigo) {
                if (noPerecedero.cantidadActual > cantidad) {
                    int cantidadFinal = noPerecedero.cantidadActual - cantidad;
                    noPerecedero.setCantidadActual(cantidadFinal);
                    precio = noPerecedero.calcularPrecio(cantidad);
                    noPerecedero.mostrarVenta(cantidad);
                    System.out.println(precio);
                }
            }
        }
        return precio;
    }
}