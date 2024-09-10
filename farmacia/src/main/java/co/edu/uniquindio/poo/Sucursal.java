package co.edu.uniquindio.poo;
import java.util.ArrayList;
import java.util.List;

public class Sucursal {
    
    private String nombre;
    private String id;
    private String direccion;
    private String telefono;
    private Ciudad ciudad;
    private List<Producto> productos;

  


    public Sucursal(String nombre, String id, String direccion, String telefono,Ciudad ciudad){


        this.nombre=nombre;
        this.id=id;
        this.direccion=direccion;
        this.telefono=telefono;
        this.ciudad=ciudad;
        this.productos = new ArrayList<>();
        
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
         

    }


    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id=id;
         

    }




    public String getDireccion(){
        return direccion;
    }

    public void setDireccion(String direccion){
        this.direccion=direccion;
         

    }

    public String getTelefono(){
        return telefono;
    }

    public void setTelefono(String telefono){
        this.telefono=telefono;

    }
    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }


   


    public void agregarProducto(Producto producto){
        if(validarProducto(producto.getNombre(), producto.getCodigo())){
            mostrarMensaje("el producto ya esta guardado");


        }
        else{
            productos.add(producto);
        }
        
      }
    
    public boolean validarProducto(String nombre, String codigo){
        boolean existenciaProducto=false;
        for (Producto producto:productos){
            if (producto.getNombre().equals(nombre) || producto.getCodigo().equals(codigo)){
                existenciaProducto=true;
            }
        }
        return existenciaProducto;

    }
    public List<Producto>getProducto(){
        return productos;
    }

    public static void mostrarMensaje(String mensaje){
        System.out.println(mensaje);

    }
      





    @Override
    public String toString(){
        return "Sucursal [nombre =" + nombre + ", id ="+ id + ", Direccion "+ direccion +", Telefono"+ telefono + ", ciudad"+ ciudad +"]";
    }

    
}


