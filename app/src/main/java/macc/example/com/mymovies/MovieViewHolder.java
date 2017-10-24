package macc.example.com.mymovies;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by roberto on 24.10.2017.
 */

public class MovieViewHolder extends RecyclerView.ViewHolder {

    TextView titleTextView;
    TextView descriptionTextView;
    public MovieViewHolder(View itemView) {
        super(itemView);
        titleTextView = (TextView) itemView.findViewById(R.id.title);
        descriptionTextView = (TextView) itemView.findViewById(R.id.description);
    }
}
