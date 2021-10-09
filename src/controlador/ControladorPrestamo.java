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
                    try{
                        if(!prestamoView.getCapturaId().isEmpty()) {
                            JAXBParser parser = new JAXBParser();
                            ListaCliente listaCli = (ListaCliente) parser.unmarshall(new ListaCliente(), "Clientes.xml");
                            ModeloCliente cliente = new ModeloCliente();
                            ListaPrestamo listaPre = new ListaPrestamo();
                            ModeloPrestamo prestamo = new ModeloPrestamo();
                            ListaPrestamo listaComodin = new ListaPrestamo();
                            for(ModeloCliente element : listaCli.getListaCliente()){
                                if (element.getId() == Integer.parseInt(prestamoView.getCapturaId())) {
                                    if(element.getPrestamo() != null){
                                        for(ModeloPrestamo element1 : element.getPrestamo().getListaPrestamo()) {
                                            listaComodin.add(element1);
                                        }
                                        JTable tabla = new JTable();
                                        tabla.setModel(new ModeloTablaPrestamo(listaComodin.getListaPrestamo()));
                                        JScrollPane sp = new JScrollPane(tabla);
                                        prestamoView.setVisible(false);
                                        ControladorListaPrestamo clp = new ControladorListaPrestamo();
                                        clp.listaPView.agregaTabla(sp);
                                    }
                                    else{
                                        throw new Exception("Sin prestamos registrados");
                                    }
                                }
                            }
                            //CREAR EXCEPCION SI NO ESTA
                        }
                        else{
                            throw new Exception("Error, debe digitar un id");
                        }
                    } catch (Exception mensaje) {
                        prestamoView.displayMessage(mensaje.getMessage());
                    }
                    break;
                case 2: //regresar
                    prestamoView.setVisible(false);
                    new ControladorPrincipal();
                    break;
            }
        }
    }
}
