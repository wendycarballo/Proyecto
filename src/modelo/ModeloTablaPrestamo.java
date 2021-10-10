package modelo;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class ModeloTablaPrestamo extends AbstractTableModel {
    List<ModeloPrestamo> filas;
    private String column[] = {"ID","Monto prestamo","Interes %","Plazo","Pagos realizados"};

    public ModeloTablaPrestamo(List<ModeloPrestamo> filas) { this.filas = filas; }

    @Override
    public int getRowCount() {
        return filas.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ModeloPrestamo act = (ModeloPrestamo) filas.get(rowIndex);
        switch (columnIndex){
            case 0: return act.getIdentificador();
            case 1: return act.getMonto();
            case 2: return act.getInteres();
            case 3: return act.getPlazo();
            //CREAR CONTADOR PARA NUMERO DE PAGOS
            default: return null;
        }
    }

    @Override
    public String getColumnName(int col){
        return column[col];
    }
}
