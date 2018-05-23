package planet;

import java.util.ArrayList;
public interface PlanetInfo {   

   void readPlanetInfo();
   static double conversion(char type, double value) {
       if(type == 'k')
           return value * 1.6;
       else
           return value / 1.6;
   }
}
