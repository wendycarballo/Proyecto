package modelo;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "provincias")
@XmlAccessorType(XmlAccessType.PROPERTY)

public class ListaProvincia {
    List<ModeloProvincia> provList;

    public ListaProvincia() {
        provList = new ArrayList<>();
    }

    public ListaProvincia(List<ModeloProvincia> provList) {
        this.provList = provList;
    }

    @XmlElement(name = "provincia")
    public List<ModeloProvincia> getProvList() {
        return provList;
    }

    public void setProvList(List<ModeloProvincia> provList) {
        this.provList = provList;
    }

    public void add(ModeloProvincia provincia){
        provList.add(provincia);
    }

    @Override
    public String toString() {
        return "ListaProvincia{" +
                "provList=" + provList +
                '}';
    }
}
