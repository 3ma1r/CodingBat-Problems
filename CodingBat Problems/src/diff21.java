public class diff21 {

    public int diff21(int n) {
        if (n <= 21) {
            return 21 - n;
        } else {
            return (n - 21) * 2;
        }
    }

    public static void main(String[] args) {
        diff21 obj = new diff21();
        System.out.println(obj.diff21(19)); 
        System.out.println(obj.diff21(25));
    }
}
