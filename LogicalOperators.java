import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cash = sc.nextInt();
        if (cash<10 ) {
            System.out.println("cannot bye anything");
            System.out.println("get more cash");
        }

        else if (cash>10 && cash<50){
            System.out.println("Can bye one Item");
        }

        else{
            System.out.println("Can get both");


            sc.close();
        }
    }
}
