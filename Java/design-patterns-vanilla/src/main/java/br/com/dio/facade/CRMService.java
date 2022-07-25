package br.com.dio.facade;

public class CRMService {

    private CRMService(){
        super();
    }

    public static void save(String client, String zipcode, String city, String state) {
        System.out.println("Cliente salvo no sistema de CRM");
    }
}
