package org.EcoDosRuedas;

public class MotorBike extends Brands {
    static int mot_serial;
    static int fab_nit;
    static int pro_nit;
    static int mot_precio;
    static int mot_autonomia;
    static String mot_tipo;
    static String company;


    public MotorBike() {

    }

    public MotorBike(String fab_nombre) {
        super(fab_nombre);
        this.company = fab_nombre;
    }

    public static int getMot_serial() {
        return mot_serial;
    }

    public static void setMot_serial(int mot_serial) {
        MotorBike.mot_serial = mot_serial;
    }

    public static int getFab_nit() {
        return fab_nit;
    }

    public static void setFab_nit(int fab_nit) {
        MotorBike.fab_nit = fab_nit;
    }

    public static int getPro_nit() {
        return pro_nit;
    }

    public static void setPro_nit(int pro_nit) {
        MotorBike.pro_nit = pro_nit;
    }

    public static int getMot_precio() {
        return mot_precio;
    }

    public static void setMot_precio(int mot_precio) {
        MotorBike.mot_precio = mot_precio;
    }

    public static int getMot_autonomia() {
        return mot_autonomia;
    }

    public static void setMot_autonomia(int mot_autonomia) {
        MotorBike.mot_autonomia = mot_autonomia;
    }

    public static String getMot_tipo() {
        return mot_tipo;
    }

    public static void setMot_tipo(String mot_tipo) {
        MotorBike.mot_tipo = mot_tipo;
    }

    public static String getCompany() {
        return company;
    }

    public static void setCompany(String company) {
        MotorBike.company = company;
    }
}
