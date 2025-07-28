public class In1To10 {
    public boolean in1To10(int n, boolean outsideMode) {
        return outsideMode ? (n <= 1 || n >= 10) : (n >= 1 && n <= 10);
    }

    public static void main(String[] args) {
        In1To10 i = new In1To10();
        System.out.println(i.in1To10(5, false));   
        System.out.println(i.in1To10(11, false));
        System.out.println(i.in1To10(11, true));
        System.out.println(i.in1To10(1, true));
    }
}
