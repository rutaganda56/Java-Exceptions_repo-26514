import java.util.Optional;

public class NullPointerException {

    public static void main(String[] args) {

        // Example 1: Null Pointer without proper null check (will throw NullPointerException)
        try {
            String str = null;
            // Attempting to call a method on a null reference
            int length = str.length(); // This will throw NullPointerException
        } catch (java.lang.NullPointerException e) {
            System.out.println("Caught NullPointerException: Tried to access method on a null reference");
        }

        // Example 2: Null Check to avoid NullPointerException
        String str2 = null;
        if (str2 != null) {
            System.out.println("Length of the string: " + str2.length());
        } else {
            System.out.println("The string is null, cannot access its length.");
        }

        // Example 3: Using Optional to handle possible null values safely
        String str3 = null;
        Optional<String> optionalStr = Optional.ofNullable(str3);  // Wrap the string in Optional
        optionalStr.ifPresent(s -> System.out.println("Length of the string: " + s.length()));  // Only execute if not null
        if (!optionalStr.isPresent()) {
            System.out.println("The string is null, cannot execute the method on it.");
        }

        // Example 4: Returning default value to avoid null reference
        String name = getName(); // This method could return null
        String result = (name != null) ? name : "Default Name";  // Use a default value if name is null
        System.out.println("Name: " + result);

        // Example 5: Initializing objects properly to avoid NullPointerException
        MyClass obj = new MyClass();
        obj.sayHello(); // Safe call because obj is properly initialized
    }

    // Example of a method that might return null
    public static String getName() {
        return null;  // This could return null
    }

    // Example class to show object initialization
    static class MyClass {
        void sayHello() {
            System.out.println("Hello, I'm initialized and safe to use!");
        }
    }
}
