package org.EcoDosRuedas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClientDataAccess {
    public static Connection makeDbConnection() throws SQLException {
        DbConnection connection = new DbConnection();
        return connection.getConnection();
    }

    public static void renderError(SQLException e, String action) {
        System.out.println("ups, won´t be able to " + action + " this message!");
        throw new RuntimeException(e);
    }

    public static void createClientesDB() {
        try {
            Connection cnx = makeDbConnection();
            if (cnx != null) {
                PreparedStatement ps = null;
                String query = "INSERT INTO tbl_cliente(cli_alias, cli_nombre, cli_apellido, cli_email, cli_celular, cli_contrasenia, cli_fecha_nacimiento) VALUES (?,?,?,?,?,?,?)";
                ps = cnx.prepareStatement(query);
                ps.setString(1, Clients.getCli_alias());
                ps.setString(2, Clients.getCli_nombre());
                ps.setString(3, Clients.getCli_apellido());
                ps.setString(4, Clients.getCli_email());
                ps.setString(5, Clients.getCli_celular());
                ps.setInt(6, Clients.getCli_contrasenia());
                ps.setInt(7, Clients.getCli_fecha_nacimiento());
                ps.executeUpdate();
                System.out.println("Usuario creado");
            }
        } catch (SQLException e) {
            renderError(e, "create");
        }
    }

    public static void readClientsDB() {
        try {
            Connection cnx = makeDbConnection();
            if (cnx != null) {
                PreparedStatement ps = null;
                ResultSet rs = null;
                String query = "SELECT * FROM tbl_cliente";
                ps = cnx.prepareStatement(query);
                rs = ps.executeQuery();

                while (rs.next()) {
                    System.out.println("==================================");
                    System.out.println("Alias: " + rs.getString("cli_alias"));
                    System.out.println("Nombre: " + rs.getString("cli_nombre") + rs.getString("cli_apellido"));
                    System.out.println("Email: " + rs.getString("cli_email"));
                    System.out.println("Tel: " + rs.getString("cli_celular") + "\n");
                }
            }
        } catch (SQLException e) {
            renderError(e, "read");
        }
    }

    public static void updateClientesDB(String alias) {
        try {
            Connection cnx = makeDbConnection();
            if (cnx != null) {
                PreparedStatement ps = null;
                String query = "UPDATE tbl_cliente SET cli_celular = ? WHERE cli_alias = ?";
                ps = cnx.prepareStatement(query);
                ps.setString(1, Clients.getCli_celular());
                ps.setString(2, alias);
                ps.executeUpdate();
                System.out.println("Cliente actualizado");
            }
        } catch (SQLException e) {
            renderError(e, "update");
        }
    }

    public static void deleteClientDB(String alias) {
        try {
            Connection cnx = makeDbConnection();
            if (cnx != null) {
                PreparedStatement ps = null;
                String query = "DELETE FROM tbl_cliente WHERE cli_alias = ?";
                ps = cnx.prepareStatement(query);
                ps.setString(1, alias);
                ps.executeUpdate();
                System.out.println("Cliente ha sido removido");
            }
        } catch (SQLException e) {
            renderError(e, "delete");
        }
    }

}
