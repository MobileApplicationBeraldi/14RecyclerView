package macc.example.com.mymovies;

import android.app.Activity;
import android.util.Log;
import android.view.View;

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
    static public void initializeAsync(final MovieAdapter movieAdapter, final Activity activity){

        movies.clear();
        new Thread((new Runnable(){
            @Override
            public void run() {
                for(int i=0;i<100;i++){
                    for (int j=0;j<10000000;j++);
                    Movie movie = new Movie("Il Signore degli Anelli",""+i,"2000",i);//String title, String description, String releaseDate, int rating
                    movies.add(movie);
                    Log.i("INFO",""+i);
                }
                activity.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        activity.findViewById(R.id.progressBar).setVisibility(View.GONE);
                        movieAdapter.notifyDataSetChanged();
                    }
                });
            }
        })).start();
    }
    static public int size(){
        return movies.size();
    }

    static public Movie getItem(int i){
        return movies.get(i);
    }
}
