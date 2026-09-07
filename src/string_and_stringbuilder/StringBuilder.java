package string_and_stringbuilder;

public class StringBuilder{

    public static void main(String[] args) {

        java.lang.StringBuilder builder = new java.lang.StringBuilder();
        builder.append(" ");
        builder.append("\nCurrent");
        builder.append(" ");
        builder.append("time");
        builder.append(" ");
        builder.append("is");
        builder.append(" ");
        builder.append("5:25");
        builder.append(" ");
        builder.append("PM");
        builder.append(" ");
        builder.append("\nToday");
        builder.append(" ");
        builder.append("4");
        builder.append(" ");
        builder.append("topics");
        builder.append(" ");
        builder.append("are");
        builder.append(" ");
        builder.append("covered");
        builder.append(" ");
        builder.append("\nJava");
        builder.append(" ");
        builder.append("is");
        builder.append(" ");
        builder.append("simple");
        builder.append(" ");
        builder.append("right");
        builder.append(" ");
        builder.append("now");

        System.out.println(builder);
    }
}