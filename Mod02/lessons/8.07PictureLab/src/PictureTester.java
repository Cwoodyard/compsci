/*
 * Purpose:
 * 
 * < your name >
 * < today's date >
*/

/**
 * This class contains class (static) methods that will help you test the
 * Picture class methods. Uncomment the methods and the code in the main to
 * test.
 * 
 * @author Barbara Ericson
 */
public class PictureTester {
    /** Method to test zeroBlue - Activity 5 */
    public static void testZeroBlue() {
        Picture beach = new Picture("beach.jpg");
        beach.explore();
        beach.zeroBlue();
        beach.explore();
    }

    /** Method to test KeepOnlyRed - Activity 5 */
    public static void testKeepOnlyRed() {
        Picture robot = new Picture("robot.jpg");
        robot.explore();
        robot.keepOnlyRed();
        robot.explore();
    }

    /** Method to test KeepOnlyRed - Activity 5 */
    public static void testNegate() {
        Picture robot = new Picture("robot.jpg");
        robot.explore();
        robot.negate();
        robot.explore();
    }

    /** Method to test KeepOnlyRed - Activity 5 */
    public static void testGrayscale() {
        Picture robot = new Picture("robot.jpg");
        robot.explore();
        robot.grayscale();
        robot.explore();
    }

    /** Method to test mirrorVertical */
    public static void testMirrorVertical() {
        Picture caterpillar = new Picture("caterpillar.jpg");
        caterpillar.explore();
        caterpillar.mirrorVertical();
        caterpillar.explore();
    }

    /** Method to test mirrorVertical */
    public static void testMirrorVerticalRightToLeft() {
        Picture beach = new Picture("beach.jpg");
        beach.explore();
        beach.mirrorVerticalRightToLeft();
        beach.explore();
    }

    /** Method to test mirrorVertical */
    public static void testMirrorHorizontal() {
        Picture beach = new Picture("beach.jpg");
        beach.explore();
        beach.mirrorHorizontal();
        beach.explore();
    }

    /** Method to test mirrorVertical */
    public static void testMirrorHorizontalBotToTop() {
        Picture beach = new Picture("beach.jpg");
        beach.explore();
        beach.mirrorHorizontalBotToTop();
        beach.explore();
    }

    /** Method to test mirrorTemple */
    public static void testMirrorTemple() {
        Picture temple = new Picture("temple.jpg");
        temple.explore();
        temple.mirrorTemple();
        temple.explore();
    }

    /** Method to test mirrorGull */
    public static void testMirrorArms() {
        Picture arms = new Picture("snowman.jpg");
        arms.explore();
        arms.mirrorArms();
        arms.explore();
    }

    /** Method to test mirrorGull */
    public static void testMirrorGull() {
        Picture arms = new Picture("seagull.jpg");
        arms.explore();
        arms.mirrorGull();
        arms.explore();
    }

    /** Method to test the collage method */
    public static void testCollage() {
        Picture canvas = new Picture("640x480.jpg");
        canvas.createCollage();
        canvas.explore();
    }

    /** Method to test edgeDetection */
    public static void testEdgeDetection() {
        Picture swan = new Picture("swan.jpg");
        swan.edgeDetection(10);
        swan.explore();
    }

    /**
     * Main method for testing. Every class can have a main method in Java
     */
    public static void main(String[] args) {
        // uncomment a call here to run a test and
        // comment out the ones you don't want to run

        // Activity 5
//        testZeroBlue();
//        // testKeepOnlyBlue();
//        testKeepOnlyRed();
//        // testKeepOnlyGreen();
//        testNegate();
//        testGrayscale();

        // Activity 5 Challenge - optional
        // testFixUnderwater();

        // Activity 6
//        testMirrorVertical();
//        testMirrorVerticalRightToLeft();
//        testMirrorHorizontal();
//        testMirrorHorizontalBotToTop();

        // Activity 6 Challenge - optional
        // testMirrorDiagonal();

        // Activity 7
//        testMirrorTemple();
        testMirrorArms();
        testMirrorGull();

        // Activity 8
        // testCollage();
        // testCopy();
        // testMyCollage();

        // Activity 9
        // testEdgeDetection();
        // testEdgeDetection2();

        // Extra methods
        // testChromakey();
        // testEncodeAndDecode();
        // testGetCountRedOverValue(250);
        // testSetRedToHalfValueInTopHalf();
        // testClearBlueOverValue(200);
        // testGetAverageForColumn(0);
    }
}
