package principal;

import controlador.ControladorPrincipal;
import modelo.*;

public class Principal {
    public static void main(String[] args) {
        new ControladorPrincipal();

//        JAXBParser parser = new JAXBParser();
//        ListaCliente clientes = (ListaCliente) parser.unmarshall(new ListaCliente(), "Clientes.xml");
//
//        System.out.println(clientes);

//        JAXBParser parser = new JAXBParser();
//        ListaProvincia provincias = (ListaProvincia) parser.unmarshall(new ListaProvincia(), "ProvinciasAnidadas.xml");
//
//        System.out.println(provincias);

        //----------------------------------------------------------------------------------

//        ModeloDistrito d1 = new ModeloDistrito(1,"San Ramon");
//        ModeloDistrito d2 = new ModeloDistrito(2,"Santiago");
//        ModeloDistrito d3 = new ModeloDistrito(3,"San Juan");
//        ModeloDistrito d4 = new ModeloDistrito(4,"Piedades Norte");
//        ListaDistrito ld = new ListaDistrito();
//        ld.add(d1);
//        ld.add(d2);
//        ld.add(d3);
//        ld.add(d4);
//        ModeloCanton c = new ModeloCanton(2,"San Ramon",ld);
//        ListaCanton lc = new ListaCanton();
//        lc.add(c);
//        ModeloProvincia p = new ModeloProvincia(2,"Alajuela",lc);
//
//        Direccion dir1 = new Direccion(p.getNombre(),c.getNombre(),d1.getNombre());
//        Direccion dir2 = new Direccion(p.getNombre(),c.getNombre(),d2.getNombre());
//        Direccion dir3 = new Direccion(p.getNombre(),c.getNombre(),d3.getNombre());
//        Direccion dir4 = new Direccion(p.getNombre(),c.getNombre(),d4.getNombre());
//
//        ModeloPago pag1 = new ModeloPago("junio 2020",1,60000);
//        ModeloPago pag2 = new ModeloPago("julio 2020",2,20000);
//        ListaPago lpag1 = new ListaPago();
//        lpag1.add(pag1);
//        lpag1.add(pag2);
//
//        ModeloPago pag3 = new ModeloPago("enero 2020",4,40000);
//        ModeloPago pag4 = new ModeloPago("febrero 2020",5,80000);
//        ListaPago lpag2 = new ListaPago();
//        lpag2.add(pag3);
//        lpag2.add(pag4);
//
//        ModeloPago pag5 = new ModeloPago("septiembre 2021",1,20000);
//        ModeloPago pag6 = new ModeloPago("octubre 2021",2,30000);
//        ListaPago lpag3 = new ListaPago();
//        lpag3.add(pag5);
//        lpag3.add(pag6);
//
//        ModeloPago pag7 = new ModeloPago("octubre 2021",1,50000);
//        ListaPago lpag4 = new ListaPago();
//        lpag4.add(pag7);
//
//        ModeloPrestamo pre1 = new ModeloPrestamo(1,100000,10,6,lpag1);
//        ModeloPrestamo pre2 = new ModeloPrestamo(2,1100000,15,24,lpag2);
//        ListaPrestamo lpre1 = new ListaPrestamo();
//        lpre1.add(pre1);
//        lpre1.add(pre2);
//
//        ModeloPrestamo pre3 = new ModeloPrestamo(3,200000,12,12,lpag3);
//        ListaPrestamo lpre2 = new ListaPrestamo();
//        lpre2.add(pre3);
//
//        ModeloPrestamo pre4 = new ModeloPrestamo(4,300000,8,12,lpag4);
//        ListaPrestamo lpre3 = new ListaPrestamo();
//        lpre3.add(pre4);
//
//        ModeloCliente cli1 = new ModeloCliente(1,"Juan",dir1,lpre1);
//        ModeloCliente cli2 = new ModeloCliente(2,"Ana",dir2,lpre2);
//        ModeloCliente cli3 = new ModeloCliente(3,"Maria",dir3,lpre3);
//        ModeloCliente cli4 = new ModeloCliente(4,"Marta",dir4,lpre2);
//
//        ListaCliente clientes = new ListaCliente();
//        clientes.add(cli1);
//        clientes.add(cli2);
//        clientes.add(cli3);
//        clientes.add(cli4);
//
//        JAXBParser parser = new JAXBParser();
//        parser.marshall(clientes,"Clientes.xml");

    }
}
