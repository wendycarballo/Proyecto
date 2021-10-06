package modelo;

public class ModeloPrestamo {
    private int monto;
    private float interes;
    private int plazo;
    private ListaPago pagoList;

    public ModeloPrestamo() {
    }

    public ModeloPrestamo(int monto, float interes, int plazo, ListaPago pagoList) {
        this.monto = monto;
        this.interes = interes;
        this.plazo = plazo;
        this.pagoList = pagoList;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public float getInteres() {
        return interes;
    }

    public void setInteres(float interes) {
        this.interes = interes;
    }

    public int getPlazo() {
        return plazo;
    }

    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }

    public ListaPago getPagoList() {
        return pagoList;
    }

    public void setPagoList(ListaPago pagoList) {
        this.pagoList = pagoList;
    }

    public double calculoCuota(){
        float interes = getInteres()/100;
        int montoInteres = (int) (getMonto() * interes);
        double interesPlazo = (1 - Math.pow(1/(1 + interes),getPlazo()));
        return montoInteres/interesPlazo;
    }

    @Override
    public String toString() {
        return  "Informacion del Prestamo: " +
                "\nMonto del prestamo: " + getMonto() + " colones" +
                ", interes: " + getInteres() + " %" +
                ", plazo: " + getPlazo() + " meses\n"
                + "Pagos realizados:\n" + getPagoList();
    }

}
