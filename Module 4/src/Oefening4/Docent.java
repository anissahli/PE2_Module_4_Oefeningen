package Oefening4;

import java.sql.Array;
import java.util.ArrayList;

public class Docent extends Persoon{
    private String specialisatie;
    protected Lokaal lokaal;
    ArrayList<Student> toegewezenStudenten = new ArrayList<Student>();

    public Docent(String voornaam, String achternaam,boolean personeelslid, String specialisatie,Lokaal lokaal){
        super(voornaam,achternaam,personeelslid);
        this.specialisatie=specialisatie;
        this.lokaal=lokaal;
    }
//Docenten begeleiden meerdere studenten, probeer er voor te zorgen dat een docent meerdere studenten toegewezen
// krijgt, hiervoor kan je een array bekijken.

public void toewijzingStudenten(Student student){
        toegewezenStudenten.add(student);
}

public String toString(){
        return super.toString() + " heeft als specilisatie: "+specialisatie+" en als lokaal: "+lokaal;
}

}
