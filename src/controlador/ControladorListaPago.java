package controlador;

import modelo.*;
import vista.VistaListaPrestamo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorListaPago {

    VistaListaPrestamo listaPagoView;

    public ControladorListaPago() {
        this.listaPagoView = new VistaListaPrestamo();
        //JTable jtXML = tablaXML();
        //JScrollPane sp = new JScrollPane(jtXML);
        //listaPView.agregaTabla(sp);
        listaPagoView.agregarListener(new ControladorListaPago.ClaseAction());
    }

    private JTable tablaXML() {
        JAXBParser parser = new JAXBParser();
        ListaPago pagos = (ListaPago) parser.unmarshall(new ListaPago(), "Clientes.xml");

        JTable tabla = new JTable();
        tabla.setModel(new ModeloTablaPago(pagos.getListaPago()));
        return tabla;
    }

    private class ClaseAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int valor = Integer.parseInt(e.getActionCommand());
            switch (valor){
                case 1: //regresar
                    listaPagoView.setVisible(false);
                    new ControladorPrincipal();
                    break;
            }
        }
    }
}
