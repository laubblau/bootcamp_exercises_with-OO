package org.example.Aufgaben_mit_OO.A11_Formen;

public class Triangle extends Shape {
  private double g;
  private double h;

  public Triangle(String name, String color, double g, double h) {
    super(name, color);
    this.g = g;
    this.h = h;
  }


  @Override
  public double area() {
    return 0.5 * g * h;
  }
}
