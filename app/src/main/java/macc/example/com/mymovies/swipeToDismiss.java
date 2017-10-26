package macc.example.com.mymovies;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;

/**
 * Created by roberto on 26.10.2017.
 */

public class swipeToDismiss {

    static ItemTouchHelper.SimpleCallback getSwipe(final MovieAdapter movieAdapter){
        return new ItemTouchHelper.SimpleCallback(ItemTouchHelper.UP | ItemTouchHelper.DOWN,
                ItemTouchHelper.LEFT){
            @Override
            public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {
                return false;
            }

            @Override
            public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction) {
                movieAdapter.notifyItemRemoved(viewHolder.getAdapterPosition());
                //to do Remove item from the DataSource
            }
        };
    };
}
