package modelo;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "cantones")
@XmlAccessorType(XmlAccessType.PROPERTY)

public class ListaCanton {
    List<ModeloCanton> canList;

    public ListaCanton() {
        canList = new ArrayList<>();
    }

    public ListaCanton(List<ModeloCanton> canList) {
        this.canList = canList;
    }

    @XmlElement(name = "canton")
    public List<ModeloCanton> getCanList() {
        return canList;
    }

    public void setCanList(List<ModeloCanton> canList) {
        this.canList = canList;
    }

    public void add(ModeloCanton canton){
        canList.add(canton);
    }

    @Override
    public String toString() {
        return "ListaCanton{" +
                "canList=" + canList +
                '}';
    }
}
