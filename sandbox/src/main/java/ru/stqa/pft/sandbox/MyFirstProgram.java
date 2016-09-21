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

      Point p1 = new Point(6,10);
      Point p2 = new Point(8,16);

      System.out.println("Расстояние от точки до точки будет равно " + p2.Distance(p1));
    }

    public static void hello(String somebody){
        System.out.println("Hello, " + somebody + "!");
    }



}