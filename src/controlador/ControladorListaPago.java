package controlador;

import vista.VistaListaPrestamo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorListaPago {

    VistaListaPrestamo listaPagoView;

    public ControladorListaPago() {
        this.listaPagoView = new VistaListaPrestamo();
        listaPagoView.agregarListener(new ControladorListaPago.ClaseAction());
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
