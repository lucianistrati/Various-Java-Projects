import java.util.*;
public class Elev {
    private String nume;
    private int materii;
    public Elev(String nume){
        this.nume = nume;

    }
    public Elev(String nume,int materii){
        this.nume=nume;
        this.materii=materii;
    }

    public String getNume(){
        return nume;
    }

    public void setNume(String nume){
        this.nume=nume;
    }
    public int getMaterii(){
        return materii;
    }

    public void setNume(int materii){
        this.materii=materii;
    }
    public void afisareElev(){
        System.out.println(this.getNume() + " are in total " + this.getMaterii());
    }
}