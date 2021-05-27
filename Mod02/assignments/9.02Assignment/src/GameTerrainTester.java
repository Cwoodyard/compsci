/**
 * This class is a tester class for the Terrain List.
 *
 * @author  Cole Woodyard
 * 
 * @version 5/10/2021
 */
public class GameTerrainTester {
    public static void main(String[] args) {
        Terrain terrain = new Terrain(400, 400);
        Mountain mountain = new Mountain(650, 430, 88);
        WinterMountain winterMountain = new WinterMountain(650, 560, 47, 2);
        Forest forest = new Forest(420, 420, 69);

        System.out.println(terrain.getTerrainSize());
        System.out.println(forest.getTreeCount());
        System.out.println(mountain.getMountainCount());
        System.out.println(winterMountain.getMountainCount());

    }
}
