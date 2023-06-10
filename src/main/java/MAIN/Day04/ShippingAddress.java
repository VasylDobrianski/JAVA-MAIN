package MAIN.Day04;

public class ShippingAddress {
    public static void main(String[] args) {

        String name = "Michael Scott";
        int buildingNumber = 1007;
        String streetName = "Hawk Ln";
        String city = "Miami";
        String state = "FL";
        int zipCode = 33101;

        String address = name +"\n" +
                buildingNumber + " " + streetName + "\n" +
                city + ", " +state + " " + zipCode;


        System.out.println(address);



    }
}
