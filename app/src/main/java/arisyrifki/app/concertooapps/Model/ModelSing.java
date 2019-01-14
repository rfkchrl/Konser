package arisyrifki.app.concertooapps.Model;

import java.io.Serializable;

/**
 * Created by rfkchrl on 1/14/2019.
 */

public class ModelSing implements Serializable{

    private String singTitle;

    public String getSingTitle() {
        return singTitle;
    }

    public ModelSing(String singTitle) {
        this.singTitle = singTitle;
    }
}
