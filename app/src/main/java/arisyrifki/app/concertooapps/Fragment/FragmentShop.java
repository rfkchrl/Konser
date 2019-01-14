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

import arisyrifki.app.concertooapps.Adapter.AdapterShop;
import arisyrifki.app.concertooapps.Model.ModelShop;
import arisyrifki.app.concertooapps.R;

/**
 * Created by rfkchrl on 1/14/2019.
 */

public class FragmentShop extends Fragment {

    public List<ModelShop> shop = new ArrayList<>();
    private RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_shop, container, false);
    }

    private void  shopColl() {
        shop = new ArrayList<>();
        shop.add(new ModelShop("Imsak"));

        AdapterShop adapter = new AdapterShop(shop);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.recylcerShop); //home

        LinearLayoutManager linear = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(linear);

        shopColl();
    }
}
