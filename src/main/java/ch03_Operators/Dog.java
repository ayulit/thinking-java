package ch03_Operators;

public class Dog {
    
    String name;
    String says;
    
    public Dog(String name, String says) {
        this.name = name;
        this.says = says;
    }
    
    @Override
    public String toString() {
        return name + " says " + says;
    }
    
}
