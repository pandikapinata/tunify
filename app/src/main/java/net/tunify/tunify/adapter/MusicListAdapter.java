package net.tunify.tunify.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

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
    public void onBindViewHolder(ViewHolder holder, int position) {
        MusicList musicList = musicLists.get(position);

        holder.tvJudulLagu.setText(musicList.getJudul_lagu());
        holder.tvSinger.setText(musicList.getSinger());
        holder.tvNum.setText(musicList.getNum());

    }

    @Override
    public int getItemCount() {
        return musicLists.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView tvJudulLagu;
        public TextView tvSinger;
        public TextView tvNum;

        //constructor
        public ViewHolder(View itemView) {
            super(itemView);

            tvJudulLagu = (TextView) itemView.findViewById(R.id.tv_judul_lagu);
            tvSinger    = (TextView) itemView.findViewById(R.id.tv_singer);
            tvNum       = (TextView) itemView.findViewById(R.id.tv_num);
        }
    }
}
