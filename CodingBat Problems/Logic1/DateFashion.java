public class DateFashion {
    public int dateFashion(int you, int date) {
        if (you <= 2 || date <= 2) return 0;
        if (you >= 8 || date >= 8) return 2;
        return 1;
    }

    public static void main(String[] args) {
        DateFashion df = new DateFashion();
        System.out.println(df.dateFashion(5, 10)); 
        System.out.println(df.dateFashion(5, 2));
        System.out.println(df.dateFashion(5, 5));
        System.out.println(df.dateFashion(9, 1));
        System.out.println(df.dateFashion(2, 9));
    }
}
