import java.util.Scanner;
public class SumDigits {
    public static void main(String[] args) {

        // create scanner object
        Scanner input = new Scanner(System.in);

        // prompt and read "a" then "b"
        int a = readNum(input),
            b = readNum(input);

        // get the sum of the even digits in each integer
        int evenA = sumEven(a), 
            evenB = sumEven(b);
        
        // print the sum of the even numbers
        System.out.printf("The sum of %d's even digits is %d \n", a, evenA);
        System.out.printf("The sum of %d's even digits is %d \n", b, evenB);

        // print if sums of evens are equal
        System.out.println("Are the sums of each number's even integers the same? " + isEqual(evenA, evenB));
    }

    // reads an integer; if negative, method is called again; if positive, integer is retruned
    public static int readNum(Scanner input) {

        // prompt user
        System.out.print("Please enter a positive an integer: ");

        // read integer
        int x = input.nextInt();

        if (x > 0)
            // return the valid integer
            return x;
        else  
            // call the function again if the integer is invalid  
            return readNum(input); 
    }

    // returns the sum of even digits in a number
    public static int sumEven(int z) {

        // store the sum of evens
        int even = 0;

        while (z >= 10) {

            // isolate digit
            int digit = z % 10;

            // if digit is divisible by 2 add it to even.
            if (digit % 2 == 0) 
                even += digit;

            // divide z by ten to get next digit
            z /= 10;
        }

        // check the last digit
        if (z < 10 && z % 2 == 0) 
            even += z;

        // return the sum of even digits
        return even;
    }

    // returns true if the numbers are equal, false otherwise
    public static Boolean isEqual(int c, int d) {
        
        // is equal
        if (c == d) 
            return true;

        // is not equal
        else 
            return false;
    }

}