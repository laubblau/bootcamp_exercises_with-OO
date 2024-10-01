package org.example.Aufgaben_mit_OO.A5_Restaurant;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
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

  private List<Dish> menu;
  private String restaurantName;
  private List<Dish> orders = new ArrayList<>();

  public Restaurant(List<Dish> menu, String restaurantName) {
    this.menu = menu;
    this.restaurantName = restaurantName;
  }

  public void printMenu() {
    System.out.println("Menükarte von Restaurant " + restaurantName);
    for(Dish d : menu) {
      System.out.println(d);
    }
  }

  public void order(Dish dish) {
    if(orders.size() < 3) {
      orders.add(dish);
    } else {
      System.out.println("Unser Koch hat schon zuviel zu tun!");
    }
  }

  public void cook() {
    if(orders.isEmpty()) {
      System.out.println("Es gibt keine Bestellungen!");
    } else {
      Dish cookedDish = orders.remove(orders.size() - 1);
      System.out.println("Gekocht wurde: " + cookedDish);
    }
  }
  public static void main(String[] args) {
    Dish d1 = new Dish("Nudeln", 5.0);
    Dish d2 = new Dish("Reis", 4.0);

    Restaurant restaurant = new Restaurant(List.of(d1,d2), "Al dente");
    restaurant.printMenu();
    restaurant.order(d1);
    restaurant.order(d2);
    restaurant.cook();
    restaurant.cook();
    restaurant.cook();
  }
}
