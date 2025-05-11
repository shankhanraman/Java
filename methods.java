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
class ElectricGuitar {
  String brand;
  int numOfPickups;
  boolean rockStarUsesIt;

  String getBrand() {
    return brand;
  }

  void setBrand(String aBrand) {
    brand = aBrand;
  }

  int getNumOfPickups() {
    return numOfPickups;
  }

  void setNumOfPickups(int num) {
    numOfPickups = num;
  }

  boolean getRockStarUsesIt() {
    return rockStarUsesIt;
  }

  void setRockStarUsesIt(boolean yesOrNo) {
    rockStarUsesIt = yesOrNo;
  }
}
// Package private access modifier
// The following code is a simple example of a class with methods encapsulation 
// Mark instance variables private.
// Mark getters and setters public.
class goodDog { // * class name should be capital 
  private int size; // instance variable private 
  private String name; // if 
  public int getSize() { // getter method public
    return size;
  }
  public void setSize(int s) { // setter method public
    if(size<0 || size > 100) { // You can enforce the constraint here by using 
      System.out.println("Size is not valid");
      return;
    }
    size = s; 
  }

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
public class methods {
    public static void main(String[] args) {
        Dog one = new Dog();
        one.size = 70;
        Dog two = new Dog();
        two.size = 8;
        Dog three = new Dog();
        three.size = 35;

        one.bark();
        two.bark();
        three.bark();
        goodDog first = new goodDog();
        first.setSize(70);
        goodDog second = new goodDog();
        second.setSize(8);
        System.out.println("First dog size: " + first.getSize());
        System.out.println("Second dog size: " + second.getSize());
        first.bark();
        second.bark();     
        
  }
    
}
