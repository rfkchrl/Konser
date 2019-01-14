package arisyrifki.app.concertooapps.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import arisyrifki.app.concertooapps.Holder.HolderVideo;
import arisyrifki.app.concertooapps.Model.ModelVideo;
import arisyrifki.app.concertooapps.R;

/**
 * Created by rfkchrl on 1/15/2019.
 */

public class AdapterVideo extends RecyclerView.Adapter<HolderVideo> {

    private List<ModelVideo> youtubeVideoList;

    public AdapterVideo(List<ModelVideo> youtubeVideoList) {
        this.youtubeVideoList = youtubeVideoList;
    }

    @Override
    public HolderVideo onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from( parent.getContext()).inflate(R.layout.item_sing_video, parent, false);

        return new HolderVideo(view);

    }

    @Override
    public void onBindViewHolder(HolderVideo holder, int position) {
        holder.videoWeb.loadData( youtubeVideoList.get(position).getVideoUrl(), "text/html" , "utf-8" );


    }

    @Override
    public int getItemCount() {
        return youtubeVideoList.size();
    }

}
