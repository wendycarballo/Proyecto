package modelo;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class ModeloTablaPrestamo extends AbstractTableModel {
    List<ModeloPrestamo> filas;
    private String column[] = {"Monto prestamo","Interes %","Plazo","Pagos realizados"};

    public ModeloTablaPrestamo(List<ModeloPrestamo> filas) { this.filas = filas; }

    @Override
    public int getRowCount() {
        return filas.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ModeloPrestamo act = (ModeloPrestamo) filas.get(rowIndex);
        switch (columnIndex){
            case 0: return act.getMonto();
            case 1: return act.getInteres();
            case 2: return act.getPlazo();
            //CREAR CONTADOR PARA NUMERO DE PAGOS
            default: return null;
        }
    }

    @Override
    public String getColumnName(int col){
        return column[col];
    }
}
