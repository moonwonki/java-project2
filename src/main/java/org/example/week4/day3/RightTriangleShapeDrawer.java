package org.example.week4.day3;


import java.io.IOException;

public class RightTriangleShapeDrawer extends ShapeDrawer2 {

    public RightTriangleShapeDrawer(Printer2 printer) {
        super(printer);
    }

    @Override
    public String makeALine(int h, int i) {
        return String.format("%s%s\n"," ".repeat(h - i - 1),"*".repeat(i + 1));
    }

    public static void main(String[] args) throws IOException {
        ShapeDrawer2 rightTriangle = new RightTriangleShapeDrawer(new ConsolePrinter2());
        rightTriangle.printShape(5);
    }
}
