public class Main {
    public static void main(String[] args) {
        Cylinder c = new Cylinder();
        c.setRadius(2);
        c.setColor("red");
        c.setHeight(4);
        System.out.println(c);

        Circle a = new Circle(4, "blue");
        System.out.println(a);
    }
}