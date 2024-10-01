package org.example.Aufgaben_mit_OO.A6_A7_Radio;

public class A6_Radio {
  /*

6. Radio
In die neue Klasse  `Radio`  sollen Methoden gesetzt werden, damit das Objekt etwas ›kann‹.

Aufgabe:
- Das Radio hat folgende nicht-statische Felder:
	- int volume
	- boolean isOn

-  Das Radio hat folgende nicht-statische Methoden

    -   `void volumeUp()`/  `void volumeDown()`: Verändern die Objektvariable
    `volume`  um 1 bzw. -1. (Optional: Die Lautstärke soll nur im Bereich von 0 bis 100 liegen.)
    -   `void on()`/  `void off()`/  `boolean isOn()`: Greifen auf Objektvariable  `isOn`
    zurück; es ist in Ordnung, wenn eine Methode so heißt wie eine Objektvariable.
    Die Methoden  `on()/off()`  sollen Meldungen wie "an"/"aus" auf dem Bildschirm ausgeben.
    -   `public String toString()`: Sie soll Informationen über den internen Zustand als
    String zurückgeben, wobei die Zeichenkette eine Form wie  `Radio[volume=2, is on]`
    annehmen sollte.


-   In der  `main(…​)`-Methode der Klasse  `Application`  können die Objektmethoden des Radios zum Beispiel so getestet werden:

    Listing 1. Ausschnitt aus Application.java

    ```java
    Radio grandmasOldRadio = new Radio();
    System.out.println( grandmasOldRadio.isOn() );     // false
    grandmasOldRadio.on();
    System.out.println( grandmasOldRadio.isOn() );     // true
    System.out.println( grandmasOldRadio.volume );     // 0
    grandmasOldRadio.volumeUp();
    grandmasOldRadio.volumeUp();
    grandmasOldRadio.volumeDown();
    grandmasOldRadio.volumeUp();
    System.out.println( grandmasOldRadio.volume );     // 2
    System.out.println( grandmasOldRadio.toString() ); // Radio[volume=2, is on]
    System.out.println( grandmasOldRadio );            // Radio[volume=2, is on]
    grandmasOldRadio.off();
    ```

7. Statische Methoden für das Radio
Bisher hat das Radio nur Objekteigenschaften. Ergänzen wir eine statische Methode, die keine Beziehung
 zu einem konkreten Radio-Objekt hat.

 Aufgabe:

-   Implementiere in  `Radio`  eine statische Methode  `double stationNameToFrequency(String)`,
die einem Sender als Zeichenkette eine Frequenz zuordnet (zum Beispiel hat der bekannte
Piratensender ›Walking the plank‹ die Frequenz 98.3). Es sollen insgesamt drei Radiosender
hinterlegt sein.
-   Wird der Methode  `null`  übergeben, dann soll die Rückgabe  `0.0`  sein.
Auch bei unbekannten Sendernamen soll die Rückgabe  `0.0`  sein.


Beispiel:

-   Im Hauptprogramm kann man schreiben:

    ```java
    System.out.println( Radio.stationNameToFrequency( "Walking the plank" ) ); // 98.3
    ```

8. Radio-Konstruktor
Unser Radio hat bisher nur einen vom Compiler generierten Standardkonstruktor.
Ersetzen wir diesen durch eigene Konstruktoren:
Aufgabe:

-   Schreibe einen Konstruktor für die Klasse  `Radio`, sodass man ein Radio mit einer
Frequenz (`double`) initialisieren kann. Man sollte Radios aber immer noch mit dem
parameterlosen Konstruktor anlegen können!
-   Alternativ soll ein  `Radio`-Objekt mit einem Sender (als  `String`)
initialisiert werden können (nutze dazu intern  `stationNameToFrequency(…​)`).
Der Sendername wird nicht gespeichert, nur die Frequenz
-   Wie können wir die Konstruktorweiterschaltung mit  `this(…​)`  nutzen?


Beispiel: Auf folgende Weise soll man Radios aufbauen können:

```java
Radio r1 = new Radio();
Radio r2 = new Radio( 102. );
Radio r3 = new Radio( "BFBS" );
```
   */

  private int volume;
  private boolean isOn;
  private double frequency;

  public A6_Radio(double frequency) {
    this.frequency = frequency;
  }

  public A6_Radio(String stationName) {
    this(stationNameToFrequency(stationName));
  }

  public A6_Radio() {

  }


  public static double stationNameToFrequency(String stationName) {
    if ("Walking the plank".equals(stationName)) {
      return 98.3;
    } else if ("Bottle of rum".equals(stationName)) {
      return 100.0;
    }else if ("BFBS".equals(stationName)) {
      return 99.9;
    } else {
      return 0.0;
    }
  }

  public void volumeUp() {
    if (volume < 100) {
      volume++;
    }
  }

  public void volumeDown() {
    if (volume > 0) {
      volume--;
    }
  }

  public int getVolume() {
    return volume;
  }

  public void setVolume(int volume) {
    this.volume = volume;
  }

  public void setOn(boolean on) {
    isOn = on;
  }

  public void on() {
    isOn = true;
  }

  public void off() {
    isOn = false;
  }

  public boolean isOn() {
    return isOn;
  }

  @Override
  public String toString() {
    String status = isOn ? "on" : "off";
    return String.format("Radio[volume=%d, is %s]", volume, status);
  }
}
