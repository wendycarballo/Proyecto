package modelo;

import jakarta.xml.bind.annotation.XmlType;

@XmlType(propOrder = {"numero","nombre","cantones"})
public class ModeloProvincia {
    private int numero;
    private String nombre;
    private ListaCanton cantones;

    public ModeloProvincia() {
    }

    public ModeloProvincia(int numero, String nombre, ListaCanton cantones) {
        this.numero = numero;
        this.nombre = nombre;
        this.cantones = cantones;
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

    public ListaCanton getCantones() {
        return cantones;
    }

    public void setCantones(ListaCanton cantones) {
        this.cantones = cantones;
    }

    @Override
    public String toString() {
        return "Provincia " + getNumero() + ": " + getNombre() + "\n"
        + getCantones() + "\n";
    }

}
