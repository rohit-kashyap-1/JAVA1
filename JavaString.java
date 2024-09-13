public class JavaString {
    public static void main(String[] args) {
        String name = "Rohit Dev ";
        String sister = "Kawai";
        double phone = 9555199515d;
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.indexOf('h'));
        //string formatting
        System.out.println(String.format("My name is %s ",name));
        String message = """
                This is the message for %s
                If you are watching this message please call me at %f
                Yoyo \b\b\b Yooyo
                """.formatted(sister,phone);
        System.out.println(message);
    }
}
