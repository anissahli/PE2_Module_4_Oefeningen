package Oefening3;


//Maak vervolgens een klasse hond die hier van gaat overerven. Honden nemen alles over van een Huisdier en voegen nog een stamboeknummer toe. Voorzie ook hiervoor een constructor, getters, setters en een toString functie.
//
//Maak om alles te testen enkele huisdieren en honden aan en kijk wat er gebeurt als je hun gegevens afdrukt.

public class Huisdier {
    private float gewicht;
    private int leeftijd;
    private String naam;

    public Huisdier(float gewicht,int leeftijd,String naam){
        this.gewicht=gewicht;
        this.leeftijd=leeftijd;
        this.naam=naam;
    }

    public void setGewicht(float gewicht){
        this.gewicht=gewicht;
    }
    public void setLeeftijd(int leeftijd){
        this.leeftijd=leeftijd;
    }
    public void setNaam(String naam){
        this.naam=naam;
    }

    public float getGewicht(){
        return gewicht;
    }
    public int getLeeftijd(){
        return leeftijd;
    }
    public String getNaam(){
        return naam;
    }

    public String toString(){
        return naam+" weegt "+gewicht+" kilo en is " + leeftijd+" jaar oud.";
    }
}

