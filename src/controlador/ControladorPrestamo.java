package controlador;

import modelo.*;
import vista.VistaPrestamo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorPrestamo {

    VistaPrestamo prestamoView;

    public ControladorPrestamo() {
        this.prestamoView = new VistaPrestamo();
        prestamoView.agregarListener(new ControladorPrestamo.ClaseAction());
    }

    private class ClaseAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int valor = Integer.parseInt(e.getActionCommand());
            switch (valor){
                case 1: //buscar

                    break;
                case 2: //regresar
                    prestamoView.setVisible(false);
                    new ControladorPrincipal();
                    break;
            }
        }
    }
}
