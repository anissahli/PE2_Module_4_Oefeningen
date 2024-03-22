package Oefening4;

public class Student extends Persoon {
    private long studentennummer;
    private String specialisatie;

    public Student(String voornaam, String achternaam,boolean personeelslid, long studentennummer, String specialisatie){
        super(voornaam, achternaam,personeelslid);
        this.studentennummer=studentennummer;
        this.specialisatie=specialisatie;
    }

    public long getStudentennummer(){
        return studentennummer;
    }
    public String getSpecialisatie(){
        return specialisatie;
    }
    public void setStudentennummer(long studentennummer){
        this.studentennummer=studentennummer;
    }
    public void setSpecialisatie(String specialisatie){
        this.specialisatie=specialisatie;
    }

    public String toString(){
        return super.toString()+" heeft studentennummer: "+studentennummer+" en specialisatie: "+specialisatie;
    }

}