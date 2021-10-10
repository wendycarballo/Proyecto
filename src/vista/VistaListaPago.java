package vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class VistaListaPago extends JFrame {
    JPanel panelA = new JPanel(new BorderLayout());
    JPanel norte = new JPanel();
    JPanel centro = new JPanel();
    JPanel sur = new JPanel();
    JPanel panelInfo = new JPanel();
    JPanel panelBase = new JPanel(new FlowLayout());

    JButton boton1;

    public void displayMessage(String message){
        JOptionPane.showMessageDialog(this,message);
    }

    public void agregarListener(ActionListener al){
        boton1.addActionListener(al);
    }

    public VistaListaPago() throws HeadlessException {
        super("Lista Pagos");
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

        panelInfo.add(new JLabel("PAGOS DEL PRESTAMO"));

        boton1 = new JButton("Regresar");
        boton1.setPreferredSize(new Dimension(100,25));
        boton1.setActionCommand("1");
        panelBase.add(boton1);

        norte.add(panelInfo);
        sur.add(panelBase);
        panelA.add(norte, BorderLayout.NORTH);
        panelA.add(centro, BorderLayout.CENTER);
        panelA.add(sur, BorderLayout.SOUTH);
        contentPane.add(panelA);
    }
}
