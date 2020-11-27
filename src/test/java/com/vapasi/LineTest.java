package com.vapasi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LineTest {
    @Test
    public void shouldFindLineLength(){
        double expected = 5.0;
        Point point1, point2;
        point1 = new Point(3,9);
        point2 = new Point(7,12);
        Line line = new Line(point1, point2);
        double actual = line.lengthOfLine();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCompareTwoLines(){
        Point point1, point2, point3, point4;
        point1 = new Point(3,9);
        point2 = new Point(7,12);
        point3 = new Point(7,12);
        point4 = new Point(3,9);
        Line line1 = new Line(point1, point2);
        Line line2 = new Line(point3, point4);
        assertEquals(line1, line2);

    }
}
