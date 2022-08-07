package org.EcoDosRuedas;

public class Clients {
    static String cli_alias;
    static String cli_nombre;
    static String cli_apellido;
    static String cli_email;
    static String cli_celular;
    static int cli_contrasenia;
    static int cli_fecha_nacimiento;

    public Clients() {
    }

    public Clients(String cli_alias, String cli_nombre, String cli_apellido, String cli_email, String cli_celular, int cli_contrasenia, int cli_fecha_nacimiento) {
        this.cli_alias = cli_alias;
        this.cli_nombre = cli_nombre;
        this.cli_apellido = cli_apellido;
        this.cli_email = cli_email;
        this.cli_celular = cli_celular;
        this.cli_contrasenia = cli_contrasenia;
        this.cli_fecha_nacimiento = cli_fecha_nacimiento;
    }

    public static String getCli_alias() {
        return cli_alias;
    }

    public void setCli_alias(String cli_alias) {
        this.cli_alias = cli_alias;
    }

    public static String getCli_nombre() {
        return cli_nombre;
    }

    public void setCli_nombre(String cli_nombre) {
        this.cli_nombre = cli_nombre;
    }

    public static String getCli_apellido() {
        return cli_apellido;
    }

    public void setCli_apellido(String cli_apellido) {
        this.cli_apellido = cli_apellido;
    }

    public static String getCli_email() {
        return cli_email;
    }

    public void setCli_email(String cli_email) {
        this.cli_email = cli_email;
    }

    public static String getCli_celular() {
        return cli_celular;
    }

    public void setCli_celular(String cli_celular) {
        this.cli_celular = cli_celular;
    }

    public static int getCli_contrasenia() {
        return cli_contrasenia;
    }

    public void setCli_contrasenia(int cli_contrasenia) {
        this.cli_contrasenia = cli_contrasenia;
    }

    public static int getCli_fecha_nacimiento() {
        return cli_fecha_nacimiento;
    }

    public void setCli_fecha_nacimiento(int cli_fecha_nacimiento) {
        this.cli_fecha_nacimiento = cli_fecha_nacimiento;
    }
}
