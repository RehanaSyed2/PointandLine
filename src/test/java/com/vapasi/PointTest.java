package com.vapasi;

import org.junit.jupiter.api.Test;

import static java.lang.Math.abs;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PointTest {

    @Test
    public void shouldCompareTwoPoints(){
    Point point1 = new Point(3,4);
    Point point2 = new Point(3,4);
    assertEquals(point1, point2);

    }

    @Test
    public void shouldReturnHorizontalDistanceBetweenTwoPoints(){
        int expected = 4;
        Point point1, point2;
        point1 = new Point(3,9);
        point2 = new Point(7,12);
        int actual = point1.horizontalDistanceBetweenPoints(point2);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnVerticalDistanceBetweenTwoPoints(){
        int expected = 3;
        Point point1, point2;
        point1 = new Point(3,9);
        point2 = new Point(7,12);
        int actual = point1.verticalDistanceBetweenPoints(point2);
        assertEquals(expected, actual);
    }

}
