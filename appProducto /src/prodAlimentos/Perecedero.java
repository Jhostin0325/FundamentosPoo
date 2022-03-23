package prodAlimentos;

/**
 *
 */
public class Perecedero extends Producto{
    private int diasCaducacion;

    /**
     *
     * @param codigo
     * @param descripcion
     * @param precio
     * @param cantidadActual
     * @param diasCaducacion
     */
    public Perecedero(int codigo, String descripcion, int precio, int cantidadActual, int diasCaducacion) {
        super(codigo, descripcion, precio, cantidadActual);
        this.diasCaducacion = diasCaducacion;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        //diasCaducacion +
        return codigo +
                "      ||     " + descripcion +
                "      ||     " + precio +
                "      ||     " + cantidadActual;
    }

    /**
     *
     * @param cantidad
     */
    public void mostrarVenta(int cantidad){
        System.out.print(codigo +
                "      ||     " + descripcion +
                "      ||     " + precio +
                "      ||     " + cantidad +
                "      ||     ");
    }

    /**
     *
     * @return
     */
    public int getDiasCaducar() {
        return diasCaducacion;
    }

    /**
     *
     * @param diasCaducar
     */
    public void setDiasCaducar(int diasCaducar) {
        this.diasCaducacion = diasCaducar;
    }

    /**
     *
     * @param cantidad
     * @return
     */
    public int calcularPrecio(int cantidad) {
        int precioFinal;
        int precioProducto = precio;
        if (diasCaducacion == 1) {
            precioProducto = precio / 4;
            precio=precioProducto;
        }
        else if (diasCaducacion == 2){
            precioProducto = precio / 3;
            precio=precioProducto;
        }
        else if (diasCaducacion == 3){
            precioProducto = precio / 2;
            precio=precioProducto;
        }
        else if(diasCaducacion < 1)
        {
            System.out.println("Ya no se puede vender el producto");
        }
        precioFinal = precioProducto * cantidad;
        return precioFinal;
    }
}

