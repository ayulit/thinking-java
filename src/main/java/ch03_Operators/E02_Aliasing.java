package ch03_Operators;

class Weapon {
    float caliber;
}

public class E02_Aliasing {

    public static void main(String[] args) {
        
        Weapon ak = new Weapon();
        Weapon m16 = new Weapon();
        
        ak.caliber = 7.62F;
        m16.caliber = 5.56F;
        
        System.out.println("1: ak.caliber: " + ak.caliber + ", m16.caliber: " + m16.caliber);
        
        ak = m16; // New AK for NATO caliber
        
        System.out.println("2. New AK for NATO caliber: ak.caliber: " + ak.caliber + ", m16.caliber: " + m16.caliber);
        
        ak.caliber = 5.7F; // NATO changes its standarts.
        
        System.out.println("3. NATO changes its standarts.: ak.caliber: " + ak.caliber + ", m16.caliber: " + m16.caliber);

    }

}
