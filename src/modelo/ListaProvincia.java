package modelo;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "data")
public class ListaProvincia {
    List<ModeloProvincia> provincias;

    public ListaProvincia() {
        provincias = new ArrayList<>();
    }

    public ListaProvincia(List<ModeloProvincia> provincias) {
        this.provincias = provincias;
    }

    @XmlElement(name = "provincias")
    public List<ModeloProvincia> getProvincias() {
        return provincias;
    }

    public void setProvincias(List<ModeloProvincia> provincias) {
        this.provincias = provincias;
    }

    public void add(ModeloProvincia provincia){
        provincias.add(provincia);
    }

    @Override
    public String toString() {
        return "Lista Provincias: \n" + getProvincias();
    }
}
