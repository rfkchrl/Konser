package arisyrifki.app.concertooapps.Holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import arisyrifki.app.concertooapps.R;

/**
 * Created by rfkchrl on 1/14/2019.
 */

public class HolderShop extends RecyclerView.ViewHolder {

    public TextView shopTitle;

    public HolderShop(View itemView) {
        super(itemView);

        shopTitle = (TextView) itemView.findViewById(R.id.shop_title);
    }


}
