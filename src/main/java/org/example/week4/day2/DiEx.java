package org.example.week4.day2;

public class DiEx {
    private ShapeDrawer sd;

    public DiEx(ParallelogramShapeDrawer psd){
        sd = psd;
    }

    public DiEx(PyramidShapeDrawer prsd){
        sd = prsd;
    }

    public void doSth(){
        sd.printShape(5);
    }
}
