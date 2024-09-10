package co.edu.uniquindio.poo;

public class Ciudad {

    String nombre;



    public Ciudad(String nombre){
        this.nombre=nombre;


    }


    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;

    }
    @Override
    public String toString() {
        return "Ciudad [nombre=" + nombre + "]";
    }
}
