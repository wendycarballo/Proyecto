package controlador;

import modelo.*;
import vista.VistaPago;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorPago {

    VistaPago pagoView;

    public ControladorPago() {
        this.pagoView = new VistaPago();
//        JTable jtXML = tablaXML();
//        jtXML.setBounds(30, 40, 100, 100);
//        JScrollPane sp = new JScrollPane(jtXML);
//        pago.agregaTabla(sp);
        pagoView.agregarListener(new ControladorPago.ClaseAction());
    }

    private class ClaseAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int valor = Integer.parseInt(e.getActionCommand());
            switch (valor) {
                case 1: //agregar

                    break;
                case 2: //regresar
                    pagoView.setVisible(false);
                    new ControladorPrincipal();
                    break;

            }
        }
    }

//                case 1: //agregar
//                    try {
//                        JAXBParser parser = new JAXBParser();
//                        ListaCliente listaCli = (ListaCliente) parser.unmarshall(new ListaCliente(), "Clientes.xml");
//                        if (!pagoView.getCapturaId().isEmpty() && !pagoView.getCapturaMonto().isEmpty()) {
//                            for (ModeloCliente element : listaCli.getListaCliente()) {
//                                if (element.getId() == Integer.parseInt(pagoView.getCapturaId())) {
//                                    for (ModeloPrestamo element1 : element.getPrestamo().getListaPrestamo()) {
//                                        if (element1.getMonto() == Integer.parseInt(pagoView.getCapturaPrestamo())) {
//                                            ModeloPrestamo prestamo = new ModeloPrestamo();
//                                            prestamo.setPagoList(element1.getPagoList());
//                                            ModeloPago pago = new ModeloPago();
//                                            pago.setFecha();
//                                        }
//
//                                        prestamo.setMonto(Integer.parseInt(prestamoView.getCapturaMonto()));
//                                        //CAMBIAR
//                                        prestamo.setInteres(15);
//                                        prestamo.setPlazo(12);
//                                        prestamo.setPagoList(null);
//                                        ListaPago listaComodin = new ListaPago();
//                                        for (ModeloPrestamo element1 : element.getPrestamo().getListaPrestamo()) {
//                                            listaComodin.add(element1);
//                                        }
//                                        listaComodin.add(pago);
//                                        element.setPago(listaComodin);
//
//                                        parser.marshall(listaCli, "Clientes.xml");
//                                        JTable tabla = new JTable();
//                                        tabla.setModel(new ModeloTablaPrestamo(listaComodin.getListaPrestamo()));
//                                        JScrollPane sp = new JScrollPane(tabla);
//                                        pagoView.setVisible(false);
//                                        ControladorListaPrestamo clc = new ControladorListaPrestamo();
//                                        clc.listaPView.agregaTabla(sp);
//                                    }
//                                }
//                            } else{
//                                throw new Exception("Error, campos en blanco");
//                            }
//                        } catch(Exception mensaje){
//                            pagoView.displayMessage(mensaje.getMessage());
//                        }
//                        break;
//                        case 2: //regresar
//                            pagoView.setVisible(false);
//                            new ControladorPrincipal();
//                            break;
//                    }
//            }
//        }
//        }

}
