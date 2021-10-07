package controlador;

import vista.VistaCliente;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorCliente {

    VistaCliente cliente = new VistaCliente();

    public ControladorCliente(){
        ControladorCliente.ListenerBotones action = new ControladorCliente.ListenerBotones();
        cliente.agregarListener(action);
    }

    private class ListenerBotones implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int valor = Integer.parseInt(e.getActionCommand());
            switch(valor){
                case 1:

                    break;
                case 2:

                    break;
                case 3:
                    cliente.setVisible(false);
                    new ControladorPrincipal();
                    break;
            }
        }
    }
}
