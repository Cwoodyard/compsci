/**
 * @purpose An election tester based solely on Arrays
 *
 * @author  Cole Woodyard
 * 
 * @version 2/21/2021
 */
public class ElectionTesterV3 {

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
            System.out.printf("%-20s %-20s %-20.2f", candis.getName(), candis.getVotes(), (double) candis.getVotes() / votes * 100);
            System.out.println();
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

        voteSwap(candiBois, "Jerry Trainor", 1000);
        candiSwap(candiBois, "Jerry Trainor", "Napoleon Dynamite");
        fullCandiSwap(candiBois, "Jerry Trainor", "Napoleon Dynamite", 1000);

        finalOutput(candiBois);

    }
}
