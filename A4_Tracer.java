package org.example.Aufgaben_mit_OO;

public class A4_Tracer {
  /*4. Logausgaben mit einer Tracer-Klasse schreiben

Man verwendet Logger, um Programmausgaben zu protokollieren und sie später nachvollziehen zu
können — ganz ähnlich wie Captain CiaoCiao in seinem Logbuch festhält, was alles auf den Meeren,
in den Häfen und innerhalb der Besatzung passiert ist.

Aufgabe:

1.Lege eine neue Klasse  `Tracer`  an.
2.Ergänze eine statische Methode  `void trace(String)`, die einen an sie überreichten String
auf dem Bildschirm ausgibt.
3.Erweitere das Programm um zwei statische Methoden  `on()`  und  `off()`, die sich in einem
internen Zustand (boolean) merkt, ob  der Tracer angeschaltet ist. In der trace Methode soll
jetzt vorher überprüft, ob der Tracer angeschaltet ist. Ist dies der Fall, wird die Ausgabe wie
gewohnt durchgeführt. Ansonsten soll keine Ausgabe erfolgen.


// Ergänzen das nur nach tracer on was augeprintet wird
// vielleicht in logbuch umbenennen

Beispiel:
Wir können die Klasse dann so verwenden:

```java
Tracer.on();
Tracer.trace( "Start" );
Tracer.off();
Tracer.trace( "Der Tracer ist ausgeschaltet!" );
Tracer.on();
Tracer.trace( "End" );
```

Die erwartete Ausgabe ist:
    Start
    End
   */

  private static boolean isOn = false;

  public static void trace(String s) {
    if (isOn) {
      System.out.println(s);
    }
  }

  public static void on() {
    isOn = true;
  }

  public static void off() {
    isOn = false;
  }

  public static void main(String[] args) {
    A4_Tracer.on();
    A4_Tracer.trace("Hallo");
    A4_Tracer.off();
    A4_Tracer.trace("Hallo2");
    A4_Tracer.on();
    A4_Tracer.trace("Hallo3");
  }
}
