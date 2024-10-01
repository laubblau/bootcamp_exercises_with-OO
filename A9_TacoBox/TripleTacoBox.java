package org.example.Aufgaben_mit_OO.A9_TacoBox;

public class TripleTacoBox implements A9_TacoBox {
  int numberOfTacos;

  public TripleTacoBox() {
    this.numberOfTacos = 3;
  }

  @Override
  public int tacosRemaining() {
    return tacosRemaining();
  }

  @Override
  public void eat() {
    if(numberOfTacos == 0) {
      System.out.println("Keine Tacos mehr da!");
    } else {
      numberOfTacos--;
    }
  }

  public static void main(String[] args) {
    var triple = new TripleTacoBox();
    triple.eat();
    triple.eat();
    triple.eat();
    triple.eat();
  }
}
