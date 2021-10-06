package modelo;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "prestamos")
@XmlAccessorType(XmlAccessType.PROPERTY)

public class ListaPrestamo {
    List<ModeloPrestamo> prestList;

    public ListaPrestamo() {
        prestList = new ArrayList<>();
    }

    public void add(ModeloPrestamo prestamo){
        prestList.add(prestamo);
    }

    public ListaPrestamo(List<ModeloPrestamo> prestList) {
        this.prestList = prestList;
    }

    @XmlElement(name = "prestamo")
    public List<ModeloPrestamo> getListaPrestamo() {
        return prestList;
    }

    public void setListaPrestamo(List<ModeloPrestamo> listaPrestamo) {
        this.prestList = listaPrestamo;
    }

    @Override
    public String toString() {
        return "==>" + getListaPrestamo();
    }
}
