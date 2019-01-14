package arisyrifki.app.concertooapps.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Vector;

import arisyrifki.app.concertooapps.Adapter.AdapterVideo;
import arisyrifki.app.concertooapps.Model.ModelVideo;
import arisyrifki.app.concertooapps.R;

/**
 * Created by rfkchrl on 1/14/2019.
 */

public class FragmentSing extends Fragment {

    private RecyclerView recyclerView ;

    //list model dari siyoutubevideos
    Vector<ModelVideo> youtubeVideos = new Vector<ModelVideo>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //melempar data singColl() ke fragment_sing yang berisi recyclerview
        return inflater.inflate(R.layout.fragment_sing,container,false);
    }
    private void  singColl() {

        //add sususan dari modelVideo
        youtubeVideos.add( new ModelVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/eWEF1Zrmdow\" frameborder=\"0\" allowfullscreen></iframe>") );
        youtubeVideos.add( new ModelVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/QK8mJJJvaes\" frameborder=\"0\" allowfullscreen></iframe>") );

        //youtubeVideos.add(new ModelSing("Imsak"));

        AdapterVideo adapter = new AdapterVideo(youtubeVideos);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //recycler yang berada pada fragment
        //casting recycler dan linearlayoutmanager
        recyclerView = view.findViewById(R.id.recylcerSing); //home

        LinearLayoutManager linear = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(linear);

        //panggil data diatas
        singColl();
    }
}