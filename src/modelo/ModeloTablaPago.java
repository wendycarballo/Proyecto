package modelo;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class ModeloTablaPago extends AbstractTableModel {
    List<ModeloPago> filas;
    private String column[] = {"Fecha","No. Cuota","Monto Cancelado"};

    public ModeloTablaPago(List<ModeloPago> filas) { this.filas = filas; }

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
        ModeloPago act = (ModeloPago) filas.get(rowIndex);
        switch (columnIndex){
            case 0: return act.getFecha();
            case 1: return act.getNumeroCuota();
            case 2: return act.getMontoCancelado();
            default: return null;
        }
    }

    @Override
    public String getColumnName(int col){
        return column[col];
    }
}
