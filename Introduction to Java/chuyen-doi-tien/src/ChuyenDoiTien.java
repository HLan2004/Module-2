import java.util.Scanner;

public class ChuyenDoiTien {
public static void main (String[] args) {
    double usd;
    Scanner sc = new Scanner (System.in);
    System.out.print ("Mòi bạn nhập số tiền USD: ");
    usd = sc.nextDouble ();
    double quydoi= usd * 23000;
    System.out.print ("Giá trį VND: " + quydoi);
    }
}