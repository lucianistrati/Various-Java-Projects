import java.util.*;


public class Main {
    public static void main(String[] args) {
        citireNote();
        int n=4;
        Elev e = new Elev("Andrei",4);
        e.afisareElev();
        citireNumere(n);
        Student s = new Student("Andrei",6
        );
        s.func();
    }
    public static void citireNote(){
        int c=0,s=0,x;
        Scanner sc = new Scanner(System.in);
        x=sc.nextInt();
        while(x!=-1){
            s=s+x;
            x=sc.nextInt();
            c++;
            System.out.println(s);
        }
        System.out.println(s);
        System.out.println(s/c);
    }
    public static void citireNumere(int n){
        int s=0,x;
        int[] a;
        int[] b;
        int[] c;
        a= new int[n];
        int p=0,q=0;
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++) {
            x = sc.nextInt();
            a[i] = x;
            if(x%2==0)
                p++;
            else
                q++;
        }
        b=new int[p];
        c=new int[q];
        p=0;
        q=0;
        for(int i=0;i<n;i++) {
            if (a[i] % 2 == 0) {
                b[p] = a[i];
                p++;
            } else {
                c[q] = a[i];
                q++;
            }
        }
        if(p>q)
        System.out.println(
               "primul"
        );
        else
            System.out.println("al doilea");
    }

}