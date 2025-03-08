public class Circle {
    double radius;
    String color;

    public Circle(){}

    public Circle(double r, String c){
        this.radius = r;
        this.color = c;
    }

    public void setRadius(double r){
        this.radius = r;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setColor(String c){
        this.color = c;
    }

    public String getColor(){
        return this.color;
    }

    public double getArea(){
        return Math.pow(this.radius, 2) * Math.PI;
    }

    @Override
    public String toString(){
        return "The radius of circle is " + getRadius() + "\n" +
                "The area of circle is " + getArea() + "\n" +
                "The color of circle is " + getColor() + "\n";
    }
}
