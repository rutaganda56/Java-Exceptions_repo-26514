import java.io.FileInputStream;
import java.io.IOException;

public class FileNotFoundException {

    public static void main(String[] args) {
        // File path to a non-existent file
        String filePath = "missing_file.txt";

        try {
            // Attempt to open the non-existent file
            FileInputStream fileInput = new FileInputStream(filePath);
            System.out.println("File opened successfully!");

            fileInput.close(); // Closing the stream
        } catch (java.io.FileNotFoundException e) {
            // This block will handle the specific FileNotFoundException
            System.out.println("FileNotFoundException: File not found - " + filePath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

