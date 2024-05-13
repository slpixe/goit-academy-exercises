package org.example.drawer;

public interface PolygonShape {

    String getName();

    Point[] getPoints();

    int getNumberOfSides();

    double getAngle(String str);

    void getSidesLength();

}
