package vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class VistaPago extends JFrame {
    JPanel panelA = new JPanel(new BorderLayout());
    JPanel sur = new JPanel(new FlowLayout());
    JPanel centro = new JPanel();

    JButton boton1;

    //public void displayMessage(String message){JOptionPane.showMessageDialog(this,message);}

    public void agregarListener(ActionListener al){
        boton1.addActionListener(al);
    }

    public VistaPago() throws HeadlessException {
        super("Pagos del prestamo");
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setSize(700,700);
        setBackground(Color.BLUE);
        setResizable(false);
        agregarComponentes(getContentPane());
        setVisible(true);
    }

    public void agregarComponentes(Container contentPane) {

        boton1 = new JButton("Regresar");
        boton1.setPreferredSize(new Dimension(100,25));
        boton1.setActionCommand("1");
        sur.add(boton1);

        panelA.add(sur, BorderLayout.SOUTH);
        panelA.add(centro, BorderLayout.CENTER);
        contentPane.add(panelA);
    }

}
