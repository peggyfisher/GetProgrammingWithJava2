/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planet;

import java.util.ArrayList;
import java.util.Scanner;
public class Planet implements PlanetInfo, Comparable {
    public String planetName;
    public double milesFromEarth;
    public String description;

    public void readPlanetInfo() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the planet information (name distance from "
                + "Earth description): ");
        String info = in.nextLine();
        String[] parsedInfo = info.split(",");
        this.description = parsedInfo[2];
        this.milesFromEarth = Double.parseDouble(parsedInfo[1]);
        this.planetName = parsedInfo[0];
    }
    public int compareTo(Object o) {
        Planet p = (Planet) o;
        if(this.milesFromEarth < p.milesFromEarth) 
            return -1;
        else 
            return 1;
    }
    @Override
    public String toString() {
        return String.format("%s is %.2f  miles from Earth "
                    + "and \n%.2f Kilometers from Earth\n"
                    + "It is known as %s\n\n", this.planetName,
                    this.milesFromEarth, PlanetInfo.conversion('k',
                           this.milesFromEarth), this.description);
    }
    public static void main(String[] args) {

        ArrayList<Planet> planets = new ArrayList<Planet>();
        for (int i = 0; i < 8; i++) {
            Planet p = new Planet();
            p.readPlanetInfo();
            planets.add(p);
        }
        StringBuilder output = new StringBuilder();
        for (Planet p_info : planets) {
            output.append(p_info.toString());
        }
        System.out.println(output);
        double closest = planets.get(0).milesFromEarth;
        int closeIndex = 0;
        int farIndex = 0;
        double furthest = planets.get(0).milesFromEarth;
        for(int i = 1; i < 8; i++) {
            if(planets.get(i).milesFromEarth<closest) {
                closeIndex = i;
                closest = planets.get(i).milesFromEarth;
            }
            if(planets.get(i).milesFromEarth > furthest) {
                farIndex = i;
                furthest = planets.get(i).milesFromEarth;
            }
        }
        System.out.println("Closest planet is: " + planets.get(closeIndex).toString());
    }
}
