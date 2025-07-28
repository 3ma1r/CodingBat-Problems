public class SquirrelPlay {
    public boolean squirrelPlay(int temp, boolean isSummer) {
        int upper = isSummer ? 100 : 90;
        return temp >= 60 && temp <= upper;
    }

    public static void main(String[] args) {
        SquirrelPlay sp = new SquirrelPlay();
        System.out.println(sp.squirrelPlay(70, false)); 
        System.out.println(sp.squirrelPlay(95, false));
        System.out.println(sp.squirrelPlay(95, true));
        System.out.println(sp.squirrelPlay(59, false));
        System.out.println(sp.squirrelPlay(101, true));
    }
}
