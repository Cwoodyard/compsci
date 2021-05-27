/**
 * This class is a subclass of Terrain.java
 *
 * @author  Cole Woodyard
 * 
 * @version 5/10/2021
 */
public class Forest extends Terrain {
    public int treeCount;

    public Forest(int l, int w, int tc) {
        super(l, w);
        treeCount = tc;
    }

    public String getTreeCount() {
        return super.getTerrainSize() + " and has " + treeCount + " trees";
    }
}
