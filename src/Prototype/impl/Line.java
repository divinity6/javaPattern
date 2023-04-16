package Prototype.impl;

import Prototype.types.Prototype;
import Prototype.types.Shape;

public class Line implements Shape , Prototype {

    private Point startPt;
    private Point endPt;

    public Line setStartPt( Point pt ){
        this.startPt = pt;
        return this;
    }

    public Line setEndPt( Point pt ){
        this.endPt = pt;
        return this;
    }

    public Point getStartPoint(){
        return this.startPt;
    }

    public Point getEndPoint(){
        return this.endPt;
    }

    @Override
    public Object copy() {
        Line newLine = new Line();

        newLine.startPt = ( Point )startPt.copy();
        newLine.endPt = ( Point )endPt.copy();

        return newLine;
    }

    @Override
    public String draw() {
        return "LINE(" + this.startPt.draw() + "," + this.endPt.draw() + ")";
    }

    @Override
    public void moveOffset(int dx, int dy) {
        this.startPt.moveOffset( dx , dy );
        this.endPt.moveOffset( dx , dy );
    }
}
