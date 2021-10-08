package controlador;

import modelo.*;
import vista.VistaListaPrestamo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorListaPrestamo {

    VistaListaPrestamo listaPView;

    public ControladorListaPrestamo() {
        this.listaPView = new VistaListaPrestamo();
        //JTable jtXML = tablaXML();
        //JScrollPane sp = new JScrollPane(jtXML);
        //listaPView.agregaTabla(sp);
        listaPView.agregarListener(new ControladorListaPrestamo.ClaseAction());
    }

    private JTable tablaXML() {
        JAXBParser parser = new JAXBParser();
        ListaPrestamo prestamos = (ListaPrestamo) parser.unmarshall(new ListaPrestamo(), "Clientes.xml");

        JTable tabla = new JTable();
        tabla.setModel(new ModeloTablaPrestamo(prestamos.getListaPrestamo()));
        return tabla;
    }

    private class ClaseAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int valor = Integer.parseInt(e.getActionCommand());
            switch (valor){
                case 1: //agregar

                    break;
                case 2: //regresar
                    listaPView.setVisible(false);
                    new ControladorPrincipal();
                    break;
            }
        }
    }
}
