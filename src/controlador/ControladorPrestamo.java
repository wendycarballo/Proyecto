package controlador;

import modelo.ModeloPrestamo;
import vista.VistaPrestamo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorPrestamo {

    ModeloPrestamo modeloPrestamo;
    VistaPrestamo prestamo;

    public ControladorPrestamo() {
        this.modeloPrestamo = new ModeloPrestamo();
        this.prestamo = new VistaPrestamo();
        //JTable jtXML = tablaXML();
        //jtXML.setBounds(30, 40, 100, 100);
        //JScrollPane sp = new JScrollPane(jtXML);
        //prestamo.agregaTabla(sp);
        prestamo.agregarListener(new ControladorPrestamo.ClaseAction());
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
                    prestamo.setVisible(false);
                    new ControladorPrincipal();
                    break;
            }
        }
    }
}
