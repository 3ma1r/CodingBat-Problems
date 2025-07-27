public class startHi {
    public boolean startHi(String str) {
        return str.startsWith("hi");
    }

    public static void main(String[] args) {
        startHi obj = new startHi();
        System.out.println(obj.startHi("hi there"));   // true
        System.out.println(obj.startHi("hi"));         // true
        System.out.println(obj.startHi("hello hi"));   // false
    }
}
