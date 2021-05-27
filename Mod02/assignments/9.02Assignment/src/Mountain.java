/**
 * This class is a subclass of Terrain.java
 *
 * @author  Cole Woodyard
 * 
 * @version 5/10/2021
 */
public class Mountain extends Terrain {
    public int mountCount;

    public Mountain(int l, int w, int m) {
        super(l, w);

        mountCount = m;
    }

    public String getMountainCount() {
        return super.getTerrainSize() + " and has " + mountCount + " mountains";
    }

}
