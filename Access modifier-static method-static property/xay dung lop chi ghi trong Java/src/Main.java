public class Main {
    public static void main(String[] args) {
        Student student = new Student(); // Tạo đối tượng Student

        // Ghi giá trị mới cho name và classes
        student.setName("Alice");
        student.setClasses("C03");

        // Không thể truy xuất trực tiếp name và classes vì không có getter
        System.out.println("Student information has been updated.");
    }
}