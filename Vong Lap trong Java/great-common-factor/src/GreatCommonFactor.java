import java.util.Scanner;

public class GreatCommonFactor {
    public static void main(String[] args) {
        int a;
        int b;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = input.nextInt();
        System.out.println("Enter b: ");
        b = input.nextInt();

        int c = Math.abs(a);
        int d = Math.abs(b);

        if (c == 0 || d == 0) {
            System.out.println("No greatest common factor");
        }

        while (c != d) {
            if (c > d)
                c = c - d;
            else
                d = d - c;
        }

        System.out.println("Greatest common factor: " + c);
    }
}
