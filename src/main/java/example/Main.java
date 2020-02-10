package example;


public class Main {

    public static void main(String args[]){

    }

}

class A {
  void get() {
    B b = new B();
    int x = b.fooBar();
    int y = 2;
    int z = x*y;
  }

}

class B {
  void bar() {
    System.out.println("foo");
    System.out.println("bar");
  }
  int fooBar() {
    int x = 20;
    return 20;
  }
}
