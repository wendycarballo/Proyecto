package controlador;

import vista.VistaPrincipal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorPrincipal {

    VistaPrincipal principal;

    public ControladorPrincipal(){
        principal = new VistaPrincipal("Menu principal");
        principal.setVisible(true);
        ListenerBotones action = new ListenerBotones();
        principal.agregarListener(action);
    }

    private class ListenerBotones implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int valor = Integer.parseInt(e.getActionCommand());
            switch(valor){
                case 1:
                    principal.setVisible(false);
                    new ControladorCliente();
                    break;
                case 2:
                    principal.setVisible(false);
                    new ControladorPrestamo();
                    break;
                case 3:
                    principal.setVisible(false);
                    new ControladorPago();
                    break;
            }
        }
    }
}
