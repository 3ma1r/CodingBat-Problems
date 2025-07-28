public class lessBy10 {
    public boolean lessBy10(int a, int b, int c) {
        return (Math.abs(a - b) >= 10 || Math.abs(a - c) >= 10 || Math.abs(b - c) >= 10);
    }

    public static void main(String[] args) {
        lessBy10 obj = new lessBy10();
        System.out.println(obj.lessBy10(1, 7, 11));  
        System.out.println(obj.lessBy10(1, 7, 10));
        System.out.println(obj.lessBy10(11, 1, 7));
        System.out.println(obj.lessBy10(10, 20, 15));
    }
}
