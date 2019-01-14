package arisyrifki.app.concertooapps.Adapter;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import arisyrifki.app.concertooapps.DetailSch;
import arisyrifki.app.concertooapps.Holder.HolderSch;
import arisyrifki.app.concertooapps.Model.ModelSch;
import arisyrifki.app.concertooapps.R;

/**
 * Created by rfkchrl on 1/13/2019.
 */

public class AdapterSch extends RecyclerView.Adapter<HolderSch> {

    private List<ModelSch> sch;

    public AdapterSch(List<ModelSch> sch) {
        this.sch = sch;
    }


    @Override
    public HolderSch onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_sch,parent,false);
        final HolderSch holderSch = new HolderSch(view);

        holderSch.itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int position = holderSch.getAdapterPosition();
                Intent intent = new Intent(holderSch.itemView.getContext(), DetailSch.class);
                intent.putExtra("id_sch", sch.get(position));

                holderSch.itemView.getContext().startActivity(intent);

            }
        });
        return holderSch;

    }

    @Override
    public void onBindViewHolder(HolderSch holder, int position) {
        holder.schTitle.setText(sch.get(position).getSchTitle());
        holder.schSubtitle.setText(sch.get(position).getSchSubtitle());
        holder.schTanggal.setText(sch.get(position).getSchTanggal());

        holder.imgSch.setImageResource(sch.get(position).getImgSch());

    }

    @Override
    public int getItemCount() {
        return sch.size();
    }
}
