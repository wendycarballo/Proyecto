package modelo;

import jakarta.xml.bind.annotation.XmlType;

@XmlType(propOrder = {"numero","nombre"})
public class ModeloDistrito {
    private int numero;
    private String nombre;

    public ModeloDistrito() {
    }

    public ModeloDistrito(int numero, String nombre) {
        this.numero = numero;
        this.nombre = nombre;
    }

    public int getNumero() { return numero; }

    public void setNumero(int numero) { this.numero = numero; }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    @Override
    public String toString() {
        return "        Distrito " + getNumero() + ": " + getNombre() + "\n";
    }

}
