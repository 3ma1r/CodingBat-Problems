public class lastTwo {
    public static String lastTwo(String str) {
        int len = str.length();
        if (len < 2) return str;
        return str.substring(0, len - 2) + str.charAt(len - 1) + str.charAt(len - 2);
    }

    public static void main(String[] args) {
        System.out.println(lastTwo("coding")); // codign
        System.out.println(lastTwo("cat"));    // cta
        System.out.println(lastTwo("ab"));     // ba
        System.out.println(lastTwo("a"));      // a
    }
}
