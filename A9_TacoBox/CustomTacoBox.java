package org.example.Aufgaben_mit_OO.A9_TacoBox;

public class CustomTacoBox implements A9_TacoBox{
  int numberOfTacos;

  public CustomTacoBox(int numberOfTacos) {
    if(numberOfTacos == 0) {
      System.out.println("Wer wird denn davon satt?");
    }
    this.numberOfTacos = numberOfTacos;
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
    var triple = new CustomTacoBox(0);
    triple.eat();
    triple.eat();
    triple.eat();
    triple.eat();
  }

}
