package org.example.week4.day3;

import java.io.IOException;

public abstract class ShapeDrawer2 {
    Printer2 printer;

    public ShapeDrawer2(Printer2 printer) {
        this.printer = printer;
    }

    public abstract String makeALine(int h, int i);

    public void printShape(int height) throws IOException {
        for (int i = 0; i < height; i++) {
            printer.print(String.format("%s", makeALine(height, i)));
        }
    }

}
