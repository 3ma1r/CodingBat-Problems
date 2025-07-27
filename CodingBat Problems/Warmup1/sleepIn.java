public class sleepIn {
    public static void main(String[] args) {
        sleepIn obj = new sleepIn();
        System.out.println(obj.sleepIn(false, true)); // should print: true
        System.out.println(obj.sleepIn(true, false)); // should print: false
        System.out.println(obj.sleepIn(false, false)); // should print: true
    }

    public boolean sleepIn(boolean weekday, boolean vacation) {

        if (weekday == false && vacation == true){
            return true;
        }
        else if (weekday == true && vacation == false){
            return false;
        }

        else {
            return true;
        }


    }
}
