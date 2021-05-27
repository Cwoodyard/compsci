import java.util.ArrayList;

/**
 * Purpose: main processing class for Music.java
 *
 * @author  Cole Woodyard
 * 
 * @version 3/24/2021
 *
 */
public class MusicTesterV3 {
    // Output tools
    public static void output(ArrayList<Music> songs) {
        System.out.println("Song                      Year        Artist");
        System.out.println("-------------------------------------------------------");
        for (int i = 0; i < songs.size(); i++) System.out.println(songs.get(i));
        System.out.println();
    }

    public static void output(ArrayList<Music> songs, Boolean[] pos) {
        System.out.println("Song                      Year        Artist");
        System.out.println("-------------------------------------------------------");
        for (int i = 1; i < pos.length; i++) {
            try {
//                System.out.println("Debug: " + pos[i]);
//                System.out.println("Debug: " + songs.get(i));
                if (pos[i].equals(true)) {
                    System.out.println(songs.get(i));
                }
            } catch (NullPointerException e) {

            }

        }
        System.out.println();
    }

    // Sorting selection
    public static void songSort(ArrayList<Music> songs) {
        System.out.println("Sorting by Title Initialized: ");
        int i;
        int k;
        int posMax;
        Music temp;
        i = 0;
        k = 0;
        for (i = songs.size() - 1; i > 0; i--) {
            posMax = 0;

            for (k = 1; k <= i; k++) {
                if (songs.get(k).getTitle().compareTo(songs.get(posMax).getTitle()) > 0) posMax = k;
            }

            temp = songs.get(i);
            songs.set(i, songs.get(posMax));
            songs.set(posMax, temp);

        }
        System.out.println("Done Sorting by Title!");
        output(songs);
    }

    public static void yearSort(ArrayList<Music> songs) {
        System.out.println("Sorting by Year Initilized:");
        for (int i = 0; i < songs.size(); i++) {
            for (int j = i + 1; j < songs.size(); j++) {
                // compare list.get(i) and list.get(j)
//                System.out.println(music.get(i).getTitle().compareTo(music.get(j).getTitle()));

                if (songs.get(i).getYear() > songs.get(j).getYear()) {
//                    System.out.println("Before: " + music);
                    songs.add(i, songs.get(j));
                    songs.remove(j + 1);
//                    System.out.println("After: " + movie);
                }
            }
        }
        System.out.println("Done Sorting by Year!");
        output(songs);
    }

    public static void artistSort(ArrayList<Music> songs) {
        System.out.println("Sorting by Artist Initialized: ");
        int i;
        int k;
        int posMax;
        Music temp;
        i = 0;
        k = 0;
        for (i = songs.size() - 1; i > 0; i--) {
            posMax = 0;

            for (k = 1; k <= i; k++) {
                if (songs.get(k).getArtist().compareTo(songs.get(posMax).getArtist()) > 0) posMax = k;
            }

            temp = songs.get(i);
            songs.set(i, songs.get(posMax));
            songs.set(posMax, temp);

        }
        System.out.println("Done Sorting by Artist!");
        output(songs);
    }

    // Finders
    public static void findSong(ArrayList<Music> songs, String s) {
        System.out.println();
        songSort(songs);
        System.out.println();
        System.out.println("Searching the Library for " + s);
        Boolean found = false;
        Boolean fullFound = false;
        Boolean[] pos = new Boolean[songs.size()];
        int high = songs.size();
        int low = -1;
        int probe;

        while (high - low > 1) {

            probe = (high + low) / 2;
            if (songs.get(probe).getTitle().compareTo(s) > 0)
                high = probe;
            else low = probe;
//            System.out.println("Debug: Probe " + probe);
//            System.out.println("Debug: Low " + low);
        }

        if ((low >= 0) && (songs.get(low).getTitle().compareTo(s) == 0)) {
            if (pos[low] == null) {
//                System.out.println("Debug: pos[low] was found true");
                pos[low] = true;
                found = true;
            }
            try {
                if (pos[low] = true) {
                    fullFound = true;
                    found = false;
                }
            } catch (ArrayIndexOutOfBoundsException e) {

            }
        }

        if (fullFound = true) {  // we have found the song
            System.out.println("We found " + s + " in the Library: ");

            output(songs, pos);

        } else System.out.println(s + " is not in the Library");

    }

    public static void findYear(ArrayList<Music> songs, int y) {
        System.out.println();
        yearSort(songs);
        System.out.println();
        System.out.println("Searching the Library for songs from " + y);
        Boolean found = false;
        Boolean fullFound = false;
        Boolean[] pos = new Boolean[songs.size()];
        int high = songs.size();
        int low = -1;
        int probe;

        while (high - low > 1) {

            probe = (high + low) / 2;
            if (songs.get(probe).getYear() > y) {
                high = probe;
            } else {
                low = probe;
            }
//            System.out.println("Debug: Probe " + probe);
//            System.out.println("Debug: Low " + low);
            if ((low >= 0) && (songs.get(low).getYear() == y)) {
                if (pos[low] == null) {
//                    System.out.println("Debug: pos[low] was found true");
                    pos[low] = true;
                    found = true;
                }
                try {
                    if (pos[low] = true) {
//                        System.out.println("Debug: pos[low] was found true");
                        fullFound = true;
                        found = false;
                    }
                } catch (ArrayIndexOutOfBoundsException e) {

                }
            }
        }

        if (fullFound = true) {  // we have found the song
            System.out.println("We found songs from " + y + " in the Library: ");

            output(songs, pos);

        } else System.out.println(y + " is not in the Library");

    }

    public static void findArtist(ArrayList<Music> songs, String a) {
        System.out.println();
        artistSort(songs);
        System.out.println();
        System.out.println("Searching the Library for songs by " + a);
        Boolean found = false;
        Boolean fullFound = false;
        Boolean[] pos = new Boolean[songs.size()];
        int high = songs.size();
        int low = -1;
        int probe;

        while (high - low > 1) {

            probe = (high + low) / 2;
            if (songs.get(probe).getArtist().compareTo(a) > 0) {
                high = probe;
            } else {
                low = probe;
            }
//            System.out.println("Debug: Probe " + probe);
//            System.out.println("Debug: Low " + low);
            if ((low >= 0) && (songs.get(low).getArtist().compareTo(a) == 0)) {
                if (pos[low] == null) {
//                    System.out.println("Debug: pos[low] was found true");
                    pos[low] = true;
                    found = true;
                }
                try {
                    if (pos[low] = true) {
//                        System.out.println("Debug: pos[low] was found true");
                        fullFound = true;
                        found = false;
                    }
                } catch (ArrayIndexOutOfBoundsException e) {

                }
            }
        }
        if (fullFound = true) {  // we have found the person
            System.out.println("We found " + a + " in the Library: ");

            output(songs, pos);

        } else System.out.println(a + " is not in the Library");

    }

    // Main interface
    public static void main(String[] args) {
        ArrayList<Music> songs = new ArrayList<Music>();
        songs.add(new Music("Sweet Dreams", 1983, "Eurythmitics"));
        songs.add(new Music("Cheap Thrills", 2016, "Sia"));
        songs.add(new Music("Shape of You", 2017, "Ed Sheeran"));
        songs.add(new Music("Fight For Your Right", 1989, "Beastie Boys"));
        songs.add(new Music("No Sleep Till Brooklyn", 1989, "Beastie Boys"));
        songs.add(new Music("Gold", 2014, "Imagine Dragons"));
        songs.add(new Music("Radioactive", 2013, "Imagine Dragons"));
        songs.add(new Music("Stressed Out", 2015, "Twenty One Pilots"));
        songs.add(new Music("Wonderwall", 1995, "Oasis"));
        songs.add(new Music("The Walker", 2013, "Fitz and The Tantrums"));

        System.out.println("Library Collection");
        output(songs);
        findSong(songs, "Wonderwall");
        findYear(songs, 2013);
        findArtist(songs, "Imagine Dragons");

    }
}
