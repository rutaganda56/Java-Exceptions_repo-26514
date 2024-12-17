public class NumberFormatException {
    public static void main(String[] args) {

        String str1 = "12345";
        String str2 = "abc123";
        String str3 = "12.34";
        String str4 = "";

        System.out.println("Parsing str1: " + parseNumber(str1));
        System.out.println("Parsing str2: " + parseNumber(str2));
        System.out.println("Parsing str3: " + parseNumber(str3));
        System.out.println("Parsing str4: " + parseNumber(str4));
    }

    public static String parseNumber(String str) {
        // Regular expression to check if the string is a valid integer
        if (str != null && str.matches("-?\\d+")) {
            try {
                int num = Integer.parseInt(str);
                return "Successfully parsed: " + num;
            } catch (java.lang.NumberFormatException e) {
                return "Caught NumberFormatException: Invalid number format for string '" + str + "'";
            }
        } else {
            return "Invalid format for string '" + str + "'";
        }
    }
}

