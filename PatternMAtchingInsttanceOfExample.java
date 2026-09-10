package java_8_Feature;

public class PatternMAtchingInsttanceOfExample {

    // Method using traditional instanceof checking
    private static void doprocess(Object Obj) {

        // Check whether Obj is an instance of String
        if (Obj instanceof String) {

            // Explicitly cast Object to String
            String str = (String) Obj;

            // Convert the String into uppercase and print it
            System.out.println(str.toUpperCase());
        }
    }

    // Another method using the same traditional approach
    private static void doprocessAgain(Object Obj) {

        // Check whether Obj is a String
        if (Obj instanceof String) {

            // Explicitly cast Object to String
            String str = (String) Obj;

            // Convert the String into uppercase and print it
            System.out.println(str.toUpperCase());
        }
    }

    public static void main(String[] args) {

        // Call the first method with a String value
        doprocess("Wlcome");

        // Call the second method with a String value
        doprocessAgain("HELLO");
    }
}