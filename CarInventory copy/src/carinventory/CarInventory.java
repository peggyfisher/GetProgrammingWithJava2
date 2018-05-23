package carinventory;

import java.util.ArrayList;
import java.util.Scanner;

public class CarInventory {
    private String make;
        private String model;
        private int year;
        private double mpg;
        private String color;

        CarInventory() {

        }

        CarInventory(String make, String model, int year,
                double mpg, String color) {
            this.make = make;
            this.model = model;
            this.year = year;
            this.mpg = mpg;
            this.color = color;

        }

        public CarInventory(String model, int year,
                double mpg, String color) {
            make = "Ford";
            this.model = model;
            this.year = year;
            this.mpg = mpg;
            this.color = color;

        }

        public String getMake() {
            return make;
        }

        public String getModel() {
            return model;
        }

        public int getYear() {
            return year;
        }

        public double getMPG() {
            return mpg;
        }

        public String getColor() {
            return color;
        }

        public void setMake(String make) {
            if (make.length() < 4 || make.length() > 50) {
                System.out.println("Invalid make");
            } else {
                this.make = make;
            }
        }

        public void setModel(String model) {
            if (model.length() < 4 || model.length() > 100) {
                System.out.println("Invalid model");
            } else {
                this.model = model;
            }
        }

        public void setYear(int year) {
            if (year < 1900 || year > 2050) {
                System.out.println("Invalid year");
            } else {
                this.year = year;
            }
        }

        public void setMPG(double mpg) {
            if (mpg < 0 || mpg > 100) {
                System.out.println("Invalid mpg");
            } else {
                this.mpg = mpg;
            }
        }

        public void setColor(String color) {
            if (color.length() < 3 || color.length() > 40) {
                System.out.println("Invalid color");
            } else {
                this.color = color;
            }
        }
        public double calculateDistance(double fuel) {
            double distance = fuel * mpg;
            return distance;
        }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        CarInventory car1 = new CarInventory("Subaru", "Outback", 2017, 28, "black");
        //CarInventory car2 = new CarInventory("Chevrloet", "Malibu", 2015, 30, "grey");
        //CarInventory car3 = new CarInventory("Ford", "Fusion", 2018, 32, "blue");
        System.out.println("My car: ");
        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
        System.out.println(car1.getMPG());
        System.out.println(car1.getColor());
        ArrayList<Car> cars = new ArrayList<Car>();
        
        car1.setMake("Ford");
        car1.setModel("Mustang");
        car1.setYear(2018);
        car1.setMPG(55.7);
        car1.setColor("Red");
        
        System.out.println("");
        System.out.println("My car: ");
        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
        System.out.println(car1.getMPG());
        System.out.println(car1.getColor());
        
        System.out.println("Enter fuel remaining in tank: ");
        double fuel = in.nextDouble();
        double distance = car1.calculateDistance(fuel);
        System.out.println("The car can travel " + distance + "miles");
        
        car1.setYear(2075);
    }

  
}
