package modelo;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "clientes")

public class ListaCliente {
    List<ModeloCliente> listaCliente;

    public ListaCliente() {
        listaCliente = new ArrayList<>();
    }

    public void add(ModeloCliente cliente){
        listaCliente.add(cliente);
    }

    public ListaCliente(List<ModeloCliente> listaCliente) {
        this.listaCliente = listaCliente;
    }

    @XmlElement(name = "cliente")
    public List<ModeloCliente> getListaCliente() {
        return listaCliente;
    }

    public void setListaCliente(List<ModeloCliente> listaCliente) {
        this.listaCliente = listaCliente;
    }

    @Override
    public String toString() {
        return "ListaCliente{" +
                "listaCliente=" + listaCliente +
                '}';
    }
}
