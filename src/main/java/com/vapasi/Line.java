package com.vapasi;

import java.util.Objects;

public class Line {

    private Point point1 = new Point(3,9);
    private Point point2 = new Point(7,12);

    public Line(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    @Override
    public String toString() {
        return "Line{" +
                "point1=" + point1 +
                ", point2=" + point2 +
                '}';
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) return true;
        if (that == null || getClass() != that.getClass()) return false;
        Line line = (Line) that;
        return (Objects.equals(point1, line.point1) &&
                Objects.equals(point2, line.point2)) || (Objects.equals(point1, line.point2) &&
                Objects.equals(point2, line.point1));
    }

    @Override
    public int hashCode() {
        return Objects.hash(point1, point2);
    }

    public double lengthOfLine(){
        int xDist = point1.horizontalDistanceBetweenPoints(point2);
        int yDist = point1.verticalDistanceBetweenPoints(point2);
        double lineLength = Math.sqrt(xDist*xDist + yDist*yDist);
        return lineLength;
    }

}
