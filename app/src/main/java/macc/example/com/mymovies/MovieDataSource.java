package macc.example.com.mymovies;

import java.util.ArrayList;


/**
 * Created by roberto on 24.10.2017.
 */

public class MovieDataSource {
    static private ArrayList<Movie> movies = new ArrayList<Movie>();
    static public void initialize(){
        for(int i=0;i<100;i++){
            Movie movie = new Movie("Il signore degli anelli","Bel film","2000",i);//String title, String description, String releaseDate, int rating
            movies.add(movie);
        }
    }
    static public int size(){
        return movies.size();
    }

    static public Movie getItem(int i){
        return movies.get(i);
    }
}
