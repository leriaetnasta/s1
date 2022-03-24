public class fizzbuzz2 {
    public static void main(String [] args) {
        int x = 0;
        String fizz = "fizz";
        String buzz = "buzz";
        String p;

        while (x < 100) {
            p = (x % 15 == 0 ? (fizz + buzz) : (x % 3 == 0 ? fizz : (x % 5 == 0 ? buzz : String.valueOf(x))));
            System.out.println(p);
            x++;

        }
    }
    }
