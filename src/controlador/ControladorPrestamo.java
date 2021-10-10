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
                case 1: //agregar
                    try{
                        JAXBParser parser = new JAXBParser();
                        ListaCliente listaCli = (ListaCliente) parser.unmarshall(new ListaCliente(), "Clientes.xml");
                        boolean found = false;
                        if(!prestamoView.getCapturaId().isEmpty() && !prestamoView.getCapturaMonto().isEmpty() && !prestamoView.getCapturaIdentificador().isEmpty()) {
                            for(ModeloCliente element : listaCli.getListaCliente()) {
                                if (element.getId() == Integer.parseInt(prestamoView.getCapturaId())) {
                                    for(ModeloPrestamo element1 : element.getPrestamo().getListaPrestamo()) {
                                        if (element1.getIdentificador() == Integer.parseInt(prestamoView.getCapturaIdentificador())){
                                            throw new Exception("El identificador ya existe");
                                        }
                                    }

                                    ModeloPrestamo prestamo = new ModeloPrestamo();
                                    prestamo.setIdentificador(Integer.parseInt(prestamoView.getCapturaIdentificador()));
                                    prestamo.setMonto(Integer.parseInt(prestamoView.getCapturaMonto()));
                                    prestamo.setInteres(Integer.parseInt(prestamoView.getIntereses()));
                                    prestamo.setPlazo(Integer.parseInt(prestamoView.getPlazos()));
                                    prestamo.setPagoList(null);
                                    ListaPrestamo listaComodin = new ListaPrestamo();
                                    for(ModeloPrestamo element1 : element.getPrestamo().getListaPrestamo()) {
                                        listaComodin.add(element1);
                                    }
                                    listaComodin.add(prestamo);
                                    element.setPrestamo(listaComodin);

                                    parser.marshall(listaCli,"Clientes.xml");
                                    JTable tabla = new JTable();
                                    tabla.setModel(new ModeloTablaPrestamo(listaComodin.getListaPrestamo()));
                                    JScrollPane sp = new JScrollPane(tabla);
                                    prestamoView.setVisible(false);
                                    ControladorListaPrestamo clc = new ControladorListaPrestamo();
                                    clc.listaPView.agregaTabla(sp);
                                    found = true;
                                }
                                if (found != true) {
                                    throw new Exception(" El cliente no se encuentra registrado");
                                }
                            }
                        }
                        else{
                            throw new Exception("Error, campos en blanco");
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
