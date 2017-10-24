package macc.example.com.mymovies;

import android.graphics.drawable.Drawable;
import android.os.Parcelable;

/**
 * Created by roberto on 24.10.2017.
 */

public class Movie{
    String title;
    String decription;
    String releaseDate;
    int rating;
    Drawable icon;

    Movie(String title, String description, String releaseDate, int rating) {
        this.title = title;
        this.decription = description;
        this.releaseDate = releaseDate;
        this.rating=rating;
        this.icon=null;
    }

    String getTitle(){
        return title;
    }

    String getDescription(){
        return decription;
    }
}
