import java.io.File;
import java.util.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader; 

public class filesh {

    public void readData(File f){
        BufferedReader br = null;
        try{
            br = new BufferedReader(new FileReader(f));
        }

        catch(FileNotFoundException e){
            e.printStackTrace();

        }
    }
    public static void main(String[] args){
        File f = new File("Day3\\names.txt");

        try (Scanner sc = new Scanner(f)) {
            while(sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try (FileWriter fw = new FileWriter(f)){
            fw.write("Shiva");
            fw.append("\nShreya");
        }
        catch(IOException e1){
            e1.printStackTrace();
        }
    }
}
