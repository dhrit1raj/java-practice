public class operators {
    public static void main(String[] args) {

        // Arithmetic Operators
        double a = 5;
        double b = 3;

        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a > b  = " + (a > b));
        System.out.println("a < b  = " + (a < b));
        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));
        System.out.println("a >= b = " + (a >= b));
        System.out.println("a <= b = " + (a <= b));

        // Logical Operators
        boolean x = true;
        boolean y = false;

        System.out.println("\nLogical Operators:");
        System.out.println("x && y = " + (x && y));
        System.out.println("x || y = " + (x || y));
        System.out.println("!x = " + (!x));

        // Assignment Operators
        double c = 5;
        c += 3;
        c -= 2;
        c *= 2;
        c /= 3;

        System.out.println("\nAssignment Operators:");
        System.out.println("Final value of c = " + c);

        // Unary Operators
        double d = 5;

        System.out.println("\nUnary Operators:");
        System.out.println("++d = " + (++d));
        System.out.println("d-- = " + (d--));
        System.out.println("d = " + d);
    }
}

    

