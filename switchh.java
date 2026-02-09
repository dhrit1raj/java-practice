import java.util.Scanner;

public class switchh {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day number: ");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Wed-Sun");
        }

        sc.close();
    }
}
