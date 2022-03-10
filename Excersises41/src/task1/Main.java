package task1;

public class Main {
    public static void main(String[] args) {
        Driver driver1 = new Driver ("Veronika", 22);
        Car car1 = new Car("Mazda","3",2016,"4 doors");
        car1.setDriver(driver1);
        System.out.println(car1);
        Driver driver2 = new Driver ("Sebastian", 25);
        Car car2 = new Car("Peugeot","255c",2005,"2 doors");
        car2.setDriver(driver2);
        System.out.println(car2);

    }
}
