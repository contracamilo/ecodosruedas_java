package org.EcoDosRuedas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BrandsDataAccess {
    public static Connection makeDbConnection() throws SQLException {
        DbConnection connection = new DbConnection();
        return connection.getConnection();
    }

    public static void renderError(SQLException e, String action) {
        System.out.println("ups, no ha sido posible " + action + " esta marca!");
        throw new RuntimeException(e);
    }


    public static void readBrandDB() {
        try {
            Connection cnx = makeDbConnection();
            if (cnx != null) {
                PreparedStatement ps = null;
                ResultSet rs = null;
                String query = "SELECT * FROM tbl_fabricante ORDER BY fab_nombre ASC;";
                ps = cnx.prepareStatement(query);
                rs = ps.executeQuery();

                System.out.println("=============== Fabricantes ===================");
                while (rs.next()) {
                    System.out.println(rs.getString("fab_nombre"));
                }
            }
        } catch (SQLException e) {
            renderError(e, "listar");
        }
    }

    public static void readBrandDB2019() {
        try {
            Connection cnx = makeDbConnection();
            if (cnx != null) {
                PreparedStatement ps = null;
                ResultSet rs = null;
                String query = "SELECT f.fab_nombre, b.bic_precio, b.bic_anio_construccion FROM tbl_fabricante f, tbl_bicicleta b WHERE f.fab_nit = b.fab_nit AND b.bic_anio_construccion >= 2019 ORDER BY f.fab_nombre;";
                ps = cnx.prepareStatement(query);
                rs = ps.executeQuery();

                System.out.println("=============== Bicicletas 2019 ===================");
                while (rs.next()) {
                    System.out.println("===========================================");
                    System.out.println("Marca: " + rs.getString("fab_nombre"));
                    System.out.println("Precio: $" + rs.getString("bic_precio"));
                    System.out.println("Año: " + rs.getString("bic_anio_construccion"));
                }
                System.out.println("\n");
            }
        } catch (SQLException e) {
            renderError(e, "listar");
        }
    }


}
