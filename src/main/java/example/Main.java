package example;


public class Main {

    public static void main(String args[]){
      Parent1 parent = new Parent1();
      Child1 child = new Child1();
      int x = parent.barfoo();
      int y = child.bar();
    }

}


class Parent1 {

  public int x = 5;
  public int y = 10;
  public int barfoo() {
    where();
    return x*y;
  }

  public void where() {
    System.out.println("Here");
  }

}

class Child1 extends Parent1 {

  public int bar() {
    where();
    return x*y/2;
  }
}



