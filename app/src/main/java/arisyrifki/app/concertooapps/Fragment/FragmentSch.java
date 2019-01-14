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

import arisyrifki.app.concertooapps.Adapter.AdapterSch;
import arisyrifki.app.concertooapps.Model.ModelSch;
import arisyrifki.app.concertooapps.R;

/**
 * Created by rfkchrl on 1/13/2019.
 */

public class FragmentSch extends Fragment {

    public List<ModelSch> sch;
    private RecyclerView recyclerView ;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_sch, container, false);
    }

    private void  schColl() {
        //liat schedule
        sch = new ArrayList<>();

        //data yang akan dikeluarkan sesuai dengan susunan pada model.
        sch.add(new ModelSch("Imsak", "4.25 AM","10 mei 2019",R.drawable.ic_android_black_24dp));

        AdapterSch adapter = new AdapterSch(sch);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.recylcerSch); //fragmentschedule

        LinearLayoutManager linear = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(linear);

        schColl();
    }
}
