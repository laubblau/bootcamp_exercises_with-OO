package org.example.Aufgaben_mit_OO.A10_Datum2;

public abstract class Datum {
  /* 10. Datum II
Verändere deine Datums-Klasse ein wenig. Mach sie abstract und erstelle eine
abstrakte Methode print(). Erstelle nun jeweils eine Unterklasse UsDatum GermanDatum,
die diese Methode implementieren und das jeweils richtige Format ausgeben.
   */
  private int day;
  private int month;
  private int year;
  public Datum() {
  }

  public abstract void print();

  public void nextYear() {
    this.year++;
  }

  public int getDay() {
    return day;
  }

  public void setDay(int day) {
    this.day = day;
  }

  public int getMonth() {
    return month;
  }

  public void setMonth(int month) {
    this.month = month;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public Datum(int day, int month, int year) {
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

  public static void main(String[] args) {
    var german = new GermanDatum(10,10,2010);
    var us = new UsDatum(21,12,2021);
    german.print();
    us.print();
  }

}
