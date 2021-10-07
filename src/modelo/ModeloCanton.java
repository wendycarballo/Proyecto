package modelo;

public class ModeloCanton {
    private int numero;
    private String nombre;
    private ListaDistrito distList;

    public ModeloCanton() {
    }

    public ModeloCanton(int numero, String nombre, ListaDistrito distList) {
        this.numero = numero;
        this.nombre = nombre;
        this.distList = distList;
    }

    public int getNumero() { return numero; }

    public void setNumero(int numero) { this.numero = numero; }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public ListaDistrito getDistList() { return distList; }

    public void setDistList(ListaDistrito distList) { this.distList = distList; }

//    @Override
//    public String toString() {
//        return "Canton " + getNumero() + ": " + getNombre() + "\n";
//    }


    @Override
    public String toString() {
        return "ModeloCanton{" +
                "numero=" + numero +
                ", nombre='" + nombre + '\'' +
                ", distList=" + distList +
                '}';
    }
}
