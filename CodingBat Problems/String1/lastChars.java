public class lastChars {
    public static String lastChars(String a, String b) {
        char first = a.length() > 0 ? a.charAt(0) : '@';
        char last = b.length() > 0 ? b.charAt(b.length() - 1) : '@';
        return "" + first + last;
    }

    public static void main(String[] args) {
        System.out.println(lastChars("last", "chars")); // ls
        System.out.println(lastChars("yo", "java"));    // ya
        System.out.println(lastChars("hi", ""));        // h@
        System.out.println(lastChars("", ""));          // @@
    }
}
