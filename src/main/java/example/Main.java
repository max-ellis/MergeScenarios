package example;


public class Main {

    public static void main(String args[]){
      Parent1 parent = new Parent1();
      Child1 child = new Child1();
      int x = parent.foobar();
      int y = child.bar();
    }

}


class Parent1 {

  public int x = 5;
  public int y = 8;
  public int foobar() {
    where();
    return x*y;
  }

  public void where() {
    System.out.println("Over");
    System.out.println("Here");
    System.out.println("foo");
  }

}

class Child1 extends Parent1 {

  public int bar() {
    overThere();
    return x*y/2;
  }
}




