package org.EcoDosRuedas;

import java.util.Scanner;

public class BuyIntentionServices {

    public static void readBuyIntentions() {
        BuyIntentionDataAccess.readBuyIntentionsDB();
    }

    public static void readBuyIntentionsByAlias() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingresa el alias: ");
        String input_alias = sc.nextLine();
        BuyIntentionDataAccess.readBuyIntentionsByAliasDB(input_alias);
    }


}
