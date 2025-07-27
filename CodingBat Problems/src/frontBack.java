public class frontBack {

    public String frontBack(String str) {
        if (str.length() <= 1) {
            return str;
        }
        char first = str.charAt(0);
        char last = str.charAt(str.length() - 1);
        String middle = str.substring(1, str.length() - 1);
        return last + middle + first;
    }

    public static void main(String[] args) {
        frontBack obj = new frontBack();
        System.out.println(obj.frontBack("code")); // eodc
        System.out.println(obj.frontBack("a"));    // a
        System.out.println(obj.frontBack("ab"));   // ba
    }
}

