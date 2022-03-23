package prodAlimentos;

/**
 *
 */
public class AppTienda {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Tienda superExito = new Tienda();

        //Productos Perecederos
        superExito.agregarPerecedero(new Perecedero(2030, "Mango", 2000, 30, 3));
        superExito.agregarPerecedero(new Perecedero(2040, "Aceite", 12000, 50, 10));
        superExito.agregarPerecedero(new Perecedero(2060, "Atun", 5000, 20, 2));
        superExito.agregarPerecedero(new Perecedero(2130, "Manza", 2500, 35, 1));
        superExito.agregarPerecedero(new Perecedero(2160, "Durazno", 1000, 55, 3));

        //Productos Perecederos
        superExito.agregarNoPerecedero(new NoPerecedero(1050, "Arroz", 1600, 80, "Granos"));
        superExito.agregarNoPerecedero(new NoPerecedero(1060, "Sopas", 3000, 20, "Enlatada"));
        superExito.agregarNoPerecedero(new NoPerecedero(1150, "Pastas", 2500, 50, "Proteinas"));
        superExito.agregarNoPerecedero(new NoPerecedero(1110, "Cereal", 4400, 60, "Granos"));
        superExito.agregarNoPerecedero(new NoPerecedero(1280, "Miel", 3200, 50, "Granos"));

        System.out.println("Los productos perecederos disponibles son: ");
        System.out.println("   Codigo     "+"  Descripcion     "+"  Precio    "+"   Cantidad    ");
        superExito.mostrarPerecederos();
        System.out.println();
        System.out.println();
        System.out.println("Los productos no perecederos disponibles son: ");

        System.out.println("   Codigo     "+"  Descripcion     "+"  Precio    "+"   Cantidad    ");
        superExito.mostrarNoPerecederos();
        System.out.println();
        System.out.println("                  VENTAS");
        System.out.println("   Codigo     "+"  Descripcion     "+"  Precio    "+"  Cantidad comprada  "+" Valor a pagar     ");
        superExito.venta(1050, 20);
        superExito.venta(2060, 20);
        superExito.venta(2040, 40);
        superExito.venta(1060, 15);


    }
}
