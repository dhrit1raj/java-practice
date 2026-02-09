import java.util.Scanner;

public class homework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n: ");
        int n = sc.nextInt();

        int sum = n * (n + 1) / 2;

        sc.close(); 

        System.out.println("Sum of first " + n + " natural numbers = " + sum);

       

    }
}


