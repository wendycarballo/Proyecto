package modelo;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "distritos")
@XmlAccessorType(XmlAccessType.PROPERTY)

public class ListaDistrito {
    List<ModeloDistrito> distList;

    public ListaDistrito() {
        distList = new ArrayList<>();
    }

    public ListaDistrito(List<ModeloDistrito> distList) {
        this.distList = distList;
    }

    @XmlElement(name = "distrito")
    public List<ModeloDistrito> getDistList() {
        return distList;
    }

    public void setDistList(List<ModeloDistrito> distList) {
        this.distList = distList;
    }

    public void add(ModeloDistrito distrito){
        distList.add(distrito);
    }

    @Override
    public String toString() {
        return "ListaDistrito{" +
                "distList=" + distList +
                '}';
    }

}
