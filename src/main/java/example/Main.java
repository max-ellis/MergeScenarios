package example;


public class Main {

    public static void main(String args[]){

    }

}

class A {

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

  void get() {
    A a = new A();
    int x = a.foo();
    int y = 2;
    int z = x*y;
  }
}
