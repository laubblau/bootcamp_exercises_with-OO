package org.example.Aufgaben_mit_OO;

import javax.swing.text.Position;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class A12_MusicalChairs {
 /* 12. Reise nach Jerusalem
  Bei einer Geburtstagsfeier spielen die Gäste Reise nach Jerusalem
  (engl. Musical chairs). Die Personen sitzen auf Stühlen, und wenn die
  Musik anfängt zu spielen, stehen sie auf, und laufen um die Stühle. Die Namen der
  Gäste befinden sich in einer Liste.

 Aufgabe A:
-Lege eine neue Klasse MusicalChairs an.
-Lege einen Konstruktor  `MusicalChairs(List<String> names)`  an, die die Namen intern speichert.
-Implementiere die Methode  `toString()`, die die Namen kommasepariert liefert.
-Schreibe eine Methode  `rotate(int distance)`, die die Namen in der Liste, um die Position  `
distance`  nach rechts verschiebt. Die rechts herausfallenden Elemente werden links wieder
eingeschoben. Die Operation ist in-place, die (interne) Liste selbst wird also verändert, und
die Methode liefert keine Rückgabe.

Nutze für die Aufgabe eine passende Methode aus  `java.util.Collections`.

  Beispiel:

MusicalChairs musicalChairs = new MusicalChairs( List.of("Laser", "Milka", "Popo", "Despot") );
musicalChairs.rotate( 2 );
System.out.println( musicalChairs ); // Popo, Despot, Laser, Milka


Aufgabe B:
-Schreibe eine weitere Methode  `void rotateAndRemoveLast(int distance)`,
die zunächst die Liste um  `distance`  Positionen nach rechts verschiebt, und dann das
letzte Element löscht.

-Ergänze eine Methode  `String play()`, die  `rotateAndRemoveLast(…​)`
in einer Schleife so oft aufruft, bis es nur noch ein Element in der Liste gibt; dann steht
der Sieger fest und er wird als String zurückgegeben. Die Distanz ist bei jedem Durchlauf
zufällig.

Berücksichtige bei der Lösung mögliche Fehler.

  */

  private List<String> names;

  public A12_MusicalChairs(List<String> names) {
    this.names = names;
  }

  public void rotate(int distance) {
    Collections.rotate(names, distance);
  }
  public void rotateAndRemoveLast(int distance) {
    Collections.rotate(names, distance);
    names.remove(names.size()-1);
  }

  public String play() {
    while(names.size() != 1) {
      Random random = new Random();
      int distance = random.nextInt(4);
      rotateAndRemoveLast(distance);
    }
    return "Winner is: " + names.get(0);
  }

  @Override
  public String toString() {
    return "MusicalChairs{" +
            "names=" + names +
            '}';
  }

  public static void main(String[] args) {
    List<String> test = new ArrayList<>();
    test.add("Alex1");
    test.add("Alex2");
    test.add("Alex3");
    test.add("Alex4");
    test.add("Thomas1");
    test.add("Thomas2");
    test.add("Thomas3");
    test.add("Thomas4");
    test.add("Julia1");
    test.add("Julia2");
    test.add("Julia3");
    test.add("Julia4");

    A12_MusicalChairs musicalChairs = new A12_MusicalChairs(test);
    System.out.println(musicalChairs.play());
  }
}
