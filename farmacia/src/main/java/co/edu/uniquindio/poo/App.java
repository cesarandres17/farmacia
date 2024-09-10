package co.edu.uniquindio.poo;

public class App {
    public static void main(String[] args) {
        // Crear algunas ciudades
        Ciudad ciudadMedellin = new Ciudad("Medellín");

        // Crear algunos productos farmacéuticos
        Producto producto1 = new Producto("Aspirina", "P001", "2025-12-31", 10.99);
        Producto producto2 = new Producto("Ibuprofeno", "P002", "2026-06-30", 8.49);
        Producto producto3 = new Producto("Paracetamol", "P003", "2024-11-15", 5.99);

        // Crear sucursales asociadas a la ciudad
        Sucursal sucursal1 = new Sucursal("Sucursal Centro", "S001", "Av. Libertador, Medellín", "3001234567", ciudadMedellin);
        Sucursal sucursal2 = new Sucursal("Sucursal Norte", "S002", "Calle 45, Medellín", "3007654321", ciudadMedellin);

        // Agregar productos a las sucursales
        sucursal1.agregarProducto(producto1);
        sucursal1.agregarProducto(producto2);

        sucursal2.agregarProducto(producto3);

        // Intentar agregar un producto que ya existe en sucursal1
        sucursal1.agregarProducto(producto1); // Debería mostrar un mensaje indicando que el producto ya está guardado

        // Mostrar información de las sucursales y sus productos
        System.out.println(sucursal1);
        System.out.println("Productos en " + sucursal1.getNombre() + ":");
        for (Producto producto : sucursal1.getProducto()) {
            System.out.println(producto);
        }

        System.out.println();

        System.out.println(sucursal2);
        System.out.println("Productos en " + sucursal2.getNombre() + ":");
        for (Producto producto : sucursal2.getProducto()) {
            System.out.println(producto);
        }
    }
}
