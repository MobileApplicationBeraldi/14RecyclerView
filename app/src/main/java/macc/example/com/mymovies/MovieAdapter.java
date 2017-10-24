package macc.example.com.mymovies;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by roberto on 24.10.2017.
 */

public class MovieAdapter extends RecyclerView.Adapter<MovieViewHolder> {

    MovieAdapter(){
    }

    @Override
    public MovieViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater  =
                (LayoutInflater)
                        parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View v = inflater.inflate(R.layout.movie,parent,false);
        MovieViewHolder vh = new MovieViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(MovieViewHolder holder, int position) {
            Movie movie = MovieDataSource.getItem(position);
            holder.titleTextView.setText(movie.getTitle());
            holder.descriptionTextView.setText(movie.getDescription());
    }

    @Override
    public int getItemCount() {
        return MovieDataSource.size();
    }
}
