package net.tunify.tunify.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import net.tunify.tunify.DetailActivity;
import net.tunify.tunify.MainActivity;
import net.tunify.tunify.R;
import net.tunify.tunify.model.MusicList;

import java.util.List;

/**
 * Created by Pandika on 3/31/2018.
 */

public class MusicListAdapter extends RecyclerView.Adapter<MusicListAdapter.ViewHolder>{

    private List<MusicList> musicLists; //define list
    private Context context;

    //contructor
    public MusicListAdapter(List<MusicList> musicLists, Context context) {
        this.musicLists = musicLists;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.music_list_item, parent, false);

        return new ViewHolder(v);
    }

    //Bind data from viewholder
    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        final MusicList musicList = musicLists.get(position);

        holder.tvJudulLagu.setText(musicList.getTitle());
        holder.tvSinger.setText(musicList.getSinger());
        holder.tvNum.setText(musicList.getNum());
        holder.mMusicCover.setImageResource(musicList.getCoverId());
        holder.mChartSong.setImageResource(musicList.getChartId());

        holder.mItemMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DetailActivity.class);
                DetailActivity.start(holder.itemView.getContext(), musicList);
            }
        });

    }

    @Override
    public int getItemCount() {
        return musicLists.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView tvJudulLagu;
        public TextView tvSinger;
        public TextView tvNum;
        ImageView mMusicCover;
        ImageView mChartSong;
        LinearLayout mItemMusic;

        //constructor
        public ViewHolder(View itemView) {
            super(itemView);

            tvJudulLagu = (TextView) itemView.findViewById(R.id.tv_judul_lagu);
            tvSinger    = (TextView) itemView.findViewById(R.id.tv_singer);
            tvNum       = (TextView) itemView.findViewById(R.id.tv_num);
            mItemMusic = itemView.findViewById(R.id.lin_item_music);
            mMusicCover = itemView.findViewById(R.id.iv_music);
            mChartSong = itemView.findViewById(R.id.iv_caret);
        }
    }
}
