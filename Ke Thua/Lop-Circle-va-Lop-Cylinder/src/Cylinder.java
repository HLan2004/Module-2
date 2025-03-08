import javax.swing.*;

public class Cylinder extends Circle{
    public double height;

    public Cylinder(){}

    public Cylinder(double r, double h, String c){
        super(r, c);
        this.height = h;
    }

    public void setHeight(double h){
        this.height = h;
    }

    public double getHeight(){
        return this.height;
    }

    public double getVolume(){
        return super.getArea() * this.height;
    }

    @Override
    public String toString(){
        return "The radius of Cylinder is " + getRadius() + "\n" +
                "The area of Cylinder is " + getArea() + "\n" +
                "The color of Cylinder is " + getColor() + "\n" +
                "The height of Cylinder is " + getHeight() + "\n" +
                "The volume of Cylinder is " + getVolume();
    }
}
