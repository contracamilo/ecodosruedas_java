package org.EcoDosRuedas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BuyIntentionDataAccess {
    public static Connection makeDbConnection() throws SQLException {
        DbConnection connection = new DbConnection();
        return connection.getConnection();
    }

    public static void renderError(SQLException e, String action) {
        System.out.println("ups, won´t be able to " + action + " this message!");
        throw new RuntimeException(e);
    }


    public static void readBuyIntentionsDB() {
        try {
            Connection cnx = makeDbConnection();
            if (cnx != null) {
                PreparedStatement ps = null;
                ResultSet rs = null;
                String query = "SELECT * FROM tbl_intencion_compra";
                ps = cnx.prepareStatement(query);
                rs = ps.executeQuery();

                while (rs.next()) {
                    System.out.println("==================================");
                    System.out.println("Codigo: " + rs.getString("int_codigo"));
                    System.out.println("Alias Cliente: " + rs.getString("cli_alias"));
                    System.out.println("Marca consultada: " + rs.getString("int_consulta"));
                    System.out.println("Fecha Registro: " + rs.getString("int_fecha_registro") + "\n");
                }
            }
        } catch (SQLException e) {
            renderError(e, "read");
        }
    }

    public static void readBuyIntentionsByAliasDB(String alias) {
        try {
            Connection cnx = makeDbConnection();
            if (cnx != null) {
                PreparedStatement ps = null;

                ResultSet rs = null;
                String query = "SELECT int_consulta FROM tbl_intencion_compra WHERE cli_alias = ? ORDER BY int_consulta;";
                ps = cnx.prepareStatement(query);
                ps.setString(1, alias);
                rs = ps.executeQuery();
                System.out.println("Marcas consultadas por: " + alias);
                System.out.println("==================================");
                while (rs.next()) {
                    System.out.println(rs.getString("int_consulta"));
                }
                System.out.println("==================================");
            }
        } catch (SQLException e) {
            renderError(e, "read");
        }
    }


}
