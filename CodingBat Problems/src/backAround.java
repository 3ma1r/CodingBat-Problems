public class backAround {

    public String backAround(String str) {
        char last = str.charAt(str.length() - 1);
        return last + str + last;
    }

    public static void main(String[] args) {
        backAround obj = new backAround();
        System.out.println(obj.backAround("cat"));
        System.out.println(obj.backAround("Hello"));
        System.out.println(obj.backAround("a"));     
    }
}
