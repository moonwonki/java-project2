package org.example.week4.day3;

import java.io.IOException;

public class PyramidShapeDrawer extends ShapeDrawer2 {
    public PyramidShapeDrawer(Printer2 printer) {
        super(printer);
    }

    @Override
    public String makeALine(int h, int i) {
        return String.format("%s%s\n", " ".repeat(h - i - 1), "*".repeat(2 * i + 1));
    }

    public static void main(String[] args) throws IOException {
        ShapeDrawer2 sd = new PyramidShapeDrawer(new ConsolePrinter2());
        sd.printShape(5);
    }
}
