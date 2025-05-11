public class Dog {
    String name ;
    public static void main (String[] args){
    // make a dog object and access it 
    Dog dog1 = new Dog();
    dog1.bark();
    dog1.name = "Bart"; //  Strings are special type of object . you can create and asssign them if they were primitives ( even though the are revfernce )
    // Now make a Dog array
    Dog[] myDogs = new Dog[3];
    // and put some dogs in it 
    myDogs[0] = new Dog();
    myDogs[1] = new Dog();
    myDogs[2] = dog1;
    // Now access the dogs using the reference 
    myDogs[0].name = "Fred";
    myDogs[1].name = "Marge";

    // Hmmmm ... what is myDogs[2] name ?
    System.out.println("Last dog's name is ");
    System.out.println(myDogs[2].name);
    

    // Now loop through the array 
    //  tell all dogs to bark
    int x = 0 ;
        while (x<myDogs.length){ // Arrays have vairbale "length " that gives you the number of elements in a        
            myDogs[x].bark();
            x=x+1;
        }
    }
}

    public void bark(){
        System.out.println(name + "Says Ruff!");
    }
    public void eat(){
    }
    public void chaseCat(){

    }
}


