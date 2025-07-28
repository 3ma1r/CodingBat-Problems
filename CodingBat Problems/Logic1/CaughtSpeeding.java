public class CaughtSpeeding {
    public int caughtSpeeding(int speed, boolean isBirthday) {
        int allowance = isBirthday ? 5 : 0;
        if (speed <= 60 + allowance) {
            return 0;
        } else if (speed <= 80 + allowance) {
            return 1;
        } else {
            return 2;
        }
    }

    public static void main(String[] args) {
        CaughtSpeeding cs = new CaughtSpeeding();
        System.out.println(cs.caughtSpeeding(60, false));
        System.out.println(cs.caughtSpeeding(65, false));
        System.out.println(cs.caughtSpeeding(65, true));
        System.out.println(cs.caughtSpeeding(85, true));  
    }
}
