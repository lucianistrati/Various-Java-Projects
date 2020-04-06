import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        try {
            FileWriter fout = new FileWriter("Pairs.txt");
            for (int i = 0; i < n; i++) {
                int a, b;
                try {
                    a = sc.nextInt();
                    b = sc.nextInt();
                    if (a >= b) {
                        throw new PairsException("You inserted a pair where second>first");
                    } else {
                        fout.write(a + " " + b + "\n");
                    }
                } catch (PairsException e) {
                    System.out.println("Please insert a pair where first<second");
                    int c, d;
                    c = sc.nextInt();
                    d = sc.nextInt();
                    if (c < d) {
                        fout.write(c + " " + d + "\n");
                    }
                }
            }
            fout.close();
        } catch(IOException e){
            System.out.println("No file found");
            e.printStackTrace();
        }
    }
}
