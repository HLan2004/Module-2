public class PrintShapes {
    public static void main(String[] args) {
        // In menu
        System.out.println("Chọn hình để in:");
        System.out.println("1. Hình chữ nhật");
        System.out.println("2. Hình tam giác vuông (bottom-left)");
        System.out.println("3. Hình tam giác vuông (top-left)");
        System.out.println("4. Hình tam giác cân");

        // In hình chữ nhật
        int chieuDai = 3, chieuRong = 7;
        System.out.println("\nHình chữ nhật:");
        for (int i = 0; i < chieuDai; i++) {
            for (int j = 0; j < chieuRong; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // In tam giác vuông (bottom-left)
        int size = 5;
        System.out.println("\nHình tam giác vuông (bottom-left):");
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // In tam giác vuông (top-left)
        System.out.println("\nHình tam giác vuông (top-left):");
        for (int i = size; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // In tam giác cân
        System.out.println("\nHình tam giác cân:");
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size - i; j++) {
                System.out.print("  "); // In khoảng trắng
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
