package arisyrifki.app.concertooapps.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import arisyrifki.app.concertooapps.Adapter.AdapterSing;
import arisyrifki.app.concertooapps.Model.ModelSing;
import arisyrifki.app.concertooapps.R;

/**
 * Created by rfkchrl on 1/14/2019.
 */

public class FragmentSing extends Fragment {

    public List<ModelSing> sing = new ArrayList<>();
    private RecyclerView recyclerView ;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_sing, container, false);

    }
    private void  singColl() {
        sing = new ArrayList<>();
        sing.add(new ModelSing("Imsak"));

        AdapterSing adapter = new AdapterSing(sing);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.recylcerSing); //home

        LinearLayoutManager linear = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(linear);

        singColl();
    }
}
