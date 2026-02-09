import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Give your age:");
        int age = sc.nextInt();

        sc.nextLine(); // 🔥 clears leftover newline

        System.out.println("Input Your Name:");
        String name = sc.nextLine();

        System.out.println(age);
        System.out.println(name);

        sc.close();
    }
}
  