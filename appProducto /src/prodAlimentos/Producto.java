package prodAlimentos;

/**
 *
 */
public class Producto {
    protected int codigo;
    protected String descripcion;
    protected int precio;
    protected int cantidadActual;

    /**
     *
     * @param codigo
     * @param descripcion
     * @param precio
     * @param cantidadActual
     */
    public Producto(int codigo, String descripcion, int precio, int cantidadActual) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidadActual = cantidadActual;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Producto{" +
                "codigo=" + codigo +
                ", descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                ", cantidadActual=" + cantidadActual +
                '}';
    }

    /**
     *
     * @return
     */
    public int getCodigo(){
        return codigo;
    }

    /**
     *
     * @param codigo
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     *
     * @return
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     *
     * @param descripcion
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     *
     * @return
     */
    public int getPrecio() {
        return precio;
    }

    /**
     *
     * @param precio
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     *
     * @return
     */
    public int getCantidadActual() {
        return cantidadActual;
    }

    /**
     *
     * @param cantidadActual
     */
    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
}
