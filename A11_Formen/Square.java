package org.example.Aufgaben_mit_OO.A11_Formen;

public class Square extends Shape{
  private double a;

  public Square(String name, String color, double a) {
    super(name, color);
    this.a = a;
  }

  @Override
  public double area() {
    // a * a
    return Math.pow(a, 2);
  }
}
