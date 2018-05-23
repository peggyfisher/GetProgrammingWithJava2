
package planets;
import java.util.ArrayList;
public class Planets {
    private static final ArrayList<String> planets = new ArrayList<String>();
    public static void addPlanets() {
        planets.add("Earth");
        planets.add("Mars");
        planets.add("Uranus");
        planets.add("Venus");
        planets.add("Mercury");
        planets.add("Jupiter");
        planets.add("Saturn");
        planets.add("Neptune");
    }
    public static void main(String[] args) {
        addPlanets();
        ArrayList<String> empty = new ArrayList<String>();
        System.out.println(planets);
        ArrayList dwarfPlanets = new ArrayList<String>();
        dwarfPlanets.add("Pluto");
        planets = dwarfPlanets; 
    }
}
