import java.util.Scanner;
public class SumDigits {
    public static void main(String[] args) {
        

        // create scanner object
        Scanner input = new Scanner(System.in);

        // prompt and read "a" then "b"
        int a = readNum(input);
        int b = readNum(input);

        // check if the value's even digits are equal
        Boolean isEven = gatherSum(a, b);


    }

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

    public static Boolean gatherSum(int a, int b) {

        int lengthA = 0, lengthB = 0, y = a, z = b;

        // get the length of a
        while (y > 0) {
            y /= 10;
            lengthA++;
        }
        // get the length of b
        while (z > 0) {
            z /= 10;
            lengthB++;
        }

        





        // test
        System.out.printf("%d has %d digits \n", a, lengthA);
        System.out.printf("%d has %d digits \n", b, lengthB);
        return true;

    }
}