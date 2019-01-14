package arisyrifki.app.concertooapps.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rfkchrl on 1/13/2019.
 */

public class AdapterContainer extends FragmentStatePagerAdapter {

    public List<Fragment> fragments = new ArrayList<>();
    public List<String> labels = new ArrayList<>(); //bersifat opsionnnal

    public AdapterContainer(FragmentManager fm) {
        super(fm);
    }


    public void addFragment(Fragment fragment, String label){
        fragments.add(fragment);
        labels.add(label);
    }

    public String getLabel(int posision){ //jika digunakan harus ada ini
        return labels.get(posision);

    }
    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
}
