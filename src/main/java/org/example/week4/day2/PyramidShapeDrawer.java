package org.example.week4.day2;

public class PyramidShapeDrawer extends ShapeDrawer{
    @Override
    public String makeALine(int h, int i) {
        return String.format("%s%s\n", " ".repeat(h - i - 1), "*".repeat(2 * i + 1));
    }
}
