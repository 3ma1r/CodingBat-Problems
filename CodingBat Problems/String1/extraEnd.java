public class extraEnd {
    public static String extraEnd(String str) {
        String end = str.substring(str.length() - 2);
        return end + end + end;
    }

    public static void main(String[] args) {
        System.out.println(extraEnd("Hello"));
        System.out.println(extraEnd("ab"));
        System.out.println(extraEnd("Hi"));
        System.out.println(extraEnd("Java"));
    }
}
