/**
 * @purpose: PlanetV3 object - uses the default constructor 
 *
 * @author APCS Team
 * @version FLVS 2020
 */
 
 
public class PlanetV3
{
   // default constructor     
   public PlanetV3(){
 
   }

   public double calcRadius(double diameter)
   {
       double radius = 0.0;
       radius = diameter / 2.0;
       return radius;
   }

   public void printPlanet(String n, double rad)
   {
       System.out.println("Planet " + n + " has a radius of " + rad);
   }
   

   public static void main (String[] args) {
   
       String name = "Jupiter";
       int diam = 142984;
       double radius = 0.0;
       
       PlanetV3 space = new PlanetV3();
       
       radius = space.calcRadius(diam);
       space.printPlanet(name, radius);
   
   }
    
    
}
