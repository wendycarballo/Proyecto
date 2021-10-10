package vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class VistaPrestamo extends JFrame {

    JPanel panelA = new JPanel(new BorderLayout());
    JPanel norte = new JPanel(new GridLayout(2,2));
    JPanel sur = new JPanel();
    JPanel panelVerif = new JPanel(new FlowLayout());
    JPanel panelInfo = new JPanel(new FlowLayout());
    JPanel panelBase = new JPanel(new FlowLayout());

    JButton boton1, boton2;

    JTextField espacioIdentificador, espacioMonto,  espacioId;

    JComboBox interes, plazo;

    int intereses[] = {2,3,5,10,12,15};

    int plazos[] = {3,6,10,12,24,48};

    public String getCapturaIdentificador(){ return espacioIdentificador.getText(); }

    public String getCapturaMonto(){ return espacioMonto.getText(); }

    public String getCapturaId(){ return espacioId.getText(); }

    public String getIntereses(){
        String inte =String.valueOf(interes.getSelectedItem());
        return inte;
    }

    public String getPlazos(){
        String tiempo =String.valueOf(plazo.getSelectedItem());
        return tiempo;
    }

    public void displayMessage(String message){
        JOptionPane.showMessageDialog(this,message);
    }

    public void agregarListener(ActionListener al){
        boton1.addActionListener(al);
        boton2.addActionListener(al);
    }

    public VistaPrestamo() throws HeadlessException {
        super("Pagos Prestamo");
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setSize(600,200);
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
        espacioIdentificador.setPreferredSize(new Dimension(50,25));
        espacioIdentificador.setToolTipText("Introduzca el id del prestamo");
        panelInfo.add(espacioIdentificador);

        panelInfo.add(new JLabel("Monto:"));
        espacioMonto = new JTextField();
        espacioMonto.setPreferredSize(new Dimension(150,25));
        espacioMonto.setToolTipText("Introduzca un monto en colones");
        panelInfo.add(espacioMonto);

        panelInfo.add(new JLabel("Interes:"));
        interes = new JComboBox();
        interes.setPreferredSize(new Dimension(50,25));
        for (int item : intereses) {
            interes.addItem(item);
        }
        panelInfo.add(interes);

        panelInfo.add(new JLabel("Plazo:"));
        plazo = new JComboBox();
        plazo.setPreferredSize(new Dimension(50,25));
        for (int item : plazos) {
            plazo.addItem(item);
        }
        panelInfo.add(plazo);

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
