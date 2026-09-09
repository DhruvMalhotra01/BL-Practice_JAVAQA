package Exceptions;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Problem09_ThrowsKeyword {
    // Changed to throw IOException
    static void openFile() throws IOException {
        FileReader reader = new FileReader("Exceptions/data.txt");
        System.out.print("File opened successfully");
        reader.close(); // Now this is covered
    }

    public static void main(String[] args){
        try {
            openFile();
        } 
        catch (FileNotFoundException e) {
            System.out.print("Error: File not found");
        } 
        catch (IOException e) {
            System.out.print("Error: Could not close the file or read from it");
        }
    }
}