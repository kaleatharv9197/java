package java_8_Feature;

public class TextBlockExample {

    public static void main(String[] args) {

        String content = " Today OOP using JAVA\nModule Will End \n New Module Is DS";

        System.out.println(content);

        String anotherContent = """
                JAVA IS AWESOME.
                PYTHON IS BEST
                """;

        System.out.println(anotherContent);
    }
}