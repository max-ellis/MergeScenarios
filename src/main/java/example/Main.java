package example;


public class Main {

    public static void main(String args[]){

    }

}

class A {

}

class B {
  void bar2() {
    System.out.println("foo");
    System.out.println("bar");
  }
  int fooBar() {
    int x = 20;
    return 20;
  }


  void get() {
    int x = fooBar();
    int y = 2;
    int z = x*y;
  }
}
