public class frontBack {
    public String frontBack(String str) {
        if (str.length() <= 1) return str;
        String mid = str.substring(1, str.length() - 1);
        return str.charAt(str.length() - 1) + mid + str.charAt(0);
    }

    public static void main(String[] args) {
        frontBack obj = new frontBack();
        System.out.println(obj.frontBack("code"));   // eodc
        System.out.println(obj.frontBack("a"));      // a
        System.out.println(obj.frontBack("ab"));     // ba
        System.out.println(obj.frontBack("hello"));  // oellh
        System.out.println(obj.frontBack("12345"));  // 52341
    }
}
