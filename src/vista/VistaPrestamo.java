package vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class VistaPrestamo extends JFrame {
    JPanel panelA = new JPanel(new BorderLayout());
    JPanel panelInfo = new JPanel();
    JPanel panelBusq = new JPanel();
    JPanel sur = new JPanel(new FlowLayout());
    JPanel centro = new JPanel();

    JButton boton1, boton2;

    JTextField espacioId;

    public String getCapturaId(){ return espacioId.getText(); }

    public void displayMessage(String message){JOptionPane.showMessageDialog(this,message);}

    public void agregarListener(ActionListener al){
        boton1.addActionListener(al);
        boton2.addActionListener(al);
    }

    public VistaPrestamo() throws HeadlessException {
        super("Prestamos");
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setSize(300,200);
        setResizable(false);
        agregarComponentes(getContentPane());
        setVisible(true);
    }

    public void agregarComponentes(Container contentPane) {

        panelInfo.add(new JLabel("INFORMACION DEL CLIENTE"));

        panelBusq.add(new JLabel("Cedula:"));
        espacioId = new JTextField();
        espacioId.setPreferredSize(new Dimension(150,25));
        espacioId.setToolTipText("Introduzca numero de cedula");
        panelBusq.add(espacioId);

        boton1 = new JButton("Buscar");
        boton1.setPreferredSize(new Dimension(100,25));
        boton1.setActionCommand("1");
        sur.add(boton1);

        boton2 = new JButton("Regresar");
        boton2.setPreferredSize(new Dimension(100,25));
        boton2.setActionCommand("2");
        sur.add(boton2);

        centro.add(panelInfo);
        centro.add(panelBusq);

        panelA.add(sur, BorderLayout.SOUTH);
        panelA.add(centro, BorderLayout.CENTER);
        contentPane.add(panelA);
    }
}
