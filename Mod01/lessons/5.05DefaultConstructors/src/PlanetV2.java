/**
 * @purpose: PlanetV2 class - uses Procedural Programming and static methods
 *
 * @author APCS Team
 * @version FLVS 2020
 */
 
 
public class PlanetV2
{


   public static double calcRadius(double diameter)
   {
       double radius = 0.0;
       radius = diameter / 2.0;
       return radius;
   }

   public static void printPlanet(String n, double rad)
   {
       System.out.println("Planet " + n + " has a radius of " + rad);
   }
   

   public static void main (String[] args) {
   
       String name = "Jupiter";
       int diam = 142984;
       double radius = 0.0;
       
       radius = calcRadius(diam);
       printPlanet(name, radius);
   
   }
    
    
}
