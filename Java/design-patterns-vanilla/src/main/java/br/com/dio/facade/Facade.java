package br.com.dio.facade;

public class Facade {

    public static void clientMigrate(String name, String zipcode) {
        final String city = ZipAPI.getInstance().retrieveCity(zipcode);
        final String state = ZipAPI.getInstance().retrieveState(zipcode);
        CRMService.save(name, zipcode, city, state);
    }
}
