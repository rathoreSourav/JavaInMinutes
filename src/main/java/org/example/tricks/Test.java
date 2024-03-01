package org.example.tricks;

public class Test {

   static int i;

  private Test() {
    i = i + 100;
  }

  private static Integer m1(Integer x) {
    return x + x;
  }

  private static Integer m2() {
    return 500;
  }
  public static void main(String[] args) {

    Test t1 = new Test();
    Test t2 = new Test();
    Test t3 = new Test();
    t1.i = m1(m2());
    t2.i = m1(m2()) + m1(m2());


    System.out.println(t1.i);

  }
}