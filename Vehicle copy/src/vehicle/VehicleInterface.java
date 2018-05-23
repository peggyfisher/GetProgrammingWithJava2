/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle;
public interface VehicleInterface {
     //constants
    int count = 0;
    void move(int direction);
    void brake();
    void accelerate(int speed);
    void slowDown(int speed);
    void setMake(String make);
    void setModel(String model);
    void setYear(int year);
    
}
