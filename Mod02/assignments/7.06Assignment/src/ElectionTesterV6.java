import java.util.ArrayList;

/**
 * @purpose An election tester based solely on ArrayLists
 *
 * @author  Cole Woodyard
 * 
 * @version 2/24/2021
 */
public class ElectionTesterV6 {
    public static void candiRunners(ArrayList<Candidate> candiBois) {
        for (Candidate candis : candiBois) {
            System.out.println(candis);
        }
    }

    public static void finalOutput(ArrayList<Candidate> candiBois) {
        int votes = candiVotes(candiBois);

        System.out.println();
        System.out.println("Welcome to the Actor Elections!");
        System.out.printf("%-20s %-20s %-20s", "Candidate", "Votes Received", "% of Total Votes");
        System.out.println();
        System.out.println("===========================================================");

        for (Candidate candis : candiBois) {
            System.out.printf("%-20s %-20s %-20.2f", candis.getName(), candis.getVotes(), (double) candis.getVotes() / votes * 100);
            System.out.println();
        }
        System.out.println();
        System.out.println("The Total number of votes is: " + votes);
    }

    public static int candiVotes(ArrayList<Candidate> candiBois) {
        int totalVotes = 0;
        for (Candidate candis : candiBois) {
            totalVotes += candis.getVotes();
        }
        return totalVotes;
    }

    // Change name of Election Candidate
    public static void candiSwap(ArrayList<Candidate> candiBois, String oldCandi, String newCandi) {
        for (Candidate candis : candiBois) {
            if (candis.getName().equals(oldCandi)) {
                System.out.println(oldCandi + " has been replaced with " + newCandi);
                candis.setName(newCandi);

            }
        }

    }

    // Change votes of Election Candidate
    public static void voteSwap(ArrayList<Candidate> candiBois, String name, int newVotes) {
        for (Candidate candis : candiBois) {
            if (candis.getName().equals(name)) {
                System.out.println(name + "'s votes have changed to: " + newVotes);
                candis.setVotes(newVotes);
            }
        }
    }

    // Change name and votes of Election Candidate
    public static void fullCandiSwap(ArrayList<Candidate> candiBois, String oldCandi, String newCandi, int newVotes) {
        for (Candidate candis : candiBois) {
            if (candis.getName().equals(oldCandi)) {
                System.out.println(oldCandi + " has been replaced with " + newCandi);
                candis.setName(newCandi);
                System.out.println(newCandi + " enters in with " + newVotes + " votes!");
                candis.setVotes(newVotes);

            }
        }
    }

    // Inserting data into a new space
    public static void candiInsertion(ArrayList<Candidate> array, int location, String newCandi, int newVotes) {
        array.add(location, new Candidate(newCandi, newVotes));
    }

    // Finding a candidate and adding another before said candidate
    public static void candiOverlapInsertion(ArrayList<Candidate> array, String oldCandi, String newCandi, int newVotes) {
        int location = 0;
        for (Candidate candis : array) {
            if (candis.getName().equals(oldCandi)) {
                break;
            } else {
                location++;
            }
        }
        array.add(location, new Candidate(newCandi, newVotes));

    }

    public static void main(String[] args) {

        ArrayList<Candidate> candiBois = new ArrayList<Candidate>();
        candiBois.add(new Candidate("Gabriel Iglesias", (int) (Math.random() * 1000)));
        candiBois.add(new Candidate("Jerry Trainor", (int) (Math.random() * 1000)));
        candiBois.add(new Candidate("Cheeto Face", (int) (Math.random() * 1000)));
        candiBois.add(new Candidate("Keanu Reeves", (int) (Math.random() * 1000)));
        candiBois.add(new Candidate("Jack Black", (int) (Math.random() * 1000)));

        candiRunners(candiBois);
        System.out.println();

        voteSwap(candiBois, "Jerry Trainor", 1000);
        candiSwap(candiBois, "Jerry Trainor", "Napoleon Dynamite");
        fullCandiSwap(candiBois, "Jerry Trainor", "Napoleon Dynamite", 1000);

        finalOutput(candiBois);

        candiInsertion(candiBois, 2, "Ben Shiperio", 1000);

        finalOutput(candiBois);

        candiOverlapInsertion(candiBois, "Cheeto Face", "JUAN", 1000);

        finalOutput(candiBois);
        // System.out.println("Debug: " + candVotes5);

    }
}
