public class startHi {

    public boolean startHi(String str) {
        return str.startsWith("hi");
    }

    public static void main(String[] args) {
        startHi obj = new startHi();
        System.out.println(obj.startHi("hi there"));
        System.out.println(obj.startHi("hi"));
        System.out.println(obj.startHi("hello hi"));
        System.out.println(obj.startHi("hiya"));
        System.out.println(obj.startHi("Hi"));
    }
}
