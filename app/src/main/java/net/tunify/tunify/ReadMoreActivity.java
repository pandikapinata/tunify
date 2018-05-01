package net.tunify.tunify;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import net.tunify.tunify.model.MusicList;

public class ReadMoreActivity extends AppCompatActivity {
    public static final String EXTRA_MUSIC_MORE = "music_more";
    public static final String EXTRA_MUSIC_TITLE = "music_title";

    String title;
    String more;

    TextView mReadMore;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read_more);

        more = getIntent().getStringExtra(EXTRA_MUSIC_MORE);
        title = getIntent().getStringExtra(EXTRA_MUSIC_TITLE);

        getSupportActionBar().setTitle(title);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mReadMore = findViewById(R.id.tv_more);
        mReadMore.setText(more);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home){
            onBackPressed(); return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
