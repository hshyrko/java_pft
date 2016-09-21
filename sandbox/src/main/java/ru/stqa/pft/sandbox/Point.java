package ru.stqa.pft.sandbox;

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
  public static double Distance(Point p1, Point p2) {

    return Math.sqrt((p1.x * p1.x + p2.x * p2.x - 2 * p1.x * p2.x) + (p1.y * p1.y + p2.y * p2.y - 2 * p1.y * p2.y));
  }
}