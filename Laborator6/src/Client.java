import java.io.FileWriter;
import java.io.*;
import java.lang.*;
import java.util.ArrayList;

public class Client {
    public static void main(String[] args){
        try {
            BufferedReader g = new BufferedReader(new FileReader("clienti.txt"));
            String line;
            ArrayList<String> minor,major;
            minor = new ArrayList<String>();
            major = new ArrayList<String>();
            while((line=g.readLine())!=null){
                String[] tokens = line.split(" ");
                int ans = Integer.parseInt(tokens[2]);
                if(ans>=18)
                {
                    major.add(line);
                }else {
                    minor.add(line);
                }
            }
            System.out.println("There are " +minor.size() + " minor persons:");
            for(int i=0;i<minor.size();i++){
                System.out.println(minor.get(i));
            }
            System.out.println("There are " +major.size() + " major persons:");
            for(int i=0;i<major.size();i++){
                System.out.println(major.get(i));
            }
            g.close();
        }catch(IOException e){
            System.out.println("No file found");
            e.printStackTrace();
        }
    }
}
