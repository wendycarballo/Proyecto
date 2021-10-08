package modelo;

public class Direccion {
    private String provinciaS;
    private String cantonS;
    private String distritoS;

    public Direccion() {
    }

    public Direccion(String provinciaS, String cantonS, String distritoS) {
        this.provinciaS = provinciaS;
        this.cantonS = cantonS;
        this.distritoS = distritoS;
    }

    public String getProvinciaS() {
        return provinciaS;
    }

    public void setProvinciaS(String provinciaS) {
        this.provinciaS = provinciaS;
    }

    public String getCantonS() {
        return cantonS;
    }

    public void setCantonS(String cantonS) {
        this.cantonS = cantonS;
    }

    public String getDistritoS() {
        return distritoS;
    }

    public void setDistritoS(String distritoS) {
        this.distritoS = distritoS;
    }

    @Override
    public String toString() {
        return getProvinciaS() + "," +
                getCantonS() + "," +
                getDistritoS();
    }

}
