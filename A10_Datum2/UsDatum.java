package org.example.Aufgaben_mit_OO.A10_Datum2;

public class UsDatum extends Datum {
  public UsDatum(int day, int month, int year) {
    super(day, month, year);
  }

  @Override
  public void print() {
    System.out.printf("%d/%d/%d\n",getMonth(),getDay(),getYear());
  }

}
