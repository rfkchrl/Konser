package arisyrifki.app.concertooapps;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import arisyrifki.app.concertooapps.Adapter.AdapterContainer;
import arisyrifki.app.concertooapps.Fragment.FragmentSch;
import arisyrifki.app.concertooapps.Fragment.FragmentShop;
import arisyrifki.app.concertooapps.Fragment.FragmentSing;

public class MainActivity extends AppCompatActivity {

    public AdapterContainer adapterContainer;
    private ViewPager viewPager;
    private Button btnSch, btnSing, btnShop;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //casting object(view) untuk view pager
        viewPager = (ViewPager) findViewById(R.id.view_pager_main);

        //casting object yang ada pada item home di layout activity main
        btnSch = (Button) findViewById(R.id.btn_sch);
        btnSing = (Button) findViewById(R.id.btn_sing);
        btnShop= (Button) findViewById(R.id.btn_shop);


        setContainerPrepared(); //untuk paggil method prepaireing containeer
        onButtonClicked();
    }

    private void setContainerPrepared() {

        //casting fragment
        adapterContainer = new AdapterContainer(getSupportFragmentManager());
        adapterContainer.addFragment(new FragmentSch(), getString(R.string.btn_Sch));
        adapterContainer.addFragment(new FragmentSing(), getString(R.string.btn_Sing));
        adapterContainer.addFragment(new FragmentShop(), getString(R.string.btn_Shop));

        viewPager.setAdapter(adapterContainer);
    }

    private void onButtonClicked(){
        //Ini untuk handle clik padabutton home
        btnSch.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                viewPager.setCurrentItem(0);

            }
        });

        //Ini untuk handle clik padabutton doa
        btnSing.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                viewPager.setCurrentItem(1);
            }
        });

        //Ini untuk handle clik padabutton profile
        btnShop.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                viewPager.setCurrentItem(2);
            }
        });

    }
}
