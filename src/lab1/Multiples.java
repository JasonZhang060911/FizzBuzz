package lab1;

public class Multiples {
    public static void main(String[] args) {
        System.out.println(multiples(10,3,5));
    }

    static int multiples(int n, int a, int b) {
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
