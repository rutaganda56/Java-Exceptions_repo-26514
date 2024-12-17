public class ClassNotFoundException {
    public static void main(String[] args) {
        try {
            System.out.println("Attempting to load a non-existent class...");
            // Load a class that doesn't exist
            Class.forName("MissingClass");
        } catch (java.lang.ClassNotFoundException e) {
            System.out.println("Exception: Class not found!");
            e.printStackTrace();
        }
    }
}



