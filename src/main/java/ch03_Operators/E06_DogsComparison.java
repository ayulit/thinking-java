package ch03_Operators;
import static net.mindview.util.Print.*;

public class E06_DogsComparison {

    static void compare(Dog dog1, Dog dog2) {
        
        print("== on top references: " + (dog1 == dog2));
        print("equals() on top references: " + dog1.equals(dog2));
        
        print("== on names: " + (dog1.name == dog2.name));
        print("equals() on names: " + dog1.name.equals(dog2.name));
        
        print("== on says: " + (dog1.says == dog2.says));
        print("equals() on says: " + dog1.says.equals(dog2.says));
        
    }
    
    public static void main(String[] args) {
        
        Dog spot = new Dog("spot","hello");
        Dog scruffy = new Dog("scruffy","hi");
        
        print(spot);
        print(scruffy);
        
        Dog spotty = spot; // so, 'spotty' will be alias for spot.
        
        print(spotty == spot);      // true
        print(spotty.equals(spot)); // true
        
        compare(spotty, spot);
        /* Output:
         * true everywhere
         *///:~
    }
}
