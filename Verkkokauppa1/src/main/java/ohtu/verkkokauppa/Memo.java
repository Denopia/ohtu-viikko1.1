package ohtu.verkkokauppa;

import java.util.ArrayList;

public interface Memo {

    ArrayList<String> getTapahtumat();

    void lisaaTapahtuma(String tapahtuma);
    
}
