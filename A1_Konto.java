package org.example.Aufgaben_mit_OO;

public class A1_Konto {
  /* 1. Konto
Erstelle eine Klasse Konto. Attribute für das Bankkonto sind der Name und
Vorname des Kontoinhabers, die Kontonummer, der Kontostand sowie ein Limit,
bis zu dem das Konto überzogen werden darf.

1. Erstelle einen Konstruktor, der alle Parameter entgegen nimmt
2. Erstelle eine geeignete ToString-Methode
3. Erstelle eine Methode "einzahlen", die den Kontostand um einen Betrag x erhöht
4. Erstelle eine Methode "auszahlen", die einen Betrag x von dem Konto entnimmt.
   Überprüfe dabei auch das Limit und den Kontostand.
5. Schreibe eine statische Methode ueberweisung. Diese nimmt zwei Bankkonten
   und einen Betrag entgegen. Das Geld soll von dem ersten Konto abgezogen
   werden und auf das zweite gebucht werden. Verändere die auszahlen Methode so,
   dass du beim Aufruf bestimmen kannst, ob eine Abbuchung erfolgreich war.

Teste deine Implementierung in einer main-Methode.
   */

  private String firstName;
  private String lastName;
  private String iban;
  private int balance;
  private int limit;

  public A1_Konto(String firstName, String lastName, String iban, int balance, int limit) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.iban = iban;
    this.balance = balance;
    this.limit = limit;
  }

  @Override
  public String toString() {
    return "Konto{" +
            "firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", iban='" + iban + '\'' +
            ", balance=" + balance +
            ", limit=" + limit +
            '}';
  }

  public void einzahlen(int x) {
    this.balance += x;
  }

  public boolean auszahlen(int x) {
    if(this.balance >= x && x <= limit) {
      this.balance -= x;
      return true;
    }
    System.out.println("Auszahlung hat nicht funktioniert");
    return false;
  }

  public static void transfer(A1_Konto first, A1_Konto second, int x) {
    boolean auszahlenOk = first.auszahlen(x);
    if(auszahlenOk) {
      second.einzahlen(x);
    }
  }

  public static void main(String[] args) {

    A1_Konto k1 = new A1_Konto("Hans", "Meyer", "DE321932730912730", 2000, 1000);
    A1_Konto k2 = new A1_Konto("Hans", "Meyer", "DE321932730912730", 2000, 1000);

    A1_Konto.transfer(k1, k2, 1500);
    System.out.println(k1);
    System.out.println(k2);

  }

}
