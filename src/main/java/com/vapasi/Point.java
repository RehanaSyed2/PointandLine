package com.vapasi;

import java.util.Objects;
import static java.lang.Math.abs;

public class Point {
    private final int xCoordinate;
    private final int yCoordinate;

    public Point(int xCoordinate, int yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    @Override
    public String toString() {
        return "Point{" +
                "xCoordinate=" + xCoordinate +
                ", yCoordinate=" + yCoordinate +
                '}';
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) return true;
        if (that == null || getClass() != that.getClass()) return false;
        Point point = (Point) that;
        return xCoordinate == point.xCoordinate && yCoordinate == point.yCoordinate;
    }

    @Override
    public int hashCode() {
        return Objects.hash(xCoordinate, yCoordinate);
    }

    public int horizontalDistanceBetweenPoints(Point point) {
        int xDistance;
        xDistance = abs(xCoordinate - point.xCoordinate);
        return (xDistance);
    }

    public int verticalDistanceBetweenPoints(Point point) {
        int yDistance;
        yDistance = abs(yCoordinate - point.yCoordinate);
        return yDistance;
    }
}

