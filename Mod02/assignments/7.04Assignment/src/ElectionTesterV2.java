import java.util.ArrayList;

/**
 * @purpose An election tester based solely on ArrayLists
 *
 * @author  Cole Woodyard
 * 
 * @version 2/18/2021
 */
public class ElectionTesterV2 {
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

    public static void main(String[] args) {

        ArrayList<Candidate> candiBois = new ArrayList<Candidate>();
        candiBois.add(new Candidate("Gabriel Iglesias", (int) (Math.random() * 1000)));
        candiBois.add(new Candidate("Jerry Trainor", (int) (Math.random() * 1000)));
        candiBois.add(new Candidate("Cheeto Face", (int) (Math.random() * 1000)));
        candiBois.add(new Candidate("Keanu Reeves", (int) (Math.random() * 1000)));
        candiBois.add(new Candidate("Jack Black", (int) (Math.random() * 1000)));
        candiRunners(candiBois);
        finalOutput(candiBois);
//        System.out.println("Debug: " + candVotes5);

    }
}
