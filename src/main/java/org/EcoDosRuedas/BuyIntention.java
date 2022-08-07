package org.EcoDosRuedas;

import java.util.Date;

public class BuyIntention {
    static int int_codigo;
    static String cli_alias;
    static String int_consulta;
    static Date int_fecha_registro;


    public BuyIntention() {
    }


    public static int getInt_codigo() {
        return int_codigo;
    }

    public static void setInt_codigo(int int_codigo) {
        BuyIntention.int_codigo = int_codigo;
    }

    public static String getCli_alias() {
        return cli_alias;
    }

    public static void setCli_alias(String cli_alias) {
        BuyIntention.cli_alias = cli_alias;
    }

    public static String getInt_consulta() {
        return int_consulta;
    }

    public static void setInt_consulta(String int_consulta) {
        BuyIntention.int_consulta = int_consulta;
    }

    public static Date getInt_fecha_registro() {
        return int_fecha_registro;
    }

    public static void setInt_fecha_registro(Date int_fecha_registro) {
        BuyIntention.int_fecha_registro = int_fecha_registro;
    }
}
