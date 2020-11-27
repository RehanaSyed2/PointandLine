package com.vapasi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PointTest {

    @Test
    public void shouldCompareTwoPoints(){
    Point point1 = new Point(3,4);
    Point point2 = new Point(3,4);
    assertEquals(point1, point2);

    }

    @Test
    public void shouldReturnDistanceBetweenTwoPoints(){
        double expected = 5.0;
        Point point1, point2;
        point1 = new Point(3,9);
        point2 = new Point(7,12);
        double actual = point1.distanceBetweenPoints(point2);
        assertEquals(expected, actual);
    }

}
