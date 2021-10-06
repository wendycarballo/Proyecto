package modelo;

public class ModeloPago {
    private String fecha;
    private int numeroCuota;
    private double montoCancelado;

    public ModeloPago() {
    }

    public ModeloPago(String fecha, int numeroCuota, double montoCancelado) {
        this.fecha = fecha;
        this.numeroCuota = numeroCuota;
        this.montoCancelado = montoCancelado;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getNumeroCuota() {
        return numeroCuota;
    }

    public void setNumeroCuota(int numeroCuota) {
        this.numeroCuota = numeroCuota;
    }

    public double getMontoCancelado() {
        return montoCancelado;
    }

    public void setMontoCancelado(double montoCancelado) {
        this.montoCancelado = montoCancelado;
    }

    @Override
    public String toString() {
        return "Fecha de pago: " + getFecha() +
                ", cuota numero " + getNumeroCuota() +
                ", monto cancelado: " + getMontoCancelado() + "\n";
    }

}
