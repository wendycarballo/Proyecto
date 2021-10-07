package controlador;

import modelo.ModeloPago;
import vista.VistaPago;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorPago {
    ModeloPago modeloPago;
    VistaPago pago;

    public ControladorPago() {
        this.modeloPago = new ModeloPago();
        this.pago = new VistaPago();
//        JTable jtXML = tablaXML();
//        jtXML.setBounds(30, 40, 100, 100);
//        JScrollPane sp = new JScrollPane(jtXML);
//        pago.agregaTabla(sp);
        pago.agregarListener(new ControladorPago.ClaseAction());
    }

//    private JTable tablaXML() {
//        //hacer
//        return tablaXML();
//    }

    private class ClaseAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int valor = Integer.parseInt(e.getActionCommand());
            switch (valor){
                case 1: //regresar
                    pago.setVisible(false);
                    new ControladorPrincipal();
                    break;
            }
        }
    }
}
