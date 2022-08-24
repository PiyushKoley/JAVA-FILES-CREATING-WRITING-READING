import java.io.File;
import java.io.FileWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            // Here we are createing file -> myfile but name of the file is -> (createfileinjava) and location of file is (F:) Directory...
            File myfile = new File("F:\\createfileinjava.txt");

            if(myfile.createNewFile()){
                System.out.println("done"); // if new file get created...
            }
            else{
                System.out.println("sorry"); // if file with same name already exist...
            }

            // Here we are writing in file -> myfile...
            FileWriter writer = new FileWriter(myfile);
            writer.write("written this through java FileWriter 11111");
            writer.close();
            System.out.println("written successfully");

            // here we are reading file -> myfile...
            Scanner sc = new Scanner(myfile);
            String s = "";
            while (sc.hasNextLine()) {
                s += sc.nextLine() +" ";
            }
            sc.close();
            System.out.println(s);

            // Here we are checking another folder (F:) and checking sub folder and files...
            File file = new File("F:\\");
            File [] arr = file.listFiles();
            System.out.println("Is F: file -> "+file.isFile());
            System.out.println("Is F: directory -> "+ file.isDirectory());
            for(File f : arr) {
                if(f.isDirectory())
                    System.out.println("Directory -> " + f.getName());
                else
                    System.out.println("file -> " + f.getName());
            }

            //If we write system.exit(0) then finally block will not execute and if we don't write then finally block will execute...
            System.exit(0);

        }

        catch(Exception e){
            System.out.println("error");
            e.printStackTrace();
        }

        finally {
            System.out.println("ok this is working");
        }

    }
}