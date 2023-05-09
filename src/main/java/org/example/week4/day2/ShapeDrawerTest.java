package org.example.week4.day2;

public class ShapeDrawerTest {
    public static void main(String[] args) {
        ShapeDrawer sd = new PyramidShapeDrawer();
        sd.printShape(4);

        System.out.println("------------");

        sd = new ParallelogramShapeDrawer();
        sd.printShape(4);
    }
}
