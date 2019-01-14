package arisyrifki.app.concertooapps.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import arisyrifki.app.concertooapps.Holder.HolderShop;
import arisyrifki.app.concertooapps.Model.ModelShop;
import arisyrifki.app.concertooapps.R;

/**
 * Created by rfkchrl on 1/14/2019.
 */

public class AdapterShop extends RecyclerView.Adapter<HolderShop> {

    private List<ModelShop> shop;

    public AdapterShop(List<ModelShop> shop) {
        this.shop = shop;
    }

    @Override
    public HolderShop onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_shop,parent,false);
        final HolderShop holderShop = new HolderShop(view);

        return holderShop;
    }

    @Override
    public void onBindViewHolder(HolderShop holder, int position) {
        holder.shopTitle.setText(shop.get(position).getShopTitle());

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
