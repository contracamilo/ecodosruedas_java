package org.EcoDosRuedas;

public class BrandsServices {
    public static void readBrands() {
        BrandsDataAccess.readBrandDB();
    }

    public static void readBrands2019() {
        BrandsDataAccess.readBrandDB2019();
    }
}
