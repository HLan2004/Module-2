import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] array = new int[10];
        int n = 5;
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 5;
        array[4] = 6;


        System.out.print("Mảng ban đầu: ");
        displayArray(array, n);


        System.out.print("Nhập phần tử cần chèn: ");
        int x = scanner.nextInt();


        System.out.print("Nhập vị trí cần chèn: ");
        int index = scanner.nextInt();


        if (index < 0 || index > n) {
            System.out.println("Không thể chèn phần tử vào mảng.");
        } else {

            for (int i = n; i > index; i--) {
                array[i] = array[i - 1];
            }
            array[index] = x;
            n++;


            System.out.print("Mảng sau khi chèn: ");
            displayArray(array, n);
        }
    }


    public static void displayArray(int[] arr, int length) {
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
