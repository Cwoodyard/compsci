/**
 * Purpose: main processing class for Music.java
 *
 * @author  Cole Woodyard
 * 
 * @version 3/20/2021
 *
 */
public class MusicTesterV1 {
    public static void output(Music[] m) {
        System.out.println("Song                      Year        Artist");
        System.out.println("-------------------------------------------------------");
        for (int i = 0; i < m.length; i++) System.out.println(m[i]);
        System.out.println();
    }

    public static void output(Music[] m, Boolean[] pos) {
        System.out.println("Song                      Year        Artist");
        System.out.println("-------------------------------------------------------");
        for (int i = 1; i < pos.length; i++) {
            try {
                if (pos[i].equals(true)) {
                    System.out.println(m[i]);
                }
            } catch (NullPointerException e) {

            }

        }
        System.out.println();
    }

    public static void findSong(Music[] m, String s) {
        System.out.println();
        System.out.println("Searching the Library for " + s);
        Boolean found = false;
        Boolean fullFound = false;
        Boolean[] pos = new Boolean[m.length];
        int i = 0;
        int t = 0;

        for (t = 0; t < m.length; t++) {
            for (i = 0; i < m.length; i++) {
                if (m[i].getTitle() == s) {
                    if (pos[i] == null) {
                        found = true;
                        pos[i] = true;
                        break;   // terminates the for loop
                    }
                }
            }
            try {
                if (pos[i] = true) {  // we have found the person
                    fullFound = true;
                    found = false;
                }
            } catch (ArrayIndexOutOfBoundsException e) {

            }

        }
        if (fullFound = true) {  // we have found the person
            System.out.println("We found " + s + " in the Library: ");

            output(m, pos);

        } else System.out.println(s + " is not in the Library");

    }

    public static void findYear(Music[] m, int y) {
        System.out.println("Searching the Library for songs from " + y);
        Boolean found = false;
        Boolean fullFound = false;
        Boolean[] pos = new Boolean[m.length];
        int i = 0;
        int t = 0;

        for (t = 0; t < m.length; t++) {
            for (i = 0; i < m.length; i++) {
                if (m[i].getYear() == y) {
                    if (pos[i] == null) {
                        found = true;
                        pos[i] = true;
                        break;   // terminates the for loop
                    }
                }
            }
            try {
                if (pos[i] = true) {  // we have found the person
                    fullFound = true;
                    found = false;
                }
            } catch (ArrayIndexOutOfBoundsException e) {

            }

        }
        if (fullFound = true) {  // we have found the person
            System.out.println("We found songs from " + y + " in the Library: ");

            output(m, pos);

        } else System.out.println(y + " is not in the Library");

    }

    public static void findArtist(Music[] m, String a) {
        System.out.println("Searching the Library for songs by " + a);
        Boolean found = false;
        Boolean fullFound = false;
        Boolean[] pos = new Boolean[m.length];
        int i = 0;
        int t = 0;

        for (t = 0; t < m.length; t++) {
            for (i = 0; i < m.length; i++) {
                if (m[i].getArtist().compareTo(a) == 0) {
                    if (pos[i] == null) {
                        found = true;
                        pos[i] = true;
                        break;   // terminates the for loop
                    }
                }
            }
            try {
                if (pos[i] = true) {  // we have found the person
                    fullFound = true;
                    found = false;
                }
            } catch (ArrayIndexOutOfBoundsException e) {

            }

        }
        if (fullFound = true) {  // we have found the person
            System.out.println("We found " + a + " in the Library: ");

            output(m, pos);

        } else System.out.println(a + " is not in the Library");

    public static void main(String[] args) {
        Music[] songs = new Music[10];

        songs[0] = new Music("Sweet Dreams", 1983, "Eurythmitics");
        songs[1] = new Music("Cheap Thrills", 2016, "Sia");
        songs[2] = new Music("Shape of You", 2017, "Ed Sheeran");
        songs[3] = new Music("Fight For Your Right", 1989, "Beastie Boys");
        songs[4] = new Music("No Sleep Till Brooklyn", 1989, "Beastie Boys");
        songs[5] = new Music("Gold", 2014, "Imagine Dragons");
        songs[6] = new Music("Radioactive", 2013, "Imagine Dragons");
        songs[7] = new Music("Stressed Out", 2015, "Twenty One Pilots");
        songs[8] = new Music("Wonderwall", 1995, "Oasis");
        songs[9] = new Music("The Walker", 2013, "Fitz and The Tantrums");

        System.out.println("Library Collection");
        output(songs);
        findSong(songs, "Gold");
        findYear(songs, 2013);
        findArtist(songs, "Imagine Dragons");
    }
}
