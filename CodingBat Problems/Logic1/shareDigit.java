public class shareDigit {
    public static boolean shareDigit(int a, int b) {
        int a1 = a / 10;
        int a2 = a % 10;
        int b1 = b / 10;
        int b2 = b % 10;

        return a1 == b1 || a1 == b2 || a2 == b1 || a2 == b2;
    }

    public static void main(String[] args) {
        System.out.println(shareDigit(12, 23));
        System.out.println(shareDigit(12, 43));
        System.out.println(shareDigit(12, 44));
        System.out.println(shareDigit(19, 91));  
    }
}
