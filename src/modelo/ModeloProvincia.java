package modelo;

public class ModeloProvincia {
    private int numero;
    private String nombre;
    private ListaCanton canList;

    public ModeloProvincia() {
    }

    public ModeloProvincia(int numero, String nombre, ListaCanton canList) {
        this.numero = numero;
        this.nombre = nombre;
        this.canList = canList;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ListaCanton getCanList() {
        return canList;
    }

    public void setCanList(ListaCanton canList) {
        this.canList = canList;
    }

    @Override
    public String toString() {
        return "Provincia " + getNumero() + ": " + getNombre() + "\n";
    }

}
