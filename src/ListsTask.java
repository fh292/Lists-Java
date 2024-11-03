import java.util.List;
import java.util.ArrayList;
public class ListsTask {
    public static void main(String[] args) {

    //Create a List to hold your favorite songs/books/movies.
        List <String> shows = new ArrayList<>();

    //Add at least five songs/books/movies to your playlist.
        shows.add("Friends");
        shows.add("Prison Break");
        shows.add("Modern Family");
        shows.add("Brooklyn 99");
        shows.add("Gilmore Girls");
        System.out.println(shows);

    //Remove the third song from the playlist.
        shows.remove(2);
        System.out.println(shows);

    //Use a loop to display your playlist.
        for (String show : shows) {
            System.out.println(show);
        }
    }
}
