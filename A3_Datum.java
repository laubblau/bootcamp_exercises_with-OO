package org.example.Aufgaben_mit_OO;

import java.text.Format;

public class A3_Datum {
 /* 3. Datums-Klasse
  Schreibe eine Klasse Datum. Diese enthält einen Monat, ein Jahr und einen Tag. Schreibe einen Konstruktor,
  bei dem ich alle Werte angeben muss. Überprüfe, ob das Jahr nicht negativ ist, der Tag zwischen
  1 und 31 liegt und der Monat zwischen 1 und 12.

  Die Klasse soll einige Methoden haben:

1. printGermanFormat() -> gibt das Datum im Format dd.MM.YYYY aus
2. printUsFormat() -> gibt das Datum im Format MM/dd/YYYY aus
3. nextYear() -> erhöht das Jahr um eins

  Teste deine Implementierung in einer main-Methode.
  */

  private int day;
  private int month;
  private int year;

  public A3_Datum(int day, int month, int year) {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public void printGermanFormat() {
    //printf = Ausgaben kann formatiert werden, %d = Ganzzahl,\n = Zeilenumbruch
    System.out.printf("%d.%d.%d\n",day,month,year);
  }

  public void printUsFormat() {
    System.out.printf("%d/%d/%d\n",month,day,year);
  }

  public void nextYear() {
    this.year++;
  }

  public void Datum(int day, int month, int year) {
    if(day <= 0 || day > 31) {
      System.out.println("Tag nicht valide");
    } else {
      this.day = day;
    }
    if(month <= 0 || month > 12) {
      System.out.println("Monat nicht valide");
    } else {
      this.month = month;
    }
    if(year <= 0) {
      System.out.println("Jahr nicht valide");
    } else {
      this.year = year;
    }
  }

  public static A3_Datum createDatum(int day, int month, int year) {
    boolean valid = true;
   A3_Datum datum = new A3_Datum(12,3,2024);
    if(day <= 0 || day > 31) {
      valid = false;
      System.out.println("Tag nicht valide");
    } else {
      datum.day = day;
    }
    if(month <= 0 || month > 12) {
      valid = false;
      System.out.println("Monat nicht valide");
    } else {
      datum.month = month;
    }
    if(year <= 0) {
      valid = false;
      System.out.println("Jahr nicht valide");
    } else {
      datum.year = year;
    }
    if(valid) {
      return datum;
    } else {
      return null;
    }
  }

  public static void main(String[] args) {
    A3_Datum date = new A3_Datum(10,10,2010);
    date.printGermanFormat();
    date.printUsFormat();
  }
}
