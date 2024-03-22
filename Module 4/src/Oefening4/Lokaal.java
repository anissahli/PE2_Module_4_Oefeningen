package Oefening4;
///Een Lokaal bestaat uit een adres, gebouw (bv. blok A), een verdieping en lokaalnummer
public class Lokaal {
    private String adres;
    private String gebouw;
    private int verdieping;
    private int lokaalnummer;

    public Lokaal(String adres,String gebouw, int verdieping, int lokaalnummer){
        this.adres=adres;
        this.gebouw=gebouw;
        this.verdieping=verdieping;
        this.lokaalnummer=lokaalnummer;
    }

    public String toString(){
        return adres + " " + gebouw + verdieping+ "-" +lokaalnummer;
    }
}
