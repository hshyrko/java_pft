package ru.stqa.pft.sandbox;

import java.awt.geom.Point2D;

/**
 * Created by hshyrko on 9/20/2016.
 */
public class Point {

  public double x;
  public double y;

  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public double Distance(Point p) {

    return Math.sqrt((x * x + p.x * p.x - 2 * x * p.x) + (y * y + p.y * p.y - 2 * y * p.y));
  }


}