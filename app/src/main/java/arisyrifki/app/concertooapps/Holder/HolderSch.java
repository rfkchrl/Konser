package arisyrifki.app.concertooapps.Holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import arisyrifki.app.concertooapps.R;

/**
 * Created by rfkchrl on 1/13/2019.
 */

public class HolderSch extends RecyclerView.ViewHolder {
    public TextView schTitle, schSubtitle, schTanggal;
    public ImageView imgSch;


    public HolderSch(View itemView) {
        super(itemView);

        schTitle = (TextView) itemView.findViewById(R.id.sch_title);
        schSubtitle = (TextView) itemView.findViewById(R.id.sch_subtitle);
        schTanggal = (TextView) itemView.findViewById(R.id.sch_tanggal);


        imgSch = (ImageView) itemView.findViewById(R.id.img_sch);
    }
}
