package example;


public class Main {

    public static void main(String args[]){

    }

}

class A {
  void get() {
    int x = foo();
    int y = 2;
    int z = x*y;
  }

  int foo() {
    int x = 20;
    return 20;
  }
}

class B {
  void bar() {
    System.out.println("foo");
    System.out.println("bar");
  }
}
