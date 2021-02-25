/**
 * @purpose An election tester based solely on Arrays
 *
 * @author  Cole Woodyard
 * 
 * @version 2/24/2021
 */
public class ElectionTesterV7 {
    public static Candidate[] array2 = new Candidate[6];
    public static Candidate[] array3 = new Candidate[7];

    public static void candiRunners(Candidate[] array) {
        for (Candidate candis : array) {
            System.out.println(candis);
        }
    }

    public static void finalOutput(Candidate[] array) {
        int votes = candiVotes(array);

        System.out.println();
        System.out.println("Welcome to the Actor Elections!");
        System.out.printf("%-20s %-20s %-20s", "Candidate", "Votes Received", "% of Total Votes");
        System.out.println();
        System.out.println("===========================================================");

        for (Candidate candis : array) {

            try {
                if (candis.getName().equalsIgnoreCase(null)) {
                    System.out.print("");
                } else {
                    System.out.printf("%-20s %-20s %-20.2f", candis.getName(), candis.getVotes(), (double) candis.getVotes() / votes * 100);
                    System.out.println();
                }
            } catch (NullPointerException e) {
//                System.out.println("Debug: An error has been found on output. Please Fix me.");
            }

        }
        System.out.println();
        System.out.println("The Total number of votes is: " + votes);
    }

    public static int candiVotes(Candidate[] array) {
        int totalVotes = 0;
        for (Candidate candis : array) {

            totalVotes += candis.getVotes();

        }
        return totalVotes;
    }

    // Change name of Election Candidate
    public static void candiSwap(Candidate[] array, String oldCandi, String newCandi) {
        for (Candidate candis : array) {
            if (candis.getName().equals(oldCandi)) {
                System.out.println(oldCandi + " has been replaced with " + newCandi);
                candis.setName(newCandi);

            }
        }

    }

    // Change votes of Election Candidate
    public static void voteSwap(Candidate[] array, String name, int newVotes) {
        for (Candidate candis : array) {
            if (candis.getName().equals(name)) {
                System.out.println(name + "'s votes have changed to: " + newVotes);
                candis.setVotes(newVotes);
            }
        }
    }

    // Change name and votes of Election Candidate
    public static void fullCandiSwap(Candidate[] array, String oldCandi, String newCandi, int newVotes) {
        for (Candidate candis : array) {
            if (candis.getName().equals(oldCandi)) {
                System.out.println(oldCandi + " has been replaced with " + newCandi);
                candis.setName(newCandi);
                System.out.println(newCandi + " enters in with " + newVotes + " votes!");
                candis.setVotes(newVotes);

            }
        }
    }

    // Inserting data into a new space
    public static void candiInsertion(Candidate[] array, int location, String newCandi, int newVotes) {

        String bottomCandiName = array[array.length - 1].getName(); // logs bottom candidate name
        int bottomCandiVotes = array[array.length - 1].getVotes(); // logs bottom candidate votes

        // Creates a second array with 1 more slot
        System.arraycopy(array, 0, array2, 0, array.length); // copies the array leaving the last slot still open

        array2[array.length] = new Candidate(bottomCandiName, bottomCandiVotes); // fills the last slot with the last member that would have been erased from the
                                                                                 // board
        for (int index = array2.length - 1; index > location; index--) { // goes through and makes room for new candidate by moving needed people down a
                                                                         // spot
            array2[index] = array2[index - 1];
        }
        array2[location] = new Candidate(newCandi, newVotes); // adds the new candidate in the designated spot

        array = new Candidate[6];
        System.arraycopy(array2, 0, array, 0, array2.length);

        // debug
//        for (Candidate candis : array) {
//            System.out.printf("%-20s %-20s %-20.2f", candis.getName(), candis.getVotes(), (double) candis.getVotes());
//            System.out.println();
//        }

        System.out.println(newCandi + " has joined the election with " + newVotes + " votes.");
        finalOutput(array2);

    }

    // Finding a candidate and adding another before said candidate
    public static void candiOverlapInsertion(Candidate[] array, String oldCandi, String newCandi, int newVotes) {
        String bottomCandiName = array[array.length - 1].getName(); // logs bottom candidate name
        int bottomCandiVotes = array[array.length - 1].getVotes(); // logs bottom candidate votes

        // Creates a second array with 1 more slot
        System.arraycopy(array, 0, array3, 0, array.length); // copies the array leaving the last slot still open

        array3[array.length] = new Candidate(bottomCandiName, bottomCandiVotes); // fills the last slot with the last member that would have been erased from the
                                                                                 // board
        int location = 0;
        for (Candidate candis : array2) {
            if (candis.getName().equals(oldCandi)) {
                break;
            } else {
                location++;
            }
        }

        for (int index = array3.length - 1; index > location; index--) { // goes through and makes room for new candidate by moving needed people down a
                                                                         // spot
            array3[index] = array2[index - 1];
        }
        array3[location] = new Candidate(newCandi, newVotes); // adds the new candidate in the designated spot
        // debug
//        for (Candidate candis : array) {
//            System.out.printf("%-20s %-20s %-20.2f", candis.getName(), candis.getVotes(), (double) candis.getVotes());
//            System.out.println();
//        }
        System.out.println(newCandi + " has joined the election with " + newVotes + " votes.");
        finalOutput(array3);
    }

    public static void candiSelectRemoval(Candidate[] array, int pos) {
        System.out.println(array[pos].getName() + " has been removed from the election. Leaving " + array[pos].getVotes() + " votes nullified.");
        array[pos].setName(null);
        array[pos].setVotes(0);

        finalOutput(array);
    }

    public static void candiSearchRemoval(Candidate[] array, String candiName) {
        int pos = 0;
        for (Candidate candis : array) {
            try {
                if (candis.getName().contentEquals(candiName)) {
                    break;
                } else {
                    pos++;
                }
            } catch (NullPointerException e) {
                pos++;
            }
        }
        System.out.println(candiName + " has been removed from the election. Leaving " + array[pos].getVotes() + " votes nullified.");
        array[pos].setName(null);
        array[pos].setVotes(0);
        finalOutput(array);

    }

    public static void main(String[] args) {

        Candidate[] candiBois = {
                new Candidate("Gabriel Iglesias", (int) (Math.random() * 1000)),
                new Candidate("Jerry Trainor", (int) (Math.random() * 1000)),
                new Candidate("Cheeto Face", (int) (Math.random() * 1000)),
                new Candidate("Keanu Reeves", (int) (Math.random() * 1000)),
                new Candidate("Jack Black", (int) (Math.random() * 1000))
        };

        candiRunners(candiBois);
        System.out.println();
        finalOutput(candiBois);
        System.out.println();

//        voteSwap(candiBois, "Jerry Trainor", 1000);
//        candiSwap(candiBois, "Jerry Trainor", "Napoleon Dynamite");
//        fullCandiSwap(candiBois, "Jerry Trainor", "Napoleon Dynamite", 1000);

        candiInsertion(candiBois, 2, "Napoleon Dynamite", 1000);
        System.out.println();

        candiOverlapInsertion(array2, "Jack Black", "Daft Punk", 1030);
        System.out.println();

        candiSelectRemoval(array2, 2);
        System.out.println();

        candiSearchRemoval(array2, "Jack Black");
        System.out.println();

    }
}
