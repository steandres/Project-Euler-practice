package Problem_1;

/**
 * If we list all the natural numbers below 10
 * that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 * The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */

public class Multiples {
    public static void main(String[] args) {
        int numOne = 3;
        int numTwo = 5;
        int total = 0;

        for (int i = 0; i < 10; i++) {
            if (i % numOne == 0){
                total += i;
            }
            else if (i % numTwo == 0){
                total += i;
            }
        }

        System.out.println("The sum of these multiples is "+total);
        
    }
}

