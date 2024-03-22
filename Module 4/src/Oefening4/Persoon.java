package Oefening4;


import javax.script.ScriptEngine;
import java.text.AttributedCharacterIterator;

public class Persoon {
    private String voornaam;
    private String achternaam;
    public boolean personeelslid;

    public Persoon(String voornaam, String achternaam,boolean personeelslid){
        this.voornaam=voornaam;
        this.achternaam=achternaam;
        this.personeelslid=personeelslid;
    }

    public String getVoornaam(){
        return voornaam;
    }
    public String getAchternaam(){
        return achternaam;
    }
    public boolean getPersoneelslid(){
        return personeelslid;
    }
    public void setVoornaam(String naam){
        this.voornaam=naam;
    }
    public void setAchternaam(String naam){
        this.achternaam=naam;
    }
    public void setPersoneelslid(boolean personeelslid){
        this.personeelslid=personeelslid;
    }

    public String toString(){
        return voornaam+" "+achternaam;
    }

    public static void main (String[] args){
        Student Anissa=new Student("Anissa","Sahli",false,271204,"TI");
        System.out.println(Anissa);
        Lokaal lokaal1=new Lokaal("Kaai","A",3,046);
        Docent docent1=new Docent("Sarah","Maertens",true,"TI",lokaal1);
        System.out.println(docent1);
        Lokaal lokaal2=new Lokaal("Bloemenhof","I",1,236);
        Bediende Secretaresse=new Bediende ("Zahra","Blant",true,lokaal1);
        Secretaresse.setLokaal(docent1,lokaal2);
        System.out.println(docent1);

    }

}
