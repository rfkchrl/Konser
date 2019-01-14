package arisyrifki.app.concertooapps.Model;

import java.io.Serializable;

/**
 * Created by rfkchrl on 1/13/2019.
 */

public class ModelSch implements Serializable {

    private String schTitle, schSubtitle, schTanggal;
    private int imgSch;


    public String getSchTitle() {
        return schTitle;
    }

    public String getSchSubtitle() {
        return schSubtitle;
    }

    public String getSchTanggal() {
        return schTanggal;
    }

    public int getImgSch() {
        return imgSch;
    }

    public ModelSch(String schTitle, String schSubtitle, String schTanggal, int imgSch) {
        this.schTitle = schTitle;
        this.schSubtitle = schSubtitle;
        this.schTanggal = schTanggal;
        this.imgSch = imgSch;
    }
}
