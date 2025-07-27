public class parrotTrouble {

    public boolean parrotTrouble(boolean talking, int hour) {
        return talking && (hour < 7 || hour > 20);
    }

    public static void main(String[] args) {
        parrotTrouble obj = new parrotTrouble();
        System.out.println(obj.parrotTrouble(true, 6));
        System.out.println(obj.parrotTrouble(true, 7));
        System.out.println(obj.parrotTrouble(true, 21));
        System.out.println(obj.parrotTrouble(false, 6));
    }
}
