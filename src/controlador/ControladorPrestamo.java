package controlador;

import modelo.ModeloPrestamo;
import vista.VistaPrestamo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorPrestamo {

    ModeloPrestamo modelPrest;
    VistaPrestamo viewPrest;

    public ControladorPrestamo() {
        this.modelPrest = new ModeloPrestamo();
        this.viewPrest = new VistaPrestamo();
        //JTable jtXML = tablaXML();
        //jtXML.setBounds(30, 40, 100, 100);
        //JScrollPane sp = new JScrollPane(jtXML);
        //viewPrest.agregaTabla(sp);
        //viewPrest.agregarListener(new ControladorPrestamo().ClaseAction());
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
                    viewPrest.setVisible(false);
                    new ControladorPrincipal();
                    break;
            }
        }
    }
}
