package org.example.Aufgaben_mit_OO.A6_A7_Radio;

public class A6_Application {
  public static void main(String[] args) {
    A6_Radio grandmasOldRadio = new A6_Radio();

    System.out.println(grandmasOldRadio.isOn());

    grandmasOldRadio.on();

    System.out.println(grandmasOldRadio.isOn());
    System.out.println(grandmasOldRadio.getVolume());

    grandmasOldRadio.volumeUp();
    grandmasOldRadio.volumeUp();
    grandmasOldRadio.volumeDown();
    grandmasOldRadio.volumeUp();

    System.out.println(grandmasOldRadio.getVolume());
    System.out.println(grandmasOldRadio.toString());
    System.out.println(grandmasOldRadio);

    grandmasOldRadio.off();

    System.out.println(A6_Radio.stationNameToFrequency("Walking the plank"));
    System.out.println(A6_Radio.stationNameToFrequency(null));

    A6_Radio r1 = new A6_Radio();
    A6_Radio r2 = new A6_Radio( 102. );
    A6_Radio r3 = new A6_Radio( "BFBS" );
  }
}
