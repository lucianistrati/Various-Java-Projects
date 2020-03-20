import java.util.*;
import java.io.*;

public class anagrame {

    public static void main(String[] args) {
        String s="roma",t="mora";

        if(s.length()!=t.length()){
            System.out.println("Sirurile nu sunt anagrame");
        }
        boolean ok=true;
        char[] VS,VT;
        VS = new char[s.length()];
        VT = new char[s.length()];

        for (int i=0;i<s.length();i++) {
            VS[i]=s.charAt(i);
            VT[i]=t.charAt(i);
        }

        Arrays.sort(VS);
        Arrays.sort(VT);
        for(int i=0;i<s.length();i++){
            if(VS[i]!=VT[i]){
                System.out.println("Sirurile nu sunt anagrame");
                ok=false;
            }
        }
        if(ok==true) {
            System.out.println("Sirurile sunt anagrame");
        }
    }
}
