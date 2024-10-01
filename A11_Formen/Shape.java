package org.example.Aufgaben_mit_OO.A11_Formen;

public abstract class Shape {
  /*11. Formen
  Schreibe eine abstrakte Klasse Shape, die eine beliebige geometrisch Form darstellt.
  Allen Formen gemeinsam ist, dass sie einen String name und einen String color haben.
  Ergänze in der abstrakten Klasse auch die entsprechenden Getter und Setter und einen Konstruktor,
  der die zwei Parameter entgegen nimmt. Zusätzlich soll es die abstrakte Methode area geben,
  die den Flächeninhalt berechnet und in Form einer Zahl zurückgibt.

  Erweitere deine Klasse nun in drei Unterklassen: Square, Circle und Triangle.
  Überlege dir, welche Informationen du jeweils in den Unterklassen benötigst,
  um den Flächeninhalt der jeweiligen Form zu berechnen. Lege diese Werte als Felder in
  der Klasse an. Sie sollen dann auch im Konstruktor übergeben werden. Zusätzlich muss
  der Konstruktor von Shape über super() aufgerufen werden und dafür die notwendigen Werte
  abgefragt werden. Implementiere dann für die drei Klassen die Methoden zur Berechnung des
  Flächenhinhalts.
  */

  private String name;
  private String color;


  public abstract double area();
  public Shape(String name, String color) {
    this.name = name;
    this.color = color;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }
}
