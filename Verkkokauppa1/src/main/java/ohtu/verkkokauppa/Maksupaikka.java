package ohtu.verkkokauppa;


public interface Maksupaikka {

    boolean tilisiirto(String nimi, int viitenumero, String tililta, String tilille, int summa);
    
}
