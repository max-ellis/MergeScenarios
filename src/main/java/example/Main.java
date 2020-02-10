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

}

class Child1 extends Parent1 {

  public int bar() {
    System.out.println("bar");
    return x*y/2;
  }

  public int fooBar() {
    int z = bar();
    return x*y;
  }
}

class Child2 extends Child1 {
  
  void get() {
    int x = fooBar();
  }


}


