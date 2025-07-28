public class AlarmClock {
    public String alarmClock(int day, boolean vacation) {
        boolean isWeekend = (day == 0 || day == 6);
        if (vacation) {
            return isWeekend ? "off" : "10:00";
        } else {
            return isWeekend ? "10:00" : "7:00";
        }
    }

    public static void main(String[] args) {
        AlarmClock ac = new AlarmClock();
        System.out.println(ac.alarmClock(1, false)); 
        System.out.println(ac.alarmClock(5, false));
        System.out.println(ac.alarmClock(0, false));
        System.out.println(ac.alarmClock(6, true));
    }
}
