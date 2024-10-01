package org.example.Aufgaben_mit_OO.A10_Datum2;

public class GermanDatum extends Datum {
  public GermanDatum(int day, int month, int year) {
    super(day, month, year);
  }

  @Override
  public void print() {
    System.out.printf("%d.%d.%d\n",getDay(),getMonth(),getYear());
  }
}
