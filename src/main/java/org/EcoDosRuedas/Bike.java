package org.EcoDosRuedas;

public class Bike extends Brands {
    static int bic_serial;
    static int fab_nit;
    static int bic_precio;
    static int bic_anio_construccion;
    static String bic_tipo;
    static String company;

    public Bike() {
    }

    public Bike(String fab_nombre) {
        super(fab_nombre);

        this.company = fab_nombre;
    }

    public static String getCompany() {
        return company;
    }

    public static void setCompany(String company) {
        Bike.company = company;
    }

    public static int getBic_serial() {
        return bic_serial;
    }

    public static void setBic_serial(int bic_serial) {
        Bike.bic_serial = bic_serial;
    }

    public static int getFab_nit() {
        return fab_nit;
    }

    public static void setFab_nit(int fab_nit) {
        Bike.fab_nit = fab_nit;
    }

    public static int getBic_precio() {
        return bic_precio;
    }

    public static void setBic_precio(int bic_precio) {
        Bike.bic_precio = bic_precio;
    }

    public static int getBic_anio_construccion() {
        return bic_anio_construccion;
    }

    public static void setBic_anio_construccion(int bic_anio_construccion) {
        Bike.bic_anio_construccion = bic_anio_construccion;
    }

    public static String getBic_tipo() {
        return bic_tipo;
    }

    public static void setBic_tipo(String bic_tipo) {
        Bike.bic_tipo = bic_tipo;
    }
}
