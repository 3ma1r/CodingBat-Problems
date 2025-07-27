public class monkeyTrouble {
    public static void main(String[] args) {
        monkeyTrouble obj = new monkeyTrouble();
        System.out.println(obj.monkeyTrouble(true, true));
        System.out.println(obj.monkeyTrouble(false, false));
        System.out.println(obj.monkeyTrouble(false, true));
    }
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile==true && bSmile==true){
            return true;
        }
        else if (aSmile==false && bSmile == false){
            return true;
        }
        else{
            return false;
        }

    }
}
