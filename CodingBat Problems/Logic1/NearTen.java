public class NearTen {
    public boolean nearTen(int num) {
        int mod = num % 10;
        return mod <= 2 || mod >= 8;
    }

    public static void main(String[] args) {
        NearTen obj = new NearTen();
        System.out.println(obj.nearTen(12));
        System.out.println(obj.nearTen(17));
        System.out.println(obj.nearTen(19));
        System.out.println(obj.nearTen(21));
    }
}
