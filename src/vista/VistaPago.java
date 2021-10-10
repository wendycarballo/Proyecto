package vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class VistaPago extends JFrame {
    JPanel panelA = new JPanel(new BorderLayout());
    JPanel norte = new JPanel(new GridLayout(2,2));
    JPanel sur = new JPanel();
    JPanel panelVerif = new JPanel(new FlowLayout());
    JPanel panelInfo = new JPanel(new FlowLayout());
    JPanel panelBase = new JPanel(new FlowLayout());

    JButton boton1, boton2;

    JTextField espacioId, espacioIdentificador, espacioFecha, espacioMonto;

    public String getCapturaId(){ return espacioId.getText(); }

    public String getCapturaIdentificador(){ return espacioIdentificador.getText(); }

    public String getCapturaFecha(){ return espacioFecha.getText(); }

    public String getCapturaMonto(){ return espacioMonto.getText(); }

    public void displayMessage(String message){
        JOptionPane.showMessageDialog(this,message);
    }

    public void agregarListener(ActionListener al){
        boton1.addActionListener(al);
        boton2.addActionListener(al);
    }

    public VistaPago() throws HeadlessException {
        super("Prestamos");
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setSize(800,200);
        setResizable(false);
        agregarComponentes(getContentPane());
        setVisible(true);
    }

    public void agregarComponentes(Container contentPane) {

        panelVerif.add(new JLabel("Cedula:"));
        espacioId = new JTextField();
        espacioId.setPreferredSize(new Dimension(150,25));
        espacioId.setToolTipText("Introduzca numero de cedula");
        panelVerif.add(espacioId);

        panelInfo.add(new JLabel("Identificador:"));
        espacioIdentificador = new JTextField();
        espacioIdentificador.setPreferredSize(new Dimension(150,25));
        espacioIdentificador.setToolTipText("Introduzca el identificador del prestamo");
        panelInfo.add(espacioIdentificador);

        panelInfo.add(new JLabel("Fecha"));
        espacioFecha = new JTextField();
        espacioFecha.setPreferredSize(new Dimension(150,25));
        espacioFecha.setToolTipText("DD/MM/AA");
        panelInfo.add(espacioFecha);

        panelInfo.add(new JLabel("Monto cancelado:"));
        espacioMonto = new JTextField();
        espacioMonto.setPreferredSize(new Dimension(150,25));
        espacioMonto.setToolTipText("Introduzca un monto en colones");
        panelInfo.add(espacioMonto);

        boton1 = new JButton("Agregar");
        boton1.setPreferredSize(new Dimension(100,25));
        boton1.setActionCommand("1");
        panelBase.add(boton1);

        boton2 = new JButton("Regresar");
        boton2.setPreferredSize(new Dimension(100,25));
        boton2.setActionCommand("2");
        panelBase.add(boton2);

        sur.add(panelBase);
        norte.add(panelVerif);
        norte.add(panelInfo);
        panelA.add(norte, BorderLayout.NORTH);
        panelA.add(sur, BorderLayout.SOUTH);
        contentPane.add(panelA);
    }

}
