package modelo;

public class ModeloCliente extends Persona {
    private Direccion direccion;
    private ListaPrestamo prestamo;

    public ModeloCliente() {
    }

    public ModeloCliente(int id, String nombre, Direccion direccion, ListaPrestamo prestamo) {
        super(id, nombre);
        this.direccion = direccion;
        this.prestamo = prestamo;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public ListaPrestamo getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(ListaPrestamo prestamo) {
        this.prestamo = prestamo;
    }

    @Override
    public String toString() {
        return "Datos del cliente:\n" + super.toString() +
                "\n" + getDireccion() + "\n" +
                getPrestamo();
    }

}
