package modelo;

import jakarta.xml.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@XmlRootElement
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

    @XmlElement
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
