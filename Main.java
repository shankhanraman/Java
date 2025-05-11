// main.java is class itself 
// Good practice would be the initilaizing the class name with the capital itself
// first class would be the public
class Dog {
  int size;
  String name;

  void bark() {
    if (size > 60) {
      System.out.println("Wooof! Wooof!");
    } else if (size > 14) {
      System.out.println("Ruff!  Ruff!");
    } else {
      System.out.println("Yip! Yip!");
    }
  }
}

public class Main {
    public static void main(String[] args) {//Static is used beacuse main is entry point so it's used to run withouth creating object 
        System.out.println("hello world");
            Dog one = new Dog();
            one.size = 70;
            Dog two = new Dog();
            two.size = 8;
            Dog three = new Dog();
            three.size = 35;

            one.bark();
            two.bark();
            three.bark();

    }
}
