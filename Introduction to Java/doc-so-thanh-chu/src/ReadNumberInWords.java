import java.util.Scanner;

public class ReadNumberInWords {
    // Mảng lưu các số từ 0 đến 19
    static String[] ones = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
            "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
            "seventeen", "eighteen", "nineteen"};

    // Mảng lưu các số chục từ 20 trở lên
    static String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số cần đọc: ");
        int number = scanner.nextInt();

        // Kiểm tra nếu số vượt quá khả năng
        if (number < 0 || number > 999) {
            System.out.println("out of ability");
        } else {
            System.out.println(convertToWords(number));
        }
    }

    // Chuyển số thành chữ
    public static String convertToWords(int number) {
        if (number == 0) {
            return ones[0]; // Trường hợp số 0
        }

        String words = "";

        // Đọc số có ba chữ số
        if (number >= 100) {
            words += ones[number / 100] + " hundred";
            number %= 100; // Lấy phần còn lại
            if (number > 0) {
                words += " and ";
            }
        }

        // Đọc các số nhỏ hơn 100
        if (number >= 20) {
            words += tens[number / 10];
            if (number % 10 > 0) {
                words += " " + ones[number % 10];
            }
        } else if (number >= 10) {
            words += ones[number];
        } else if (number > 0) {
            words += ones[number];
        }

        return words;
    }
}
