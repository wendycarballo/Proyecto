package modelo;

import jakarta.xml.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@XmlRootElement
public class ListaCanton {
    List<ModeloCanton> cantones;

    public ListaCanton() {
        cantones = new ArrayList<>();
    }

    public ListaCanton(List<ModeloCanton> cantones) {
        this.cantones = cantones;
    }

    public List<ModeloCanton> getCantones() {
        return cantones;
    }

    public void setCantones(List<ModeloCanton> cantones) {
        this.cantones = cantones;
    }

    public void add(ModeloCanton canton){
        cantones.add(canton);
    }

    @Override
    public String toString() {
        return "->" + getCantones();
    }
}
