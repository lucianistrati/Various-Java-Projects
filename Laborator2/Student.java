import java.util.*;


public class Student {
    public String nume;
    public int nota;
    public Student(String nume){
        this.nume = nume;

    }
    public Student(String nume,int nota){
        this.nume=nume;
        this.nota=nota;
    }

    public String getNume(){
        return nume;
    }

    public void setNume(String nume){
        this.nume=nume;
    }
    public int getNota(){
        return nota;
    }

    public void setNota(int nota){
        this.nota=nota;
    }
    public void afisareStudent(){
        System.out.println(this.nume + " are nota  " + this.nota);
    }
    public void func(){
        String s;
        int p=0,q=0;
        Scanner sc = new Scanner(System.in);
        Student[] studs = new Student[3];
        for(int i=0;i<3;i++) {
            s = sc.nextLine();
            String[] vec = s.split(" ");
            String nume = vec[0];
            int note = Integer.parseInt(vec[1]);
            studs[i] = new Student(nume, note);

        }
        for(int i=0;i<3;i++){
            studs[i].afisareStudent();
        }
    }
}