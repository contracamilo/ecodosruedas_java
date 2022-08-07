package org.EcoDosRuedas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BikeDataAccess {
    public static Connection makeDbConnection() throws SQLException {
        DbConnection connection = new DbConnection();
        return connection.getConnection();
    }

    public static void renderError(SQLException e, String action) {
        System.out.println("ups, no ha sido posible " + action + " bicicletas!");
        throw new RuntimeException(e);
    }

    public static void readBikeDB() {
        try {
            Connection cnx = makeDbConnection();
            if (cnx != null) {
                PreparedStatement ps = null;
                ResultSet rs = null;
                String query = "SELECT * FROM tbl_bicicleta";
                ps = cnx.prepareStatement(query);
                rs = ps.executeQuery();

                while (rs.next()) {
                    System.out.println("==================================");
                    System.out.println("Serial: " + rs.getInt("bic_serial"));
                    System.out.println("Cod. Fabricante: " + rs.getInt("fab_nit"));
                    System.out.println("Precio: $" + rs.getInt("bic_precio"));
                    System.out.println("Año: " + rs.getInt("bic_anio_construccion"));
                    System.out.println("Tipo: " + rs.getString("bic_tipo") + "\n");
                }
            }
        } catch (SQLException e) {
            renderError(e, "listar");
        }
    }
}
