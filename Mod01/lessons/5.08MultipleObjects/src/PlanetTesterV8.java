/**
 * @purpose: Tester to create two PlanetV8 objects
 *
 * @author APCS Team
 * @version FLVS 2020
 */
 
 
public class PlanetTesterV8
{
   
   public static void main (String [] args) {
   
      
       String name1 = "Jupiter";
       int diam1 = 142984;
       
       String name2 = "Mars";
       int diam2 = 6794;
       
       double radius = 0.0;
       
       PlanetV8 spaceA = new PlanetV8(name1);
       radius = spaceA.calcRadius(diam1);
       System.out.println("Planet: " + name1 + "\t Radius: " + radius);
       
       
       PlanetV8 spaceB = new PlanetV8(name2, diam2);
       radius = spaceB.calcRadius();
       System.out.println("Planet: " + name2 + "\t\t Radius: " + radius);
       
       
       // create a third PlanetV8 object

   
   
   }
    
    
}
