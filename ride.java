package javacodes.rent;
import java.util.*;

class Driver {
    private String name;
    private String model;
    private double rating;
    private double distance;

    public Driver(String name, String model, double rating, double distance) {
        this.name = name;
        this.model = model;
        this.rating = rating;
        this.distance = distance;
    }

    public String getname() {
        return name;
    }

    public String getmodel() {
        return model;
    }

    public double getrating() {
        return rating;
    }

    public double getdistance() {
        return distance;
    }
}

public class ride {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Driver> drivers = new ArrayList<>();

        System.out.println("Customer Ride Distance (in km):");
        double distance = sc.nextDouble();

        System.out.println("Car Requested:");
        String car = sc.next();
        
        drivers.add(new Driver("A", "Sedan", 4.0, 500));
        drivers.add(new Driver("B", "HatchBack", 4.3, 1000));
        drivers.add(new Driver("C", "5 Seater", 4.8, 200));
        drivers.add(new Driver("D", "Sedan", 4.1, 700));
        drivers.add(new Driver("E", "HatchBack", 4.7, 430));

        Driver selectedDriver = null;
        double near = Double.MAX_VALUE;

        for (Driver driver : drivers) {
            if (driver.getrating() >= 4 && driver.getmodel().equalsIgnoreCase(car)) {
                if (driver.getdistance() < near) {
                    selectedDriver = driver;
                    near = driver.getdistance();
                }
            }
        }
        System.out.println("Driver " + selectedDriver.getname() + " will get you to the destination.");
        double totalCharge = distance * 8;
        System.out.println("Your charge will be Rs " + totalCharge); 
    }
}
