package arisyrifki.app.concertooapps;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import arisyrifki.app.concertooapps.Model.ModelSch;

/**
 * Created by rfkchrl on 1/14/2019.
 */

public class DetailSch extends AppCompatActivity{

    public TextView schTitle, schSubtitle, schTanggal;
    public ImageView imgSch;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_sch);

        schTitle = (TextView) findViewById(R.id.sch_title);
        schSubtitle = (TextView) findViewById(R.id.sch_subtitle);
        schTanggal = (TextView) findViewById(R.id.sch_tanggal);
        imgSch = (ImageView) findViewById(R.id.img_sch);

        ModelSch sch = (ModelSch) getIntent().getSerializableExtra("id_sch");

        schTitle.setText(sch.getSchTitle());
        schSubtitle.setText(sch.getSchSubtitle());
        schTanggal.setText(sch.getSchTanggal());
        imgSch.setImageResource(sch.getImgSch());
    }
}
