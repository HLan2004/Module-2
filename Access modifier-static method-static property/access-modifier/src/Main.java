public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0, "blue"); // Tạo đối tượng Circle với bán kính 5.0

        // Truy cập các phương thức getRadius() và getArea()
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.getArea());
    }
}