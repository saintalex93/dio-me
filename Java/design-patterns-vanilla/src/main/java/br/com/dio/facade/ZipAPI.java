package br.com.dio.facade;

public class ZipAPI {

    private static final ZipAPI instance = new ZipAPI();

    private ZipAPI(){
        super();
    }

    public static ZipAPI getInstance(){
        return instance;
    }

    public String retrieveCity(String zipCode){
        return "Araraquara";
    }

    public String retrieveState(String zipCode){
        return "SP";
    }
}
