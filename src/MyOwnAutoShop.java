public class MyOwnAutoShop {
    public static void main(String[] args) {

        Truck myTruck1 = new Truck(2000, 60, 9000, "Red");
        Truck myTruck2 = new Truck(1000, 90, 5000, "Metalic grey");
        Ford myFord = new Ford(1500, 3000, 120, 15000.00, "Black");
        Sedan mySedan1 = new Sedan(25, 150, 20000.00, "Yellow");
        Sedan mySedan2 = new Sedan(19, 130, 20000.00, "Blue");
        Car myCar = new Car(250, 50000.00, "Ferrari Red");

        System.out.println("The first Truck sale price is: $" + myTruck1.getSalePrice());
        System.out.println("The second Truck sale price is: $" + myTruck2.getSalePrice());
        System.out.println("The Ford sale price is $" + myFord.getSalePrice());
        System.out.println("The first Sedan price is $" + mySedan1.getSalePrice());
        System.out.println("The second Sedan price is $" + mySedan2.getSalePrice());
        System.out.println("The car price is $" + myCar.getSalePrice());
    }
}
