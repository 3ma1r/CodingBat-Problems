public class makePi {
    public int[] makePi() {
        return new int[]{3, 1, 4};
    }

    public static void main(String[] args) {
        makePi obj = new makePi();
        int[] result = obj.makePi();
        for (int n : result) {
            System.out.print(n + " ");
        }
    }
}
