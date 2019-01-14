package arisyrifki.app.concertooapps.Model;

import java.io.Serializable;

/**
 * Created by rfkchrl on 1/14/2019.
 */

public class ModelShop implements Serializable {
    private String shopTitle;

    public String getShopTitle() {
        return shopTitle;
    }

    public ModelShop(String shopTitle) {
        this.shopTitle = shopTitle;
    }
}
