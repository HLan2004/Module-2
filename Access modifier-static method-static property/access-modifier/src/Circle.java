public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle(){

    }

    public Circle(double r, String c) {
        this.radius = r;
        this.color = c;
    }

    public double getRadius(){
        return this.radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(this.radius, 2);
    }
}
