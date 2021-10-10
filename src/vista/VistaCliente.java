package vista;

import modelo.ModeloMapa;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class VistaCliente extends JFrame {
    JPanel panelA = new JPanel(new BorderLayout());
    JPanel norte = new JPanel(new GridLayout(2,2));
    JPanel centro = new JPanel();
    JPanel sur = new JPanel(new FlowLayout());
    JPanel panelMapa = new JPanel();
    JPanel panelImagenes = new JPanel(new GridLayout(2,2));
    JPanel panelNombres = new JPanel();
    JPanel panelBusq = new JPanel(new FlowLayout());
    JPanel panelInfo = new JPanel(new FlowLayout());
    JPanel panelDireccion = new JPanel(new FlowLayout());

    JTextField espacioId, espacioNombre, provincia;

    JComboBox canton, distrito;

    JButton boton1, boton2, boton3, boton4;

    public void displayMessage(String message){
        JOptionPane.showMessageDialog(this,message);
    }

    public String getCapturaId(){ return espacioId.getText(); }

    public String getCapturaNombre(){
        return espacioNombre.getText();
    }

    ModeloMapa pic1, pic2, pic3, pic4, pic5, pic6, pic7;
    static String sanJoseString = "sanJose";
    static String alajuelaString = "alajuela";
    static String cartagoString = "cartago";
    static String herediaString = "heredia";
    static String guanacasteString = "guanacaste";
    static String puntarenasString = "puntarenas";
    static String limonString = "limon";

    String[] comments = {
            "Provincia",
            "San Jose",
            "Alajuela",
            "Cartago",
            "Heredia",
            "Guanacaste",
            "Puntarenas",
            "Limon",
    };

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
        boton4.addActionListener(al);
    }

    public VistaCliente() throws HeadlessException {
        super("Clientes");
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setSize(850,650);
        setResizable(false);
        agregarComponentes(getContentPane());
        setVisible(true);
    }

    protected static ImageIcon createImageIcon(String path, String description){
        java.net.URL imageURL = ModeloMapa.class.getResource(path);
        if(imageURL == null){
            System.err.println("No se encuentra el archivo: " + path);
            return null;
        }
        else{
            return new ImageIcon(imageURL, description);
        }
    }

    public void agregarComponentes(Container contentPane) {

        JLabel info = new JLabel("Nada seleccionado");

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

        panelDireccion.add(new JLabel("Provincia:"));
        provincia = new JTextField();
        provincia.setPreferredSize(new Dimension(150,25));
//        java.util.List<String> cantones = sacarInfo();
//        for (String item : cantones) {
//            canton.addItem(item);
//        }
        panelDireccion.add(provincia);

        panelDireccion.add(new JLabel("Canton:"));
        canton = new JComboBox();
        canton.setPreferredSize(new Dimension(150,25));
//        java.util.List<String> cantones = sacarInfo();
//        for (String item : cantones) {
//            canton.addItem(item);
//        }
        panelDireccion.add(canton);

        panelDireccion.add(new JLabel("Distrito:"));
        distrito = new JComboBox();
        distrito.setPreferredSize(new Dimension(150,25));
//        List<String> distritos = listarDistritos();
//        for (String item : distritos) {
//            distrito.addItem(item);
//        }
        panelDireccion.add(distrito);

        boton1 = new JButton("Buscar");
        boton1.setPreferredSize(new Dimension(75,25));
        boton1.setActionCommand("1");
        panelBusq.add(boton1);

        boton2 = new JButton("Agregar");
        boton2.setPreferredSize(new Dimension(100,25));
        boton2.setActionCommand("2");
        panelDireccion.add(boton2);

        boton3 = new JButton("Lista");
        boton3.setPreferredSize(new Dimension(100,25));
        boton3.setActionCommand("3");
        sur.add(boton3);

        boton4 = new JButton("Regresar");
        boton4.setPreferredSize(new Dimension(150,25));
        boton4.setActionCommand("4");
        sur.add(boton4);

        panelNombres.setPreferredSize(new Dimension(400,25));
        panelNombres.setBackground(Color.cyan);
        panelNombres.add(info);

        panelImagenes.setPreferredSize(new Dimension(700,400));
        panelImagenes.setBackground(Color.black);

        panelMapa.setPreferredSize(new Dimension(500,500));

        pic1 = new ModeloMapa(createImageIcon("/mapas/" + sanJoseString + ".jpg",sanJoseString).getImage());
        pic1.setName("1");
        panelImagenes.add(pic1);

        pic2 = new ModeloMapa(createImageIcon("/mapas/" + alajuelaString + ".jpg",alajuelaString).getImage());
        pic2.setName("2");
        panelImagenes.add(pic2);

        pic3 = new ModeloMapa(createImageIcon("/mapas/" + cartagoString + ".jpg",cartagoString).getImage());
        pic3.setName("3");
        panelImagenes.add(pic3);

        pic4 = new ModeloMapa(createImageIcon("/mapas/" + herediaString + ".jpg",herediaString).getImage());
        pic4.setName("4");
        panelImagenes.add(pic4);

        pic5 = new ModeloMapa(createImageIcon("/mapas/" + guanacasteString + ".jpg",guanacasteString).getImage());
        pic5.setName("5");
        panelImagenes.add(pic5);

        pic6 = new ModeloMapa(createImageIcon("/mapas/" + puntarenasString + ".jpg",puntarenasString).getImage());
        pic6.setName("6");
        panelImagenes.add(pic6);

        pic7 = new ModeloMapa(createImageIcon("/mapas/" + limonString + ".jpg",limonString).getImage());
        pic7.setName("7");
        panelImagenes.add(pic7);

        KeyboardFocusManager focusManager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
        focusManager.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                String prop = evt.getPropertyName();
                if(("focusOwner".equals(prop)) && (evt.getNewValue() instanceof ModeloMapa)){
                    Component comp = (Component) evt.getNewValue();
                    String name = comp.getName();
                    int num = Integer.parseInt(name);
                    if (num < 0 || num > comments.length) {
                        num = 0;
                    }
                    info.setText(comments[num]);
                }
            }
        });

        panelMapa.add(panelImagenes);
        panelMapa.add(panelNombres);

        centro.add(panelDireccion);
        centro.add(panelMapa);
        norte.add(panelBusq);
        norte.add(panelInfo);
        panelA.add(norte, BorderLayout.NORTH);
        panelA.add(centro, BorderLayout.CENTER);
        panelA.add(sur, BorderLayout.SOUTH);
        contentPane.add(panelA);
    }
}
