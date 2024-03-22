package Oefening2;

public class Cirkel {
    private double straal;

     public Cirkel(double straal){
        this.straal=straal;
    }

    public String toString() {
        return "Straal:" + straal;
    }


    public double geefOmtrek(){
        return (Math.PI * straal * 2);
    }

    public double geefOppervlakte(){
        return (Math.PI * straal*straal);
    }

}






