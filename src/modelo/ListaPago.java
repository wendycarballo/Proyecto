package modelo;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "pagos")
@XmlAccessorType(XmlAccessType.PROPERTY)

public class ListaPago {
    List<ModeloPago> pagoList;

    public ListaPago() {
        pagoList = new ArrayList<>();
    }

    public void add(ModeloPago pago){
        pagoList.add(pago);
    }

    public ListaPago(List<ModeloPago> listaPago) {
        this.pagoList = listaPago;
    }

    @XmlElement(name = "pago")
    public List<ModeloPago> getListaPago() {
        return pagoList;
    }

    public void setListaPago(List<ModeloPago> pagoList) {
        this.pagoList = pagoList;
    }

    @Override
    public String toString() {
        return "-->" + getListaPago();
    }

}
