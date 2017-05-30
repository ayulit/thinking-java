package ch03_Operators;

class Howtizer {
    float angle;
}

public class E03_Aliasing4Methods {

    static void adjust(Howtizer h, float a) {
        h.angle = a;
    }
    
    public static void main(String[] args) {
        
        Howtizer bigBerta = new Howtizer();
        bigBerta.angle = 45.0F;
        System.out.println("1: bigBerta.angle: " + bigBerta.angle);
        adjust(bigBerta,55.5F);
        System.out.println("2: bigBerta.angle: " + bigBerta.angle);

    }

}
