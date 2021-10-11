package modelo;

public class ModeloPrestamo {
    private int identificador;
    private int montoInicial;
    private double monto;
    private float interes;
    private int plazo;
    private double cuota;
    private ListaPago pagoList;

    public ModeloPrestamo() {
    }

    public ModeloPrestamo(int identificador, int monto, float interes, int plazo, ListaPago pagoList) {
        this.identificador = identificador;
        this.montoInicial = monto;
        this.monto = monto;
        this.interes = interes;
        this.plazo = plazo;
        this.cuota = calculoCuota();
        this.pagoList = pagoList;
    }

    public int getIdentificador() { return identificador; }

    public void setIdentificador(int identificador) { this.identificador = identificador; }

    public int getMontoInicial() { return montoInicial; }

    public void setMontoInicial(int montoInicial) { this.montoInicial = montoInicial; }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
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

    public double getCuota() { return calculoCuota(); }

    public void setCuota(double cuota) { this.cuota = cuota; }

    public ListaPago getPagoList() {
        return pagoList;
    }

    public void setPagoList(ListaPago pagoList) {
        this.pagoList = pagoList;
    }

    public double calculoCuota(){
        float interes = getInteres()/100;
        int montoInteres = (int) (getMontoInicial() * interes);
        double interesPlazo = (1 - Math.pow(1/(1 + interes),getPlazo()));
        return montoInteres/interesPlazo;
    }

    @Override
    public String toString() {
        return  "Informacion del Prestamo: " + "\nID " + getIdentificador() +
                " Monto del prestamo: " + getMonto() + " colones" +
                ", interes: " + getInteres() + " %" +
                ", plazo: " + getPlazo() + " meses\n" +
                ", cuota: " + getCuota() + " meses\n"
                + "Pagos realizados:\n" + getPagoList();
    }

}
