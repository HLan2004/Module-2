import java.util.Scanner;

public class SoNguyenTo {
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng số nguyên tố cần in ra: ");
        int numbers = scanner.nextInt();
        int count = 0; // Đếm số lượng số nguyên tố đã tìm được
        int N = 2; // Bắt đầu kiểm tra từ số 2

        while (count < numbers) {
            if (isPrime(N)) {
                System.out.print(N + "\n");
                count++;
            }
            N++;
        }
        scanner.close();
    }
}