package vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class VistaPrincipal extends JFrame {
    JPanel panel, norte, sur, centro;
    JButton boton1, boton2, boton3;

    public VistaPrincipal(String title) throws HeadlessException {
        super(title);
        this.panel = new JPanel();
        panel.setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,210);
        setLocationRelativeTo(null);
        setResizable(false);
        agregarComponentes();
    }

    public void agregarListener(ActionListener action){
        boton1.addActionListener(action);
        boton2.addActionListener(action);
        boton3.addActionListener(action);
    }

    public void agregarComponentes(){

        sur = new JPanel(new FlowLayout());
        norte = new JPanel(new FlowLayout());
        centro = new JPanel(new FlowLayout());

        boton1 = new JButton("Gestion clientes");
        boton1.setActionCommand("1");
        boton1.setPreferredSize(new Dimension(200,50));

        boton2 = new JButton("Nuevo Prestamo");
        boton2.setActionCommand("2");
        boton2.setPreferredSize(new Dimension(200,50));

        boton3 = new JButton("Realizar pago");
        boton3.setActionCommand("3");
        boton3.setPreferredSize(new Dimension(200,50));

        norte.setBackground(Color.darkGray);
        centro.setBackground(Color.darkGray);
        sur.setBackground(Color.darkGray);

        norte.add(boton1);
        centro.add(boton2);
        sur.add(boton3);

        panel.add(norte,BorderLayout.NORTH);
        panel.add(centro,BorderLayout.CENTER);
        panel.add(sur,BorderLayout.SOUTH);

        getContentPane().add(panel);
    }
}
