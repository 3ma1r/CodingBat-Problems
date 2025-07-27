public class front22 {

    public String front22(String str) {
        String front = str.length() < 2 ? str : str.substring(0, 2);
        return front + str + front;
    }

    public static void main(String[] args) {
        front22 obj = new front22();
        System.out.println(obj.front22("kitten"));
        System.out.println(obj.front22("Ha"));
        System.out.println(obj.front22("abc"));
        System.out.println(obj.front22("a"));
        System.out.println(obj.front22(""));
    }
}
