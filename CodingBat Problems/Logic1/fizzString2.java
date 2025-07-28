public class fizzString2 {
    public String fizzString2(int n) {
        if (n % 15 == 0) return "FizzBuzz!";
        if (n % 3 == 0) return "Fizz!";
        if (n % 5 == 0) return "Buzz!";
        return n + "!";
    }

    public static void main(String[] args) {
        fizzString2 obj = new fizzString2();
        System.out.println(obj.fizzString2(1));
        System.out.println(obj.fizzString2(2));
        System.out.println(obj.fizzString2(3));
        System.out.println(obj.fizzString2(5));
        System.out.println(obj.fizzString2(15));
    }
}
