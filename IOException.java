import java.io.FileReader;

public class IOException {
    public static void main(String[] args) {
        // File path for a non-existent file
        String filePath = "non_existent_file.txt";

        try {
            // Attempt to read from a file that does not exist
            FileReader reader = new FileReader(filePath);
            System.out.println("File opened successfully!");

            // Close the file
            reader.close();
        } catch (java.io.IOException e) {
            // Catch any I/O related errors
            System.out.println("IOException: An error occurred while trying to read the file.");
        }
    }
}
