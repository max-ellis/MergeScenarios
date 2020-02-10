package example;


public class Main {

    public static void main(String args[]){
      Child2 child = new Child2();
      child.get();
    }

}


class Parent1 {

  public int x = 5;
  public int y = 8;

  public int foo() {
    int z = barNew();
    return x*y;
  }
  public int barNew() {
    System.out.println("bar");
    return x*y/2;
  }
}

class Child1 extends Parent1 {

  public int fooBar() {
    return barNew() * foo();
  }

}

class Child2 extends Child1 {
  
  void get() {
    int x = foo();
  }


}


