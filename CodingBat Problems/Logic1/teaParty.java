public class teaParty {
    public int teaParty(int tea, int candy) {
        if (tea < 5 || candy < 5) return 0;
        if (tea >= 2 * candy || candy >= 2 * tea) return 2;
        return 1;
    }

    public static void main(String[] args) {
        teaParty obj = new teaParty();
        System.out.println(obj.teaParty(6, 8));
        System.out.println(obj.teaParty(3, 8));
        System.out.println(obj.teaParty(20, 6));
        System.out.println(obj.teaParty(5, 5));
    }
}
