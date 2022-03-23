package prodAlimentos;

/**
 *
 */
public class NoPerecedero extends Producto {
    private String tipoPerecedero;

    /**
     *
     * @param codigo
     * @param descripcion
     * @param precio
     * @param cantidadActual
     * @param tipoPerecedero
     */
    public NoPerecedero(int codigo, String descripcion, int precio, int cantidadActual, String tipoPerecedero) {
        super(codigo, descripcion, precio, cantidadActual);
        this.tipoPerecedero = tipoPerecedero;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return  codigo +
                "      ||     " + descripcion +
                "      ||     " + precio +
                "      ||     " + cantidadActual +
                "      ||     " + tipoPerecedero;
    }

    /**
     *
     * @param cantidad
     */
    public void mostrarVenta(int cantidad){
        System.out.print( codigo +
                "      ||     " + descripcion +
                "      ||     " + precio +
                "      ||     " + cantidad +
                "      ||     ");
    }

    /**
     *
     * @return
     */
    public String getTipoPerecedero() {
        return tipoPerecedero;
    }

    /**
     *
     * @param tipoPerecedero
     */
    public void setTipoPerecedero(String tipoPerecedero) {
        this.tipoPerecedero = tipoPerecedero;
    }

    /**
     *
     * @param cantidad
     * @return
     */
    public int calcularPrecio(int cantidad) {
        int precioFinal = precio * cantidad;
        return precioFinal;
    }
}
