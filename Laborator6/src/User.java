
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.util.ArrayList;
public class User {
    public static void main(String[] args){

        try {

            FileInputStream f = new FileInputStream("parole.txt");
           // FileOutputStream g = new FileOutputStream("parole.txt");

            String line;
            byte[] buffer = new byte[255];
            f.read(buffer,0,255);
            f.close();
            String lines = new String(buffer);
            String[] veclines = lines.split("\n");
            int counter=1,anotherCounter = 0,k=veclines.length;
            boolean checker=false;
            while(checker==false) {
                Scanner sc = new Scanner(System.in);
                String name, pass;
                System.out.println("Insert username");
                name = sc.nextLine();
                System.out.println("Insert password");
                boolean foundUser = false;
                pass = sc.nextLine();
                for (int i = 0; i < k; i++) {
                    line = veclines[i];
                    String[] tokens = line.split(" ");
                    if (name.equals(tokens[0])) {
                        if (pass.equals(tokens[1])) {
                            System.out.println("acces permis");
                            checker = true;
                            foundUser = true;
                            break;
                        } else {
                            if (name.equals(tokens[0]) && !pass.equals(tokens[1])) {
                                foundUser = true;
                                if (pass.equals(tokens[1])) {
                                    System.out.println("acces permis");
                                    checker = true;
                                    foundUser = true;
                                    break;
                                }else {
                                    System.out.println("parola gresita");
                                    while (counter <= 2) {
                                        counter++;
                                        String newinput;
                                        System.out.println("Insert password");
                                        newinput = sc.nextLine();
                                        if (pass.equals(newinput)) {
                                            System.out.println("acces permis");
                                            checker = true;
                                            break;
                                        }
                                        if (counter == 3) {
                                            System.out.println("Cont blocat");
                                            checker = true;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (foundUser == false) {
                        anotherCounter++;
                    }
                    if (anotherCounter == 5) {
                        System.out.println("Nu ai cont. Inregistreaza-te");
                        checker = true;
                        break;
                    }


                }
                f.close();
            }
         //   g.close();
        }catch(IOException e){
            System.out.println("No file found");
            e.printStackTrace();
        }
    }
}
