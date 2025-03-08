import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.6);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle(3.5, "indigo", false);

        System.out.println("Pre-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }

        Arrays.sort(circles, new Comparator<ComparableCircle>() {
            @Override
            public int compare(ComparableCircle c1, ComparableCircle c2) {
                return Double.compare(c1.getRadius(), c2.getRadius());
            }
        });

        System.out.println("After-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }
    }
}