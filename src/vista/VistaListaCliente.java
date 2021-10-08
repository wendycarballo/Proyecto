package vista;

import modelo.JAXBParser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class VistaListaCliente extends JFrame {
    JPanel panelA = new JPanel(new BorderLayout());
    JPanel centro = new JPanel();
    JPanel sur = new JPanel();
    JPanel panelInfo = new JPanel(new FlowLayout());

    JButton boton1, boton2;

    public void displayMessage(String message){
        JOptionPane.showMessageDialog(this,message);
    }

    public void agregarListener(ActionListener al){
        boton1.addActionListener(al);
        boton2.addActionListener(al);
    }

    public VistaListaCliente() throws HeadlessException {
        super("Lista de clientes");
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setSize(600,600);
        setResizable(false);
        agregarComponentes(getContentPane());
        setVisible(true);
    }

    public void agregaTabla(JScrollPane sp) {
        if(centro.getComponentCount() > 0){
            centro.remove(0);
        }
        centro.add(sp);
        centro.validate();
    }

    public void agregarComponentes(Container contentPane) {

        boton1 = new JButton("Prestamos");
        boton1.setPreferredSize(new Dimension(100,25));
        boton1.setActionCommand("1");
        panelInfo.add(boton1);

        boton2 = new JButton("Regresar");
        boton2.setPreferredSize(new Dimension(100,25));
        boton2.setActionCommand("2");
        panelInfo.add(boton2);

        sur.add(panelInfo);
        panelA.add(sur, BorderLayout.SOUTH);
        panelA.add(centro, BorderLayout.CENTER);
        contentPane.add(panelA);
    }
}
