package net.tunify.tunify.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import net.tunify.tunify.DetailActivity;
import net.tunify.tunify.R;
import net.tunify.tunify.model.Album;
import net.tunify.tunify.model.MusicList;

import java.util.List;

public class AlbumMuicAdapter extends RecyclerView.Adapter<AlbumMuicAdapter.ViewHolder> {
    private List<MusicList> musicLists; //define list
    private Context context;

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.album_song_list, parent, false);

        return new ViewHolder(itemView);
    }

    public AlbumMuicAdapter(Context mContext, List<MusicList> musicLists) {
        this.musicLists = musicLists;
        this.context = mContext;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        final MusicList musicList = musicLists.get(position);

        holder.img.setImageResource(musicList.getCoverId());
        holder.title.setText(musicList.getTitle());
        holder.genre.setText(musicList.getGenre());

        holder.mSongs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DetailActivity.start(holder.itemView.getContext(), musicList);
            }
        });
    }

    @Override
    public int getItemCount() {
        return musicLists.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView title;
        TextView genre;
        LinearLayout mSongs;

        public ViewHolder(View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.song_img);
            title = itemView.findViewById(R.id.song_title);
            genre = itemView.findViewById(R.id.song_genre);
            mSongs = itemView.findViewById(R.id.lin_album_songs);
        }
    }
}
