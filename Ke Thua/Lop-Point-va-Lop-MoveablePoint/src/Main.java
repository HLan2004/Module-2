public class Main {
    public static void main(String[] args) {
        Point p = new Point(3, 4);
        System.out.println("Point: " + p);
        p.setXY(5, 6);
        System.out.println("After setXY: " + p);


        MovablePoint mp = new MovablePoint(2, 3, 1, 1);
        System.out.println("MovablePoint before move: " + mp);
        mp.move();
        System.out.println("MovablePoint after move: " + mp);
    }
}