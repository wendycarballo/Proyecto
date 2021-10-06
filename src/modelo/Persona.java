package modelo;

public class Persona {
    private int id;
    private String nombre;

    public Persona() {
        this.id = 0;
        this.nombre = "";
    }

    public Persona(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Identificacion: " + getId() +
                ", nombre: " + getNombre();
    }

}
