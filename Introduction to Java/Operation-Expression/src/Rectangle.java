import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args){
        float height;
        float width;

        Scanner a = new Scanner(System.in);

        System.out.println("Nhap height : ");
        height = a.nextFloat();

        System.out.println("Nhap width : ");
        width = a.nextFloat();

        float area = height * width;
        System.out.println("Area : " + area);
    }
}
