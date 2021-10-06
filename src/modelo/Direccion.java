package modelo;

public class Direccion {
    private ModeloProvincia provincia;
    private ModeloCanton canton;
    private ModeloDistrito distrito;

    public Direccion() {
    }

    public Direccion(ModeloProvincia provincia, ModeloCanton canton, ModeloDistrito distrito) {
        this.provincia = provincia;
        this.canton = canton;
        this.distrito = distrito;
    }

    public ModeloProvincia getProvincia() {
        return provincia;
    }

    public void setProvincia(ModeloProvincia provincia) {
        this.provincia = provincia;
    }

    public ModeloCanton getCanton() {
        return canton;
    }

    public void setCanton(ModeloCanton canton) {
        this.canton = canton;
    }

    public ModeloDistrito getDistrito() {
        return distrito;
    }

    public void setDistrito(ModeloDistrito distrito) {
        this.distrito = distrito;
    }

    @Override
    public String toString() {
        return "Direccion del cliente:\n" +
                getProvincia() +
                getCanton()+
                getDistrito();
    }

}
