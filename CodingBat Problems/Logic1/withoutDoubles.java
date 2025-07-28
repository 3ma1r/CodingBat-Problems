public class withoutDoubles {
    public int withoutDoubles(int die1, int die2, boolean noDoubles) {
        if (noDoubles && die1 == die2) {
            die1 = die1 == 6 ? 1 : die1 + 1;
        }
        return die1 + die2;
    }

    public static void main(String[] args) {
        withoutDoubles obj = new withoutDoubles();
        System.out.println(obj.withoutDoubles(2, 3, true));   
        System.out.println(obj.withoutDoubles(3, 3, true));
        System.out.println(obj.withoutDoubles(3, 3, false));
        System.out.println(obj.withoutDoubles(6, 6, true));
    }
}
