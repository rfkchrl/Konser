package arisyrifki.app.concertooapps.Model;

import java.io.Serializable;

/**
 * Created by rfkchrl on 1/15/2019.
 */

public class ModelVideo implements Serializable{

    private String videoUrl;


    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public ModelVideo(String videoUrl) {
        this.videoUrl = videoUrl;
    }
}
