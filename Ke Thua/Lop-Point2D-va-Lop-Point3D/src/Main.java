public class Main {
    public static void main(String[] args) {
        Point2D p2d = new Point2D(3, 4);
        System.out.println("Point2D: " + p2d);
        p2d.setXY(5, 6);
        System.out.println("After setXY: " + p2d);


        Point3D p3d = new Point3D(1, 2, 3);
        System.out.println("Point3D: " + p3d);
        p3d.setXYZ(7, 8, 9);
        System.out.println("After setXYZ: " + p3d);
    }
}