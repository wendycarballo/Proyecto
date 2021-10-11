package controlador;

import modelo.*;
import vista.VistaListaCliente;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorListaCliente {

    VistaListaCliente listaCView;

    public ControladorListaCliente() {
        this.listaCView = new VistaListaCliente();
        JTable jtXML = tablaXML();
        JScrollPane sp = new JScrollPane(jtXML);
        listaCView.agregaTabla(sp);
        listaCView.agregarListener(new ControladorListaCliente.ClaseAction());
    }

       private JTable tablaXML() {
        JAXBParser parser = new JAXBParser();
        ListaCliente clientes = (ListaCliente) parser.unmarshall(new ListaCliente(), "Clientes.xml");

        JTable tabla = new JTable();
        tabla.setModel(new ModeloTablaCliente(clientes.getListaCliente()));
        return tabla;
    }

    private class ClaseAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int valor = Integer.parseInt(e.getActionCommand());
            switch (valor){
                case 1: //prestamos
                    listaCView.setVisible(false);
                    new ControladorPrestamo();

                    break;
                case 2: //regresar
                    listaCView.setVisible(false);
                    new ControladorCliente();
                    break;
            }
        }
    }
}
