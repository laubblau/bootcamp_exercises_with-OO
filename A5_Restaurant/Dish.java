package org.example.Aufgaben_mit_OO.A5_Restaurant;

public class Dish {
  /*5. Restaurant
Für diese Aufgaben werden zwei Klassen benötigt. Als Erstes eine Klasse Dish,
die ein Gericht auf der Menü-Karte eines Restaurants repräsentiert.
Es besteht aus einem Namen und aus einem Preis. Erstelle einen Konstruktor,
der beide Werte entgegennimmt und Getter-Methoden.

Als Nächstes brauchst du die Klasse Restaurant. Diese enthält ein Feld menu. Menu ist
eine ArrayList vom Typ Dish. Außerdem hat das Restaurant einen Namen. Zusätzlich gibt es
eine weitere Liste vom Typ Dish. Dabei handelt es sich um die Bestellungen (orders).
Erstelle einen Konstruktor, der eine Liste von Dish übernimmt und diese als menu hinterlegt.
Zusätzlich soll in diesem Konstruktor der Name des Restaurants übergeben werden.

Erstelle folgende Methoden:

1. printMenu() -> soll die Karte des Restaurants ausgeben
2. order(Dish) -> Fügt eine Bestellung zu den orders hinzu. Es soll nicht möglich sein mehr als 3 Bestellungen gleichzeitig offen zu haben, sollte es trotzdem vorkommen, soll eine Fehlermeldung ausgeben werden.
3. cook() -> Nimmt die letzte Bestellung in der orders Liste und bereitet diese zu. Es soll eine entsprechende Meldung ausgegeben werden und das Objekt aus der Liste entfernt werden. Wenn cook aufgerufen wird und orders leer ist, soll auch eine entsprechende Meldung ausgeben werden.
   */

  private String name;
  private double price;

  public Dish(String name, double price) {
    this.name = name;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return String.format("%s: %1.2f", name, price);
  }
}
