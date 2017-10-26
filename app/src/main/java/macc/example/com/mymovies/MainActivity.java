package macc.example.com.mymovies;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private MovieAdapter movieAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        movieAdapter = new MovieAdapter();
        if (savedInstanceState==null){
            Log.i("INFO","Initializing Data Source...");
            MovieDataSource.initializeAsync(movieAdapter,this);
            //MovieDataSource.initialize();
            Log.i("INFO","Data Source Initialized...");
        }

        setContentView(R.layout.activity_main);
        //setContentView(R.layout.progress);
        RecyclerView rv = findViewById(R.id.rv);
        //rv.setAdapter(new MovieAdapter());
        rv.setAdapter(movieAdapter);
        LinearLayoutManager lm = new LinearLayoutManager(this);
        //GridLayoutManager gm = new GridLayoutManager(this,2,GridLayoutManager.VERTICAL,false);
       // lm.setOrientation(LinearLayoutManager.HORIZONTAL);
        rv.setLayoutManager(lm);

        ItemTouchHelper.SimpleCallback sitc = swipeToDismiss.getSwipe(movieAdapter);
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(sitc);
        itemTouchHelper.attachToRecyclerView(rv);

    }
}
