/**
 * This class is a subclass of Mountain.java
 *
 * @author  Cole Woodyard
 * 
 * @version 5/10/2021
 */
public class WinterMountain extends Mountain {
    public int temperature;

    public WinterMountain(int l, int w, int m, int t) {
        super(l, w, m);
        // TODO Auto-generated constructor stub
        temperature = t;
    }

    @Override
    public String getMountainCount() {
        return super.getMountainCount() + " with a temperature of " + temperature + " degrees";
    }

}
