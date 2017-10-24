package macc.example.com.mymovies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState==null){
            Log.i("INFO","Initializing Data Source...");
            MovieDataSource.initialize();
            Log.i("INFO","Data Source Initialized...");
        }

        RecyclerView rv = findViewById(R.id.rv);
        rv.setAdapter(new MovieAdapter());
        LinearLayoutManager lm = new LinearLayoutManager(this);
        //GridLayoutManager gm = new GridLayoutManager(this,2,GridLayoutManager.VERTICAL,false);
        lm.setOrientation(LinearLayoutManager.HORIZONTAL);
        rv.setLayoutManager(lm);
    }
}
