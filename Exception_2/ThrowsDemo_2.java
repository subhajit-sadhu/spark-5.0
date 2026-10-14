package Main_course.Exception_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsDemo_2 {
    public static void main(String[] args) {
        try {
            readFile();
            
        } catch (IOException e) {
            System.out.println("Handeled in main " + e.getMessage());
        }
    }
    public  static  void readFile() throws IOException
    {
        BufferedReader br  = new BufferedReader(new  FileReader("Data.txt"));
        String line = br.readLine();
        System.out.println("First line   " + line);
        br.close();
    }
}
