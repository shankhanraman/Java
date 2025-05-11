class Dog {
    int size;

    void bark() {
        if (size > 60) {
            System.out.println("Woof! Woof!");
        } else if (size > 14) {
            System.out.println("Ruff! Ruff!");
        } else {
            System.out.println("Yip! Yip!");
        }
    }
}

// Garbage collectible heap
class book{
    String name ;
}
public class objectReference {
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
        // The above code creates three Dog objects and sets their sizes.
        // It then calls the bark() method on each object, which prints a different sound based on the size of the dog.
        // The output will be:
        // Woof! Woof!
        // Yip! Yip!
        // Ruff! Ruff!
        // The bark() method uses the size of the dog to determine which sound to print.
        book b = new book();
        book c = new book();
        //  The two objects are now living on heap
        book d = c;
        // The reference variable d now points to the same object as c.
        // This means that any changes made to the object through d will also be reflected when accessed through c.
        // For example, if you set the name of the book object through d, it will also be reflected when accessed through c.
    }
    
}
