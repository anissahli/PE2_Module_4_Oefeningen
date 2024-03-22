package Oefening1;


//Maak een klasse Persoon, van een persoon willen we de volgende gegevens opslaan:
//
//Voornaam
//Achternaam
//email
//adres (Object van klasse Adres, dat mag je uit de oefeningen van Classes overnemen)
//Zorg voor een constructor waar je een persoon kan aanmaken met een voor- en achternaam. Overschrijf ook nog de toString methode om de gegevens te kunnen afdrukken. Om te testen of alles werkt maak je in je main klasse twee personen aan en geef je hen een adres. Druk hun gegevens af om te controleren of correct is ingegeven.
//
//Als uitdaging zoek je nog een manier toe om te tellen hoeveel personen er in totaal zijn aangemaakt. Hiervoor kan je gebruik maken van static

public class Persoon {
    private String voornaam;
    private String achternaam;
    private String email;
    private Adres adres;
    private static int aantal=0;

    public Persoon(String voornaam, String achternaam){
        this.voornaam=voornaam;
        this.achternaam=achternaam;
        aantal++;
    }

    //hier de getters en setters => niet gedaan aangezien repititeif


    public static int getAantal(){
        return aantal;
    }

    public String toString(){
       return "Voornaam:"+voornaam+"\nAchternaam:"+achternaam+"\nEmail:"+email+"\nAdres:"+adres +"\nAantal mensen: "+aantal;
    }


    public static void main(String[] args){
        Persoon persoon1=new Persoon("Anissa","Sahli");
        System.out.println(persoon1);

        Persoon persoon2=new Persoon("Nora","Sahli");
        Persoon persoon3=new Persoon("Nora","Gharbi");
        persoon1.adres=new Adres("Oostedenstraat",119,"Sahli",1080,"Brussel");
        persoon2.adres=new Adres("Nijverheidskaai",86,"EhB",1070,"Brussel");


        System.out.println(persoon3);

    }
}
