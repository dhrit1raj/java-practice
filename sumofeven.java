public class sumofeven {
    public static void main(String[] args) {

        int sum = 0;

        for (int i = 2; i <= 1000; i += 2) {
            sum += i;
        }

        System.out.println("Sum = " + sum);
    }
}


