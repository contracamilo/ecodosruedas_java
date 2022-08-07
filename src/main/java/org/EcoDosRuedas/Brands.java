package org.EcoDosRuedas;

public class Brands {
    static int fab_nit;
    static String fab_nombre;
    static String fab_pais;

    public Brands() {
    }

    public Brands(String fab_nombre) {
    }

    public static int getFab_nit() {
        return fab_nit;
    }

    public static void setFab_nit(int fab_nit) {
        Brands.fab_nit = fab_nit;
    }

    public static String getFab_nombre() {
        return fab_nombre;
    }

    public static void setFab_nombre(String fab_nombre) {
        Brands.fab_nombre = fab_nombre;
    }

    public static String getFab_pais() {
        return fab_pais;
    }

    public static void setFab_pais(String fab_pais) {
        Brands.fab_pais = fab_pais;
    }
}
