package Oefening2;

//Een zwembad zal bestaan uit een cirkelvormig reservoir water, een pad er rond en een omheining rond het pad.
// Je kan het jezelf gemakkelijker maken door gebruik te maken van de klasse Cirkel uit de oefeningen voor Classes,
// dit helpt voor de berekeningen. Om dit voor te stellen hebben we enkele gegevens nodig:
//
//de straal van het zwembad zelf
//de breedte van het pad
//de prijs voor het pad, we gaan er van uit dat dit een prijs per vierkante meter is, bv. 45 €/m²
//de prijs voor de omheining, we gaan er van uit dat dit een prijs is per meter, bv. 80.75 €/m
//
// Binnen deze klasse schrijf je functies uit om het volgende te berekenen:
//De prijs van het pad
//De prijs van de omheining
//De totale prijs hiervoor

public class Zwembad {
    private double straalZwembad;
    private double breedte;
    private Cirkel binnencirkel;
    private Cirkel buitencirkel;

    private final double prijsVoorPad=45;
    private final double prijsVoorOmheining=80.75;

    public Zwembad(double straalZwembad,double breedte){
        this.straalZwembad=straalZwembad;
        this.breedte=breedte;
        this.binnencirkel=new Cirkel(straalZwembad);
        this.buitencirkel=new Cirkel(straalZwembad+breedte);
    }

    public double prijsPad(){
        return (buitencirkel.geefOppervlakte()-binnencirkel.geefOppervlakte())*prijsVoorPad;
    }

    public double prijsOmheining(){
        return buitencirkel.geefOmtrek()*prijsVoorOmheining;
    }


    public double totalePrijs(){
        return prijsPad()+prijsOmheining();
    }

    public String toString(){
        return "Een zwembad met deze straal: "+straalZwembad+" en een pad met deze breedte: "+breedte+"\nDe prijs voor het pad: "+prijsPad()+" euro"+"\nDe prijs voor de omheining: "+prijsOmheining()+" euro"+"\nDit is dus de totale prijs: "+totalePrijs()+" euro";
    }

    public static void main(String[] args){
        Zwembad mijnDroomZwembad= new Zwembad(4,5);
        System.out.println(mijnDroomZwembad);
    }
}
