package org.EcoDosRuedas;

import java.util.Scanner;

public class ClientServices {
    public static void createClient() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un alias: ");
        String input_alias = sc.nextLine();
        System.out.println("Escribe el nombre: ");
        String input_name = sc.nextLine();
        System.out.println("Escribe el apelllido: ");
        String input_lastName = sc.nextLine();
        System.out.println("Escribe el email: ");
        String input_email = sc.nextLine();
        System.out.println("Escribe el celular: ");
        String input_cel = sc.nextLine();
        System.out.println("crea un password: ");
        int input_pass = sc.nextInt();
        ;

        Clients client = new Clients();
        client.setCli_alias(input_alias);
        client.setCli_nombre(input_name);
        client.setCli_apellido(input_lastName);
        client.setCli_email(input_email);
        client.setCli_celular(input_cel);
        client.setCli_contrasenia(input_pass);
        client.setCli_fecha_nacimiento(input_pass);


        ClientDataAccess.createClientesDB();
    }

    public static void readClients() {
        ClientDataAccess.readClientsDB();
    }

    public static void updateClient() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el alias del cliente que deseas actualizar: ");
        String input_alias = sc.nextLine();
        System.out.println("Escribe el celular: ");
        String input_cel = sc.nextLine();

        Clients client = new Clients();
        client.setCli_celular(input_cel);

        ClientDataAccess.updateClientesDB(input_alias);
    }


    public static void deleteClient() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el alias del cliente que desea eliminar: ");
        String input_alias = sc.nextLine();
        ClientDataAccess.deleteClientDB(input_alias);
    }
}
