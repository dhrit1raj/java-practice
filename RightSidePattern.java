public class RightSidePattern {
    public static void main(String[] args) {

        int n = 4;
        int gap = 0;

        // TOP HALF
        for (int i = n; i >= 1; i--) {

            // leading spaces (right alignment)
            for (int s = 1; s <= gap; s++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            gap += 4;
            System.out.println();
        }

        // reset gap
        gap -= 4;

        // BOTTOM HALF
        for (int i = 1; i <= n; i++) {

            // leading spaces
            for (int s = 1; s <= gap; s++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            gap -= 4;
            System.out.println();
        }
    }
}

