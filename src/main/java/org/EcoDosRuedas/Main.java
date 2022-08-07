package org.EcoDosRuedas;

import java.util.Scanner;

public class Main {
    public static void userActions(int option) {
        switch (option) {
            case 1:
                ClientServices.createClient();
                break;
            case 2:
                ClientServices.readClients();
                break;
            case 3:
                ClientServices.updateClient();
                break;
            case 4:
                ClientServices.deleteClient();
                break;
            case 5:
                BuyIntentionServices.readBuyIntentions();
                break;
            case 6:
                BrandsServices.readBrands();
                break;
            case 7:
                BikeService.readBikes();
                break;
            case 8:
                MotorBikeService.readMotorBikes();
                break;
            case 9:
                BrandsServices.readBrands2019();
                break;
            case 10:
                BuyIntentionServices.readBuyIntentionsByAlias();
                break;
            default:
                break;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc;
        do {
            System.out.println("========================");
            System.out.println("EcoDosRuedas");
            System.out.println("1. Crear Usuario");
            System.out.println("2. listar usuarios");
            System.out.println("3. Actualizar Cliente");
            System.out.println("4. Borrar Cliente");
            System.out.println("5. listar intenciones compra");
            System.out.println("6. listar marcas fabricantes");
            System.out.println("7. listar bicicletas");
            System.out.println("8. listar motos electricas");

            System.out.println("9. listar bicicletas producidas durante o despues del 2019");
            System.out.println("10. marcas consultadas por alias");

            System.out.println("0. Salir");
            opc = sc.nextInt();

            userActions(opc);
        } while (opc != 0);
    }
}