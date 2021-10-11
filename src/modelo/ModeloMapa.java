package modelo;

import vista.VistaCliente;

import javax.accessibility.Accessible;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ModeloMapa extends JComponent implements MouseListener, FocusListener, Accessible {

    private Image image;

    public ModeloMapa(Image image) {
        this.image = image;
        setFocusable(true);
        addMouseListener(this);
        addFocusListener(this);
    }

    protected void paintComponent(Graphics graphics){
        Graphics g = graphics.create();

        g.setColor(Color.WHITE);
        g.fillRect(0,0, image == null ? 125 : image.getWidth(this), image == null ? 125 : image.getHeight(this));
        if(image != null){
            g.drawImage(image,0,0,this);
        }

        if(isFocusOwner()){
            g.setColor(Color.BLUE);
            g.drawImage(image,0,0,this);
        }
        else{
            g.setColor(Color.BLACK);
        }

        g.drawRect(0,0, image == null ? 125 : image.getWidth(this), image == null ? 125 : image.getHeight(this));
        g.dispose();

    }

    @Override
    public void focusGained(FocusEvent e) {
        this.repaint();
    }

    @Override
    public void focusLost(FocusEvent e) {
        this.repaint();
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        requestFocusInWindow();
    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}

