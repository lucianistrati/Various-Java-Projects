import java.io.*;
import java.util.*;
public class Matrice {
    static boolean Prime(int num) {
        boolean ok= true;
        for (int i = 2; i <= num / 2; ++i) {
            if (num%i == 0) {
                ok= false;
                break;
            }
        }
        return ok;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N = sc.nextInt();
        int ans=0;
        int v;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                v=sc.nextInt();
                if(Prime(v)==false){
                    ans+=1;
                }
            }
        }
        System.out.println(ans);
    }
}
