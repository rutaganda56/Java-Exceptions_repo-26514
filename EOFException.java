import java.io.*;
import java.io.IOException;

public class EOFException {
    public static void main(String[] args) {
        String fileName = "example.dat";

        // Step 1: Write data to the file
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {
            // Writing some integers into the file
            dos.writeInt(100);
            dos.writeInt(200);
            dos.writeInt(300);
            System.out.println("Data successfully written to file: " + fileName);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        // Step 2: Attempt to read beyond EOF
        try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
            // Reading integers from the file
            while (true) {
                int number = dis.readInt();
                System.out.println("Read number: " + number); // Print each number
            }
        } catch (java.io.EOFException e) {
            System.out.println("Reached end of file! No more data to read.");
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
