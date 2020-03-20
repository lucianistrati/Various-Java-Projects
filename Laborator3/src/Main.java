import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(),M=0;
        String[] a,b;
        String rez=new String("");
        int min=0;
        a = new String[N+1];
        b = new String[N+1];
        for(int i=0;i<=N;i++) {

            a[i] = sc.nextLine();
            int dim = a[i].length();
            boolean ok = false;
            String reverse = new StringBuilder(a[i]).reverse().toString();
            if (a[i].equals(reverse))
            {       ok = true;
            }
            if(ok==true){
                b[M]=new String();
                b[M]=a[i];
                if(b[M].length()>min){
                    min=b[M].length();
                    rez=b[M];
                }
                M++;
            }
        }
        System.out.println(rez);
    }
}
