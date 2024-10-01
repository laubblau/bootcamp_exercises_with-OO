package org.example.Aufgaben_mit_OO.A9_TacoBox;

public interface A9_TacoBox {
  /*
  9. TacoBox
Erstelle ein Interfase TacoBox, welches so aussieht:
```java
public interface TacoBox {
    int tacosRemaining();
    void eat();
}
```
Implementiere dieses Interface in der Klasse TripleTacoBox. Diese Klasse enthält einen int tacos,
der im Konstruktor auf 3 initialisiert werden soll. Implementiere die beiden Methoden.
Sollte eat() aufgerufen werden und keine Tacos mehr vorhanden sein, soll ein Fehler ausgegeben
werden.

Implementiere dieses Interface ein zweites Mal in der Klasse CustomTacoBox.
Dabei soll es im Konstruktor jedoch möglich sein die Anzahl der Tacos zu übergeben,
0 darf jedoch nicht übergeben werden. Der Rest bleibt gleich.
   */

  int tacosRemaining();
  void eat();
}
