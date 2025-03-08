import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int n = array.length;


        System.out.print("Mảng ban đầu: ");
        displayArray(array, n);


        System.out.print("Nhập phần tử cần xoá: ");
        int x = scanner.nextInt();


        int index_del = -1;
        for (int i = 0; i < n; i++) {
            if (array[i] == x) {
                index_del = i;
                break;
            }
        }

        if (index_del == -1) {
            System.out.println("Phần tử không tồn tại trong mảng.");
        } else {

            for (int i = index_del; i < n - 1; i++) {
                array[i] = array[i + 1];
            }
            n--;

            System.out.print("Mảng sau khi xoá: ");
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