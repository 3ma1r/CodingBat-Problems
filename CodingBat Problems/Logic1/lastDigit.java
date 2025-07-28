public class lastDigit {
    public boolean lastDigit(int a, int b, int c) {
        int aDigit = a % 10;
        int bDigit = b % 10;
        int cDigit = c % 10;
        return (aDigit == bDigit || aDigit == cDigit || bDigit == cDigit);
    }

    public static void main(String[] args) {
        lastDigit obj = new lastDigit();
        System.out.println(obj.lastDigit(23, 19, 13)); // true
        System.out.println(obj.lastDigit(23, 19, 12)); // false
        System.out.println(obj.lastDigit(23, 19, 3));  // true
        System.out.println(obj.lastDigit(7, 17, 27));  // true
    }
}
