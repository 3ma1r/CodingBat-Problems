public class missingChar {

    public String missingChar(String str, int n) {
        return str.substring(0, n) + str.substring(n + 1);
    }

    public static void main(String[] args) {
        missingChar obj = new missingChar();
        System.out.println(obj.missingChar("kitten", 1));
        System.out.println(obj.missingChar("kitten", 0));
        System.out.println(obj.missingChar("kitten", 4));
    }
}
