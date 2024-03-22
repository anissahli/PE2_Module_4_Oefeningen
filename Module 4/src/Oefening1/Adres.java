package Oefening1;

public class Adres {
    private String straatnaam;
    private int huisnummer;
    private String bus;
    private long postcode;
    private String woonplaats;

    public Adres(String straatnaam, int huisnummer, String bus, long postcode, String woonplaats) {
        this.straatnaam = straatnaam;
        this.huisnummer = huisnummer;
        this.bus = bus;
        this.postcode = postcode;
        this.woonplaats = woonplaats;
    }

    //getters
    public String getStraatnaam() {
        return straatnaam;
    }

    public String getWoonplaats() {
        return woonplaats;
    }

    public int getHuisnummer() {
        return huisnummer;
    }

    public String getBus() {
        return bus;
    }

    public long getPostcode() {
        return postcode;
    }

    //setters

    public void setStraatnaam(String straatnaam) {
        this.straatnaam = straatnaam;
    }

    public void setWoonplaats(String woonplaats) {
        this.woonplaats = woonplaats;
    }

    public void setHuisnummer(int huisnummer) {
        this.huisnummer = huisnummer;
    }

    public void setBus(String bus) {
        this.bus = bus;
    }

    public void setPostcode(long postcode) {
        if (postcode >= 1000 && postcode <= 9999) {
            this.postcode = postcode;
        }
    }


    public String toString() {
        return straatnaam + " " + huisnummer + " " + bus + "\n" + postcode + " " + woonplaats;
    }

}