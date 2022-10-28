import java.util.Scanner;
public class Runner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Which value would you like to input: ");
        int input = s.nextInt();
        int output;
        int n = 1;
        while ((n) < input)
        {
            n = n+n;
        }
        n = (int)(n-(((double)1/2)*n));
        output = (input - n)+1;
        System.out.println("Your value is: " + output);
    }
}
