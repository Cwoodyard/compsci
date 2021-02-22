/**
 * @purpose An election tester based solely on Arrays
 *
 * @author  Cole Woodyard
 * 
 * @version 2/18/2021
 */
public class ElectionTesterV1 {

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

    public static void main(String[] args) {

        Candidate[] candiBois = {
                new Candidate("Gabriel Iglesias", (int) (Math.random() * 1000)),
                new Candidate("Jerry Trainor", (int) (Math.random() * 1000)),
                new Candidate("Cheeto Face", (int) (Math.random() * 1000)),
                new Candidate("Keanu Reeves", (int) (Math.random() * 1000)),
                new Candidate("Jack Black", (int) (Math.random() * 1000))
        };
        candiRunners(candiBois);
        finalOutput(candiBois);
//        System.out.println("Debug: " + candVotes5);

    }
}
