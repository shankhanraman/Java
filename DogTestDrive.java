class dog{
    int size; // Intance varibales 
    String breed;
    String name;
    void Bark(){ // A method 
        System.out.println("Ruff ! Ruff!");
    }
}
public class DogTestDrive {
    public static void main(String[] args) {
        dog d = new dog(); // Make a dog object
        d.size=40; // Use the dot operator (.) to set the size of the dog
        d.Bark(); // and To call it Bark () method 
    }
    
}
