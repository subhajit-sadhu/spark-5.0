package Main_course.Exception_2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// import javax.xml.crypto.Data;

public class ThrowsDemo {
    public static void main(String[] args) throws IOException{
        m1();
    }
          public static void m1() throws IOException{
            m2();
        }
        public static void m2() throws IOException{  
            readFile();
        }
        public static void readFile() throws IOException{
            try {
                BufferedReader br  = new BufferedReader(new  FileReader("Data.txt"));
                String line = br.readLine();
                System.out.println("First line   " + line);
                br.close();
                                
            } catch (FileNotFoundException e) {
                System.out.println("File not Found");
            }
            catch(IOException e ){
                System.out.println("Catch IOException ..");

            }
        }
}
