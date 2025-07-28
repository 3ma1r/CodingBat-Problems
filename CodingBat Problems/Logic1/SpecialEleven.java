public class SpecialEleven {
    public boolean specialEleven(int n) {
        return n % 11 == 0 || n % 11 == 1;
    }

    public static void main(String[] args) {
        SpecialEleven s = new SpecialEleven();
        System.out.println(s.specialEleven(22));  
        System.out.println(s.specialEleven(23));
        System.out.println(s.specialEleven(24));
        System.out.println(s.specialEleven(33));
    }
}
