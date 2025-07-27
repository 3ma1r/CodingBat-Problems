public class notString {

    public String notString(String str) {
        if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
            return str;
        } else {
            return "not " + str;
        }
    }

    public static void main(String[] args) {
        notString obj = new notString();
        System.out.println(obj.notString("candy"));     
        System.out.println(obj.notString("x"));
        System.out.println(obj.notString("not bad"));
    }
}
