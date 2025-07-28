public class fizzString {
    public String fizzString(String str) {
        boolean startsF = str.startsWith("f");
        boolean endsB = str.endsWith("b");
        if (startsF && endsB) return "FizzBuzz";
        if (startsF) return "Fizz";
        if (endsB) return "Buzz";
        return str;
    }

    public static void main(String[] args) {
        fizzString obj = new fizzString();
        System.out.println(obj.fizzString("fig"));
        System.out.println(obj.fizzString("dib"));
        System.out.println(obj.fizzString("fib"));
        System.out.println(obj.fizzString("hello"));
    }
}
