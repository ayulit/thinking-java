package ch02_Object;

public class E11_AllTheColorsOfTheRainbow {

    int anIntegerRepresentingColors;
    
    void changeTheHueOfTheColor(int newHue) {
        anIntegerRepresentingColors = newHue;
    }
    
    public static void main(String[] args) {
        E11_AllTheColorsOfTheRainbow all = new E11_AllTheColorsOfTheRainbow();
        System.out.println(all.anIntegerRepresentingColors);
        all.changeTheHueOfTheColor(27);
        System.out.println(all.anIntegerRepresentingColors);
    }

}
