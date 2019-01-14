package arisyrifki.app.concertooapps.Holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

import arisyrifki.app.concertooapps.R;

/**
 * Created by rfkchrl on 1/15/2019.
 */

public class HolderVideo extends RecyclerView.ViewHolder {

    public  WebView videoWeb;

    public HolderVideo(View itemView) {
        super(itemView);

        videoWeb = (WebView) itemView.findViewById(R.id.videoWebView);

        videoWeb.getSettings().setJavaScriptEnabled(true);
        videoWeb.setWebChromeClient(new WebChromeClient() {
        });
    }
}