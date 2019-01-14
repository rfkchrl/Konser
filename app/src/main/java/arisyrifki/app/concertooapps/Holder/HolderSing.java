package arisyrifki.app.concertooapps.Holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import arisyrifki.app.concertooapps.R;

/**
 * Created by rfkchrl on 1/14/2019.
 */

public class HolderSing extends RecyclerView.ViewHolder {

    public TextView singTitle;

    public HolderSing(View itemView) {
        super(itemView);

        singTitle = (TextView) itemView.findViewById(R.id.sing_title);
    }
}
