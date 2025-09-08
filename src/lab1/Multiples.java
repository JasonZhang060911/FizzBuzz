package lab1;

public class Multiples {
    public static void main(String[] args) {
        // Calls the overloaded version (n=1000, a=3, b=5)
        int result1 = multiples();

        // Calls the original version
        int result2 = multiples(20, 3, 5);

        System.out.println("Default result: " + result1);
        System.out.println("Custom result: " + result2);
    }

    public static int multiples() {
        // Calls the other multiples method with default values
        return multiples(1000, 3, 5);
    }

    public static int multiples(int n, int a, int b) {
        int counter = 0;
        for(int i=1;i<n;i++) {
            if (i % a == 0 || i % b == 0) {
                System.out.println(i);
                counter++;
            }
        }
        return counter;
    }
}
