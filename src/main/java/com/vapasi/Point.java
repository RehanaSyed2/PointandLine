package com.vapasi;

import java.util.Objects;

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
        return xCoordinate == point.xCoordinate &&
                yCoordinate == point.yCoordinate;
    }

    @Override
    public int hashCode() {
        return Objects.hash(xCoordinate, yCoordinate);
    }

    public double distanceBetweenPoints(Point point) {
            int xDifference = xCoordinate - point.xCoordinate;
            int yDifference = yCoordinate - point.yCoordinate;
            double distanceBetweenPoints = Math.sqrt(Math.pow(xDifference, 2) + Math.pow(yDifference, 2));
            return distanceBetweenPoints;
    }
}

