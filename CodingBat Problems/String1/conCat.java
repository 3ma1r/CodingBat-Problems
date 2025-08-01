public class conCat {
    public static String conCat(String a, String b) {
        if (a.length() > 0 && b.length() > 0 && a.charAt(a.length() - 1) == b.charAt(0)) {
            return a + b.substring(1);
        }
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(conCat("abc", "cat")); // abcat
        System.out.println(conCat("dog", "cat")); // dogcat
        System.out.println(conCat("abc", ""));    // abc
        System.out.println(conCat("", "cat"));    // cat
    }
}
