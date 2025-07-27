public class sumDouble {
    public static void main(String[] args) {
        sumDouble obj = new sumDouble();
        System.out.println(obj.sumDouble(1, 2));
        System.out.println(obj.sumDouble(3, 3));
    }
    public int sumDouble(int a, int b) {
        int sum= a+b;
        if(a==b){
            sum=sum*2;
        }
        return sum;
    }
}
