package modelo;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class ModeloTablaCliente extends AbstractTableModel {
    List<ModeloCliente> filas;
    private String column[] = {"Identificacion","Nombre","Direccion"};

    public ModeloTablaCliente(List<ModeloCliente> filas) { this.filas = filas; }

    @Override
    public int getRowCount() {
        return filas.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ModeloCliente act = (ModeloCliente) filas.get(rowIndex);
        switch (columnIndex){
            case 0: return act.getId();
            case 1: return act.getNombre();
            case 2: return act.getDireccion();
            default: return null;
        }
    }

    @Override
    public String getColumnName(int col){
        return column[col];
    }
}
