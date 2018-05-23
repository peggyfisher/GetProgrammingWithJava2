
package vehicle;
public class Vehicle implements VehicleInterface, Comparable{
    public String make;
    public String getMake() { return make; }
    public void setMake(String make) { this.make = make; }
    public String getModel() { return model; }
    public void setModel(String model) { this.model = model;}
    public int getYear() {return year;}
    public void setYear(int year) {this.year = year;}
    public String model;
    public int year;
    public void move(int direction){
        
        if(direction == 0)
            System.out.println("Turn Right");
        else if (direction == 180)
            System.out.println("Turn Left");
        else if(direction == 90)
            System.out.println("Go Straight");
        else
            System.out.println("Reverse!");
    }
   
    public void brake(){
        System.out.println("STOP!!");
    }
    public void accelerate(int speed){
        System.out.println("Speed up by "+speed + " mph");
    }
    public void slowDown(int speed){
        System.out.println("Slow down by " + speed + " mph");
    }
    public int compareTo(Object o) {
        Vehicle v = (Vehicle)o;
        if(this.make == v.make && this.model == v.model &&
                this.year == v.year)
            return 0;
        else 
            return 1;     
    }
    public static void main(String[] args) {
        VehicleInterface v1 = new Vehicle();       
        v1.setMake("Chevy");
        v1.setModel("Cruze");
        v1.setYear(2018);
        
        v1.accelerate(10);
        v1.move(90);
        v1.slowDown(5);
        v1.move(0);
        v1.brake();
       
            
    }
    
}
