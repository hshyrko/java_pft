package ru.stqa.pft.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
      hello("world");
      hello("user");
      hello("test");

      Square s = new Square(5);
      System.out.println("площать квадрата со стороной " + s.l + " = " + s.area());

      Rectangle r = new Rectangle(4, 6);
      System.out.println("площать прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());

      Point p1 = new Point (8, 10);
      Point p2 = new Point (5, 6);
      System.out.println("Расстояние от точки до точки будет равно " + Distance(p1, p2));
    }

    public static void hello(String somebody){
        System.out.println("Hello, " + somebody + "!");
    }


    public static double Distance(Point p1, Point p2) {

    return Math.sqrt((p1.x * p1.x + p2.x * p2.x - 2 * p1.x * p2.x) + (p1.y * p1.y + p2.y * p2.y - 2 * p1.y * p2.y));
  }
}