package carinventory;

import java.util.ArrayList;
import java.util.Scanner;

public class Car {

    private String make;
    private String model;
    private int year;
    private double mpg;
    private String color;

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

    @Override
    public String toString() {
        return "\nCar make: " + make + "\tCar model: " + model
                + "\tCar year: " + year + "\tMPG: " + mpg
                + "\tColor: " + color + "\n";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String make, model, color;
        double mpg;
        int year;
        boolean done = false;
        Car c1;
        System.out.println(c1.toString());

        ArrayList<Car> usedCars = new ArrayList<Car>();
        ArrayList<Car> newCars = new ArrayList<Car>();

        while (!done) {
            System.out.println("Enter make, model, color, mpg, year ");
            make = in.nextLine();
            model = in.nextLine();
            color = in.nextLine();
            mpg = in.nextDouble();
            year = in.nextInt();
            Car car = new Car();
            car.setMake(make);
            car.setModel(model);
            car.setColor(color);
            car.setMPG(mpg);
            car.setYear(year);
            System.out.println("Is this a new car? (y/n) ");
            in.nextLine();
            if(in.nextLine().equalsIgnoreCase("y"))
                newCars.add(car);
            else 
                usedCars.add(car);

            System.out.println("Want to enter another car? (y/n) ");
            
            if (in.nextLine().equalsIgnoreCase("n")) {
                done = true;
            }
        }
        System.out.println("These are the cars on the lot: ");
        System.out.println(usedCars);
        System.out.println("There are " + usedCars.size() + " used cars on the lot\n");

        usedCars.remove(0);
        
        System.out.println("These are the cars on the lot after removing the first element in the list: ");
        System.out.println(usedCars);
        System.out.println("There are " + usedCars.size() + " used cars on the lot\n");

    }

}
