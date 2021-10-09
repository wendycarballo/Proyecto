package modelo;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;
import java.util.List;

@XmlRootElement
public class ListaDistrito {
    List<ModeloDistrito> distritos;

    public ListaDistrito() {
        distritos = new ArrayList<>();
    }

    public ListaDistrito(List<ModeloDistrito> distritos) {
        this.distritos = distritos;
    }

    //@XmlElement
    public List<ModeloDistrito> getDistritos() {
        return distritos;
    }

    public void setDistritos(List<ModeloDistrito> distritos) {
        this.distritos = distritos;
    }

    public void add(ModeloDistrito distrito){
        distritos.add(distrito);
    }

    @Override
    public String toString() {
        return "->" + getDistritos();
    }

}
