package Oefening3;

public class Hond extends Huisdier{
    private int stamboeknummer;

    public Hond(float gewicht, int leeftijd,String naam, int stamboeknummer){
        super(gewicht, leeftijd, naam);
        this.stamboeknummer=stamboeknummer;
    }

    public void setStamboeknummer(int stamboeknummer){
        this.stamboeknummer=stamboeknummer;
    }

    public int getStamboeknummer(){
        return stamboeknummer;
    }

    public String toString(){
        return super.toString()+"\nStamboeknummer: "+ stamboeknummer;
    }

    public static void main(String[] args){
        Hond woef=new Hond(5,2,"Woefie",255);
        Hond miauw=new Hond(5,2,"Miauwie",256);
        System.out.println(woef);
        System.out.println(miauw);
        Huisdier blauw=new Huisdier(5,2,"Blauwie");
        System.out.println(blauw);
    }
}