package org.example.Aufgaben_mit_OO;

public class A2_Rechteck {
  /* 2. Rechteck
Schreibe eine Klasse Rechteck, die Seitenlänge a und Seitenlänge b enthält. Erstelle einen entsprechenden Konstruktor. Die Klasse soll drei Methoden haben:

1. flaechenInhalt() -> Liefert den Flächeninhalt zurück

2. umfang() -> Berechnet den Umfang

3. isQuadrat() -> Überprüft, ob das Rechteck ein Quadrat ist

Teste deine Implementierung in einer main-Methode.
   */

  private int a;
  private int b;


  public A2_Rechteck(int a, int b) {
    this.a = a;
    this.b = b;
  }

  public int flaechenInhalt() {
    return a * b;
  }

  public int umfang() {
    return 2 * (a + b);
  }

  public boolean isQuadrat() {
    return a == b;
  }

  public static void main(String[] args) {
    A2_Rechteck rechteck = new A2_Rechteck(10,10);
    A2_Rechteck rechteck2 = new A2_Rechteck(20,20);
    A2_Rechteck rechteck3 = new A2_Rechteck(14,8);

    System.out.println(rechteck.isQuadrat());
    System.out.println(rechteck2.umfang());
    System.out.println(rechteck3.flaechenInhalt());
  }
}

