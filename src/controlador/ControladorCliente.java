package controlador;

import modelo.*;
import vista.VistaCliente;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorCliente {

    VistaCliente clienteView = new VistaCliente();

    public ControladorCliente(){
        ControladorCliente.ListenerBotones action = new ControladorCliente.ListenerBotones();
        clienteView.agregarListener(action);
    }

    private class ListenerBotones implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int valor = Integer.parseInt(e.getActionCommand());
            switch(valor){
                case 1: //buscar
                    try{
                        if(!clienteView.getCapturaId().isEmpty()) {
                            JAXBParser parser = new JAXBParser();
                            ListaCliente listaCli = (ListaCliente) parser.unmarshall(new ListaCliente(), "Clientes.xml");
                            ModeloCliente cliente = new ModeloCliente();
                            boolean found = false;
                            for(ModeloCliente element : listaCli.getListaCliente()){
                                if (element.getId() == Integer.parseInt(clienteView.getCapturaId())) {
                                    cliente.setId(Integer.parseInt(clienteView.getCapturaId()));
                                    cliente.setNombre(element.getNombre());
                                    cliente.setDireccion(element.getDireccion());
                                    ListaCliente listaComodin = new ListaCliente();
                                    listaComodin.add(cliente);
                                    JTable tabla = new JTable();
                                    tabla.setModel(new ModeloTablaCliente(listaComodin.getListaCliente()));
                                    JScrollPane sp = new JScrollPane(tabla);
                                    clienteView.setVisible(false);
                                    ControladorListaCliente clc = new ControladorListaCliente();
                                    clc.listaCView.agregaTabla(sp);
                                    found = true;
                                }
                            }
                            if (found != true) {
                                throw new Exception(" El cliente no se encuentra registrado");
                            }

                        }
                        else{
                            throw new Exception("Error, debe digitar un id");
                        }

                    } catch (Exception mensaje) {
                        clienteView.displayMessage(mensaje.getMessage());
                    }
                    break;
                case 2: //agregar
                    try{
                        JAXBParser parser = new JAXBParser();
                        ListaCliente listaCli1 = (ListaCliente) parser.unmarshall(new ListaCliente(), "Clientes.xml");
                        ModeloCliente cliente1 = new ModeloCliente();
                        if(!clienteView.getCapturaId().isEmpty()) {
                            cliente1.setId(Integer.parseInt(clienteView.getCapturaId()));
                        }
                        else{
                            throw new Exception("Error, campos en blanco");
                        }
                        if(!clienteView.getCapturaNombre().isEmpty()){
                            cliente1.setNombre(clienteView.getCapturaNombre());
                        }
                        else{
                            throw new Exception("Error, campos en blanco");
                        }
                        //CAMBIAR
                        Direccion provisional = new Direccion("DE","FA","ULT");
                        cliente1.setDireccion(provisional);
                        ListaPrestamo lp = new ListaPrestamo();
                        cliente1.setPrestamo(lp);

                        for(ModeloCliente element : listaCli1.getListaCliente()){
                            if (element.getId() == Integer.parseInt(clienteView.getCapturaId())) {
                                throw new Exception("El cliente ya esta registrado");
                            }
                        }
                        listaCli1.add(cliente1);
                        parser.marshall(listaCli1,"Clientes.xml");
                        JTable tabla = new JTable();
                        tabla.setModel(new ModeloTablaCliente(listaCli1.getListaCliente()));
                        JScrollPane sp1 = new JScrollPane(tabla);
                        clienteView.setVisible(false);
                        ControladorListaCliente clc = new ControladorListaCliente();
                        clc.listaCView.agregaTabla(sp1);
                    } catch (Exception mensaje) {
                        clienteView.displayMessage(mensaje.getMessage());
                    }
                    break;
                case 3: //lista
                    clienteView.setVisible(false);
                    new ControladorListaCliente();
                    break;
                case 4: //regresar
                    clienteView.setVisible(false);
                    new ControladorPrincipal();
                    break;
            }
        }
    }
}
