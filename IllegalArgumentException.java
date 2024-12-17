public class IllegalArgumentException {
    public static void main(String[] args) {

        // Example 1: Method expecting positive number, but receives negative number
        try {
            setAge(-5);  // This will throw IllegalArgumentException
        } catch (java.lang.IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        }

        // Example 2: Method expecting non-empty string, but receives empty string
        try {
            printName("");  // This will throw IllegalArgumentException
        } catch (java.lang.IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        }

        // Example 3: Valid arguments passed to methods
        setAge(25);  // This will work fine
        printName("John");  // This will work fine
    }

    // Method that expects a positive integer for age
    public static void setAge(int age) {
        if (age < 0) {
            throw new java.lang.IllegalArgumentException("Age cannot be negative: " + age);
        }
        System.out.println("Age set to: " + age);
    }

    // Method that expects a non-empty string for a name
    public static void printName(String name) {
        if (name == null || name.isEmpty()) {
            throw new java.lang.IllegalArgumentException("Name cannot be empty or null");
        }
        System.out.println("Name: " + name);
    }
}

