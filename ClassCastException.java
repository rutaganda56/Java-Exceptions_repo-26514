public class ClassCastException {
    public static void main(String[] args) {

        // Create a reference of type Object, which can hold any type of object
        Object obj = "Hello, World!"; // obj holds a String

        // Invalid type cast: Trying to cast the Object to an Integer, which is not related to String
        try {
            Integer number = (Integer) obj; // This will throw ClassCastException
        } catch (java.lang.ClassCastException e) {
            System.out.println("Caught ClassCastException: Cannot cast a String to an Integer.");
        }

        // Valid cast: String to String
        try {
            String str = (String) obj; // This will succeed
            System.out.println("Successfully casted to String: " + str);
        } catch (java.lang.ClassCastException e) {
            System.out.println("Caught ClassCastException while casting to String.");
        }

        // Another invalid type cast: Object to a non-related class
        try {
            Double d = (Double) obj; // This will throw ClassCastException
        } catch (java.lang.ClassCastException e) {
            System.out.println("Caught ClassCastException: Cannot cast a String to a Double.");
        }
    }
}
