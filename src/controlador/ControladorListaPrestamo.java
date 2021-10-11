package controlador;

import vista.VistaListaPrestamo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorListaPrestamo {

    VistaListaPrestamo listaPView;

    public ControladorListaPrestamo() {
        this.listaPView = new VistaListaPrestamo();
        listaPView.agregarListener(new ControladorListaPrestamo.ClaseAction());
    }

    private class ClaseAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int valor = Integer.parseInt(e.getActionCommand());
            switch (valor){
                case 1: //pagos
                    listaPView.setVisible(false);
                    new ControladorPago();
                    break;
                case 2: //regresar
                    listaPView.setVisible(false);
                    new ControladorPrincipal();
                    break;
            }
        }
    }
}
