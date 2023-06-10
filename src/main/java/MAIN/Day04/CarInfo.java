package MAIN.Day04;

public class CarInfo {
    public static void main(String[] args) {

        int year = 2015;
        String make = "Lexus";
        String model = "GS350 F-Sport";
        int miles = 47500;
        String color = "Grey";
        int price = 50_000;

        System.out.println(year+" "+make+" "+
                            model+", "+miles+" miles, "+color+", "+
                                    "$"+price+".");

    }
}
