package org.example.week4.day2;

public class ParallelogramShapeDrawer extends ShapeDrawer{
    @Override
    public String makeALine(int h, int i) {
        return String.format("%s%s\n", " ".repeat(h - 1 - i), "*".repeat(h));
    }
}
