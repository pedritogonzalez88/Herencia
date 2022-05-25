public class Persona {

    private String nombre;
    private int Edad;
    private int telefono;

    public Persona(){}

    public Persona(String nombre, int Edad, int telefono){
        this.nombre = nombre;
        this.Edad = Edad;
        this.telefono = telefono;
    }

    public String getNombre(){
        return nombre;
    }

    public int getEdad(){
        return Edad;
    }

    public int getTelefono(){
        return telefono;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setEdad(int Edad){
        this.Edad = Edad;
    }

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }

}
