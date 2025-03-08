import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args){
        System.out.println("Nhap phuong trinh bac nhat");

        Scanner input = new Scanner(System.in);

        System.out.print("Nhap a :");
        double a = input.nextDouble();

        System.out.print("Nhap b :");
        double b = input.nextDouble();

        System.out.print("Nhap c :");
        double c = input.nextDouble();

        if (a != 0) {
            double x = (b -c) / a;
            System.out.println("x = "+x);
        } else {
            if (b == c) {
                System.out.println("Phuong trinh voi moi x");
            } else {
                System.out.println("Khong co nghiem");
            }
        }
    }
}
