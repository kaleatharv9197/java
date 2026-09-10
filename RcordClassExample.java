package java_8_Feature;

public class RcordClassExample {

    public static void main(String[] args) {

        // Creating an object of Record class
        SimpleTest t1 = new SimpleTest(101, "Automation");

        // Accessing record components
        System.out.println(t1.testId());
        System.out.println(t1.name());

        // Automatically generated toString() method
        System.out.println(t1);
    }

    @Override
    public String toString() {
        return "RcordClassExample [getClass()=" + getClass() + ", hashCode()=" + hashCode()
                + ", toString()=" + super.toString() + "]";
    }
}

// Record class
record SimpleTest(int testId, String name) {
}