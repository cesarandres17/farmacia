package co.edu.uniquindio.poo;

public class Producto {

    private String nombre;
    private String codigo;
    private String fecha;
    private double precio;



    public Producto(String nombre, String codigo, String fecha, double precio){


        this.nombre=nombre;
        this.codigo=codigo;
        this.fecha=fecha;
        this.precio=precio;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
         

    }


    public String getCodigo(){
        return codigo;
    }

    public void setCodigo(String codigo){
        this.codigo=codigo;
         

    }




    public String getFecha(){
        return fecha;
    }

    public void setFecha(String fecha){
        this.fecha=fecha;
         

    }

    public Double getPrecio(){
        return precio;
    }

    public void setPrecio(Double precio){
        this.precio=precio;
         

    }

    @Override
    public String toString(){
        return "Producto [nombre =" + nombre + ", codigo ="+ codigo + ", fecha vencimiento"+ fecha +", precio"+ precio + "]";
    }

    
}
