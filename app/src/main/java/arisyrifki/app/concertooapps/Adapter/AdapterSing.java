package arisyrifki.app.concertooapps.Adapter;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import arisyrifki.app.concertooapps.DetailSing;
import arisyrifki.app.concertooapps.Holder.HolderSing;
import arisyrifki.app.concertooapps.Model.ModelSing;
import arisyrifki.app.concertooapps.R;

/**
 * Created by rfkchrl on 1/14/2019.
 */

public class AdapterSing extends RecyclerView.Adapter<HolderSing> {

    private List<ModelSing> sing;

    public AdapterSing(List<ModelSing> sing) {
        this.sing = sing;
    }

    @Override
    public HolderSing onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_sing,parent,false);
        final HolderSing holderSing = new HolderSing(view);

        holderSing.itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int position = holderSing.getAdapterPosition();
                Intent intent = new Intent(holderSing.itemView.getContext(), DetailSing.class);
                intent.putExtra("id_sing", sing.get(position));

                holderSing.itemView.getContext().startActivity(intent);

            }
        });
        return holderSing;

    }

    @Override
    public void onBindViewHolder(HolderSing holder, int position) {
        holder.singTitle.setText(sing.get(position).getSingTitle());

        //holder.schSubtitle.setText(sch.get(position).getSchSubtitle());
        //holder.schTanggal.setText(sch.get(position).getSchTanggal());

        //holder.imgSch.setImageResource(sch.get(position).getImgSch());

    }

    @Override
    public int getItemCount() {
        return sing.size();
    }
}
