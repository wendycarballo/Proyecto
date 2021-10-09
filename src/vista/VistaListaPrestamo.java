package vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class VistaListaPrestamo extends JFrame {
    JPanel panelA = new JPanel(new BorderLayout());
    JPanel norte = new JPanel(new GridLayout(2,2));
    JPanel centro = new JPanel();
    JPanel sur = new JPanel();
    JPanel panelInfo = new JPanel(new FlowLayout());
    JPanel panelBase = new JPanel(new FlowLayout());

    JButton boton1, boton2;

    public void displayMessage(String message){
        JOptionPane.showMessageDialog(this,message);
    }

    public void agregarListener(ActionListener al){
        boton1.addActionListener(al);
        boton2.addActionListener(al);
    }

    public VistaListaPrestamo() throws HeadlessException {
        super("Lista Prestamos");
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

        panelInfo.add(new JLabel("PRESTAMOS DEL CLIENTE"));

        boton1 = new JButton("Pagos");
        boton1.setPreferredSize(new Dimension(100,25));
        boton1.setActionCommand("1");
        panelBase.add(boton1);

        boton2 = new JButton("Regresar");
        boton2.setPreferredSize(new Dimension(100,25));
        boton2.setActionCommand("2");
        panelBase.add(boton2);

        sur.add(panelBase);
        norte.add(panelInfo);
        panelA.add(norte, BorderLayout.NORTH);
        panelA.add(centro, BorderLayout.CENTER);
        panelA.add(sur, BorderLayout.SOUTH);
        contentPane.add(panelA);
    }
}
