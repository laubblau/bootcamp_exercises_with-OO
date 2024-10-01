package org.example.Aufgaben_mit_OO.A11_Formen;

public class Circle extends Shape {

  private int r;

  public Circle(String name, String color, int r) {
    super(name, color);
    this.r = r;
  }

  @Override
  public double area() {
//  return Math.PI * r * r;
    return Math.PI * Math.pow(r,2);
  }
}
