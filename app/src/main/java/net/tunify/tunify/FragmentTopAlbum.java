package net.tunify.tunify;

import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import net.tunify.tunify.adapter.AlbumsAdapter;
import net.tunify.tunify.model.Album;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pandika on 6/2/2018.
 */

public class FragmentTopAlbum extends Fragment {

    private RecyclerView recyclerView;
    private AlbumsAdapter adapter;
    private List<Album> albumList;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_top_album, container, false);

        recyclerView = (RecyclerView) rootView.findViewById(R.id.recycler_view);

        albumList = new ArrayList<>();
        adapter = new AlbumsAdapter(this.getActivity(), albumList);

        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(this.getActivity(), 2);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.addItemDecoration(new GridSpacingItemDecoration(2, dpToPx(10), true));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);

        prepareAlbums();
        return rootView;

    }

    private void prepareAlbums() {
        int[] covers = new int[]{
                R.drawable.album1,
                R.drawable.album2,
                R.drawable.album3,
                R.drawable.album4,
                R.drawable.album5,
                R.drawable.album6,
                R.drawable.album7,
                R.drawable.album8,
                R.drawable.album9,
                R.drawable.album10};

        Album a = new Album("Robinson", 13, covers[0], "Not Dark Yet");
        albumList.add(a);

        a = new Album("The Chainsomker", 8, covers[1], "Wide Open");
        albumList.add(a);

        a = new Album("Calumm Scott", 11, covers[2], "College");
        albumList.add(a);

        a = new Album("The Weeknd", 12, covers[3], "Roses");
        albumList.add(a);

        a = new Album("Taylor Swift", 14, covers[4], "Bouquet");
        albumList.add(a);

        a = new Album("Justin Bieber", 1, covers[5], "You Are The Reason");
        albumList.add(a);

        a = new Album("David Guetta", 11, covers[6], "Hold on Tight");
        albumList.add(a);

        a = new Album("Zedd", 14, covers[7], "Im Not Superman");
        albumList.add(a);

        a = new Album("Sabrina Carpenter", 11, covers[8], "Marry Me!");
        albumList.add(a);

        a = new Album("Marsmallow", 17, covers[9], "Love What You do");
        albumList.add(a);

        adapter.notifyDataSetChanged();
    }

    /**
     * RecyclerView item decoration - give equal margin around grid item
     */
    public class GridSpacingItemDecoration extends RecyclerView.ItemDecoration {

        private int spanCount;
        private int spacing;
        private boolean includeEdge;

        public GridSpacingItemDecoration(int spanCount, int spacing, boolean includeEdge) {
            this.spanCount = spanCount;
            this.spacing = spacing;
            this.includeEdge = includeEdge;
        }

        @Override
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
            int position = parent.getChildAdapterPosition(view); // item position
            int column = position % spanCount; // item column

            if (includeEdge) {
                outRect.left = spacing - column * spacing / spanCount; // spacing - column * ((1f / spanCount) * spacing)
                outRect.right = (column + 1) * spacing / spanCount; // (column + 1) * ((1f / spanCount) * spacing)

                if (position < spanCount) { // top edge
                    outRect.top = spacing;
                }
                outRect.bottom = spacing; // item bottom
            } else {
                outRect.left = column * spacing / spanCount; // column * ((1f / spanCount) * spacing)
                outRect.right = spacing - (column + 1) * spacing / spanCount; // spacing - (column + 1) * ((1f /    spanCount) * spacing)
                if (position >= spanCount) {
                    outRect.top = spacing; // item top
                }
            }
        }
    }

    /**
     * Converting dp to pixel
     */
    private int dpToPx(int dp) {
        Resources r = getResources();
        return Math.round(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, r.getDisplayMetrics()));
    }
}
