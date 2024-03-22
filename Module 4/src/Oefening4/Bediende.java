package Oefening4;

public class Bediende extends Persoon{
    protected Lokaal lokaal;


    public Bediende(String voornaam, String achternaam,boolean personeelslid,Lokaal lokaal){
        super(voornaam,achternaam,personeelslid);
        this.lokaal=lokaal;
    }

    protected void setLokaal(Docent persoon, Lokaal lokaal){
           persoon.lokaal=lokaal;

    }

    protected void setLokaal(Bediende persoon, Lokaal lokaal){
            persoon.lokaal=lokaal;
    }

    public String toString(){
        return super.toString() + " heeft als lokaal " +lokaal;
    }


}