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
        pagoView.agregarListener(new ControladorPago.ClaseAction());
    }

    private class ClaseAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int valor = Integer.parseInt(e.getActionCommand());
            switch (valor) {
                case 1: //agregar
                    try{
                        JAXBParser parser = new JAXBParser();
                        ListaCliente listaCli = (ListaCliente) parser.unmarshall(new ListaCliente(), "Clientes.xml");
                        boolean found = false;
                        if(!pagoView.getCapturaId().isEmpty()  && !pagoView.getCapturaIdentificador().isEmpty()) {
                            for(ModeloCliente cliente : listaCli.getListaCliente()) {
                                if (cliente.getId() == Integer.parseInt(pagoView.getCapturaId())) {
                                    for(ModeloPrestamo prestamos : cliente.getPrestamo().getListaPrestamo()) {
                                        if (prestamos.getIdentificador() == Integer.parseInt(pagoView.getCapturaIdentificador())){
                                           if (pagoView.getCapturaMonto().isEmpty()){
                                               prestamos.setMonto(prestamos.getMonto() - (prestamos.getCuota()) * 0.4322);
                                           }

                                            ListaPago listaComodin = new ListaPago();

                                            listaComodin.setListaPago(prestamos.getPagoList().getListaPago());
                                            ModeloPago pago = new ModeloPago();
                                            pago.setFecha(pagoView.getCapturaFecha());
                                            pago.setMontoCancelado(Integer.parseInt(pagoView.getCapturaMonto()));
                                            if(listaComodin == null){
                                                pago.setNumeroCuota(1);
                                            }
                                            else{
                                                pago.setNumeroCuota(2);
                                            }
                                            listaComodin.add(pago);

                                            double nuevoMonto = (prestamos.getMonto() - (prestamos.getCuota() * 0.4322) + (Integer.parseInt(pagoView.getCapturaMonto())));
                                            prestamos.setMonto(nuevoMonto);
                                            prestamos.setPagoList(listaComodin);

                                            parser.marshall(listaCli,"Clientes.xml");
                                            JTable tabla = new JTable();
                                            tabla.setModel(new ModeloTablaPago(listaComodin.getListaPago()));
                                            JScrollPane sp = new JScrollPane(tabla);
                                            pagoView.setVisible(false);
                                            ControladorListaPago clp = new ControladorListaPago();
                                            clp.listaPagoView.agregaTabla(sp);
                                            found = true;
                                        }
                                        else{
                                            throw new Exception(" El identificador no se encuentra registrado");
                                        }
                                    }

                                }
                                if (!found) {
                                    throw new Exception(" El cliente no se encuentra registrado");
                                }
                            }
                        }
                        else{
                            throw new Exception("Error, campos en blanco");
                        }
                    } catch (Exception mensaje) {
                        pagoView.displayMessage(mensaje.getMessage());
                    }
                    break;
                case 2: //regresar
                    pagoView.setVisible(false);
                    new ControladorPrincipal();
                    break;

            }
        }
    }

}
