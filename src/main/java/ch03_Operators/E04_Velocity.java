package ch03_Operators;

import java.util.Random;

public class E04_Velocity {

    public static void main(String[] args) {
        
        /* With randomizer */
        Random rand = new Random(47);
        
        float distance1 = rand.nextFloat()*100 + 1;
        float time1 = rand.nextFloat()*100 + 1;
        
        System.out.println("distance1=" + distance1 + " time1=" + time1);
        System.out.println("velocity1=" + distance1/time1);
        
        float distance2 = rand.nextFloat()*100 + 1;
        float time2 = rand.nextFloat()*100 + 1;
        
        System.out.println("distance2=" + distance2 + " time2=" + time2);        
        System.out.println("velocity2=" + distance2/time2);

    }

}
