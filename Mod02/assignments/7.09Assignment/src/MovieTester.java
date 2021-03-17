import java.util.ArrayList;

/**
 * @purpose To demonstrate how to use the insertion sort algorithm.
 * 
 * @author  Cole Woodyard
 * 
 * @version 02/8/2021
 */
public class MovieTester {

    public static void movieLister(ArrayList<Movie> movie) {
        System.out.println("\t\t\tList of Movies");
        for (Movie titles : movie) {
            System.out.println(titles);

        }
        System.out.println();
    }

    public static void sortTitle(ArrayList<Movie> movie, int param) {
        System.out.println("Sorting Initialized: " + param);

        switch (param) {
            case (1):
                System.out.println("Sorting by Ascending order:");
                for (int i = 0; i < movie.size(); i++) {
                    for (int j = i + 1; j < movie.size(); j++) {
                        // compare list.get(i) and list.get(j)w
//                        System.out.println(movie.get(i).getTitle().compareTo(movie.get(j).getTitle()));
                        if (movie.get(i).getTitle().compareTo(movie.get(j).getTitle()) > 0) {
//                            System.out.println("Before: " + movie);
                            movie.add(i, movie.get(j));
                            movie.remove(j + 1);
//                            System.out.println("After: " + movie);
                        }
                    }
                }
                break;
            case (2):

                System.out.println("Sorting by Decending order:");
                int j = 0;
                ArrayList<Movie> decender = new ArrayList<Movie>();
                for (int i = 0; i < movie.size(); i++) {
                    for (Movie titles : movie) {
                        try {
                            if (titles.getTitle().compareTo(movie.get(j).getTitle()) >= 0) { // if title i is greater than title j (the one after it)
                                // place title i after title j and delete initial title i

                                decender.add(i, titles);
                                j++;
                            }
                        } catch (IndexOutOfBoundsException e) {
                            break;
                        }

                    }
                }
                movie.clear();
                movie.addAll(decender);
                break;
            default:
                System.out.println("You have not entered a correct value. Please enter: ");
                System.out.println("1 for Acending order");
                System.out.println("2 for Decending order");
                break;
        }

        movieLister(movie);

    }

    public static void sortYear(ArrayList<Movie> movie, int param) {
        System.out.println("Sorting Initialized: " + param);

        switch (param) {
            case (1):
                System.out.println("Sorting by Ascending order:");
                for (int i = 0; i < movie.size(); i++) {
                    for (int j = i + 1; j < movie.size(); j++) {
                        // compare list.get(i) and list.get(j)
//                        System.out.println(movie.get(i).getTitle().compareTo(movie.get(j).getTitle()));

                        if (movie.get(i).getYear() > movie.get(j).getYear()) {
//                            System.out.println("Before: " + movie);
                            movie.add(i, movie.get(j));
                            movie.remove(j + 1);
//                            System.out.println("After: " + movie);
                        }
                    }
                }
                break;
            case (2):

                System.out.println("Sorting by Decending order:");
                int j = 0;
                ArrayList<Movie> decender = new ArrayList<Movie>();
                for (int i = 0; i < movie.size(); i++) {
                    for (Movie titles : movie) {
                        try {
                            if (movie.get(i).getYear() <= movie.get(j).getYear()) { // if title i is greater than title j (the one after it)
                                // place title i after title j and delete initial title i

                                decender.add(i, titles);
                                j++;
                            }
                        } catch (IndexOutOfBoundsException e) {
                            break;
                        }

                    }
                }
                movie.clear();
                movie.addAll(decender);
                break;
            default:
                System.out.println("You have not entered a correct value. Please enter: ");
                System.out.println("1 for Acending order");
                System.out.println("2 for Decending order");
                break;
        }

        movieLister(movie);

    }

    public static void sortStudio(ArrayList<Movie> movie, int param) {
        System.out.println("Sorting Initialized: " + param);

        switch (param) {
            case (1):
                System.out.println("Sorting by Ascending order:");
                for (int i = 0; i < movie.size(); i++) {
                    for (int j = i + 1; j < movie.size(); j++) {
                        // compare list.get(i) and list.get(j)
//                        System.out.println(movie.get(i).getTitle().compareTo(movie.get(j).getTitle()));
                        if (movie.get(i).getStudio().compareTo(movie.get(j).getStudio()) > 0) {
//                            System.out.println("Before: " + movie);
                            movie.add(i, movie.get(j));
                            movie.remove(j + 1);
//                            System.out.println("After: " + movie);
                        }
                    }
                }
                break;
            case (2):

                System.out.println("Sorting by Decending order:");
                int j = 0;
                ArrayList<Movie> decender = new ArrayList<Movie>();
                for (int i = 0; i < movie.size(); i++) {
                    for (Movie titles : movie) {
                        try {
                            if (titles.getStudio().compareTo(movie.get(j).getStudio()) >= 0) { // if title i is greater than title j (the one after it)
                                // place title i after title j and delete initial title i

                                decender.add(i, titles);
                                j++;
                            }
                        } catch (IndexOutOfBoundsException e) {
                            break;
                        }

                    }
                }
                movie.clear();
                movie.addAll(decender);
                break;
            default:
                System.out.println("You have not entered a correct value. Please enter: ");
                System.out.println("1 for Acending order");
                System.out.println("2 for Decending order");
                break;
        }

        movieLister(movie);

    }

    public static void main(String[] args) {
        ArrayList<Movie> movies = new ArrayList<Movie>();
        movies.add(new Movie("Meet the Robinsons", 2007, "Disney"));
        movies.add(new Movie("Grown Ups 2", 2013, "Happy Madison Productions"));
        movies.add(new Movie("Pacific Rim", 2013, "Universal Pictures"));
        movies.add(new Movie("Enders Game", 2013, "Lionsgate"));
        movies.add(new Movie("Shazam!", 2019, "New Line Cinema"));
        movies.add(new Movie("Megamind", 2010, "Dreamworks Animation"));
        movies.add(new Movie("Avatar", 2009, "Twentieth Century Fox"));
        movies.add(new Movie("Ready Player One", 2018, "Warner Bros"));
        movies.add(new Movie("The Incredibles", 2004, "Pixar"));
        movies.add(new Movie("Life of Pi", 2012, "Fox 2000 Pictures"));

        System.out.println("Base List");
        movieLister(movies);

        System.out.println("Sorting by Title");
        sortTitle(movies, 1);
        sortTitle(movies, 2);

        System.out.println("Sorting by Year");
        sortYear(movies, 1);
        sortYear(movies, 2);

        System.out.println("Sorting by Studio");
        sortStudio(movies, 1);
        sortStudio(movies, 2);
    }
}