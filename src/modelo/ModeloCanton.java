package modelo;

import jakarta.xml.bind.annotation.XmlType;

@XmlType(propOrder = {"numero","nombre","distritos"})
public class ModeloCanton {
    private int numero;
    private String nombre;
    private ListaDistrito distritos;

    public ModeloCanton() {
    }

    public ModeloCanton(int numero, String nombre, ListaDistrito distritos) {
        this.numero = numero;
        this.nombre = nombre;
        this.distritos = distritos;
    }

    public int getNumero() { return numero; }

    public void setNumero(int numero) { this.numero = numero; }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public ListaDistrito getDistritos() { return distritos; }

    public void setDistritos(ListaDistrito distritos) { this.distritos = distritos; }

    @Override
    public String toString() {
        return "    Canton " + getNumero() + ": " + getNombre() + "\n"
                + getDistritos();
    }

}
