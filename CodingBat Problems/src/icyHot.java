public class icyHot {
    public boolean icyHot(int temp1, int temp2) {
        return (temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0);
    }

    public static void main(String[] args) {
        icyHot obj = new icyHot();
        System.out.println(obj.icyHot(120, -1));   
        System.out.println(obj.icyHot(-1, 120));
        System.out.println(obj.icyHot(2, 120));
    }
}
