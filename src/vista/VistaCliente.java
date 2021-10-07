package vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class VistaCliente extends JFrame {
    JPanel panelA = new JPanel(new BorderLayout());
    JPanel norte = new JPanel(new GridLayout(2,2));
    JPanel centro = new JPanel();
    JPanel sur = new JPanel(new FlowLayout());
    JPanel mapa = new JPanel();//hacer
    JPanel panelBusq = new JPanel(new FlowLayout());
    JPanel panelInfo = new JPanel(new FlowLayout());
    JPanel panelDirect = new JPanel(new FlowLayout());

    JTextField espacioId, espacioNombre, provincia;

    JComboBox canton, distrito;

    JButton boton1, boton2, boton3;

    public void displayMessage(String message){
        JOptionPane.showMessageDialog(this,message);
    }

    public String getCapturaId(){ return espacioId.getText(); }

    public String getCapturaNombre(){
        return espacioNombre.getText();
    }

//    public java.util.List<String> listarCantones(){
//        java.util.List<String> cantones = new ArrayList<>();
//        JAXBParser parser = new JAXBParser();
//        ListaCanton canLista = (ListaCanton) parser.unmarshall(new ListaCanton(),"ProvinciasAnidadas.xml");
//
//        for(CantonModelo element : canLista.getCanList()) {
//            cantones.add(element.getNombre());
//        }
//        return cantones;
//    }

//    public java.util.List<String> listarDistritos(){
//        java.util.List<String> distritos = new ArrayList<>();
//        JAXBParser parser = new JAXBParser();
//        ListaDistrito distLista = (ListaDistrito) parser.unmarshall(new ListaDistrito(),"ProvinciasAnidadas.xml");
//
//        for(DistritoModelo element : distLista.getDistList()) {
//            distritos.add(element.getNombre());
//        }
//        return distritos;
//    }

    public void agregarListener(ActionListener al){
        boton1.addActionListener(al);
        boton2.addActionListener(al);
        boton3.addActionListener(al);
    }

    public VistaCliente() throws HeadlessException {
        super("Clientes");
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setSize(850,650);
        setBackground(Color.BLUE);
        setResizable(false);
        agregarComponentes(getContentPane());
        setVisible(true);
    }

    public void agregarComponentes(Container contentPane) {

        panelBusq.add(new JLabel("Cedula:"));
        espacioId = new JTextField();
        espacioId.setPreferredSize(new Dimension(150,25));
        espacioId.setToolTipText("Introduzca numero de cedula");
        panelBusq.add(espacioId);

        panelInfo.add(new JLabel("Nombre:"));
        espacioNombre = new JTextField();
        espacioNombre.setPreferredSize(new Dimension(150,25));
        espacioNombre.setToolTipText("Introduzca el nombre");
        panelInfo.add(espacioNombre);

        panelDirect.add(new JLabel("Provincia:"));
        provincia = new JTextField();
        provincia.setPreferredSize(new Dimension(150,25));
//        java.util.List<String> cantones = sacarInfo();
//        for (String item : cantones) {
//            canton.addItem(item);
//        }
        panelDirect.add(provincia);

        panelDirect.add(new JLabel("Canton:"));
        canton = new JComboBox();
        canton.setPreferredSize(new Dimension(150,25));
//        java.util.List<String> cantones = sacarInfo();
//        for (String item : cantones) {
//            canton.addItem(item);
//        }
        panelDirect.add(canton);

        panelDirect.add(new JLabel("Distrito:"));
        distrito = new JComboBox();
        distrito.setPreferredSize(new Dimension(150,25));
//        List<String> distritos = listarDistritos();
//        for (String item : distritos) {
//            distrito.addItem(item);
//        }
        panelDirect.add(distrito);

        mapa.setBackground(Color.BLACK);
        mapa.setPreferredSize(new Dimension(450,450));

        boton1 = new JButton("Buscar");
        boton1.setPreferredSize(new Dimension(75,25));
        boton1.setActionCommand("1");
        panelBusq.add(boton1);

        boton2 = new JButton("Agregar");
        boton2.setPreferredSize(new Dimension(100,25));
        boton2.setActionCommand("2");
        panelDirect.add(boton2);

        boton3 = new JButton("Regresar");
        boton3.setPreferredSize(new Dimension(150,25));
        boton3.setActionCommand("3");
        sur.add(boton3);

        centro.add(panelDirect);
        centro.add(mapa);
        norte.add(panelBusq);
        norte.add(panelInfo);
        panelA.add(norte, BorderLayout.NORTH);
        panelA.add(centro, BorderLayout.CENTER);
        panelA.add(sur, BorderLayout.SOUTH);
        contentPane.add(panelA);
    }
}
