package com.datmaster.constructor;

/**
 * Created by datmaster on 11/5/13.
 */
public class SpinnerModel {
    private  String itemDescription ="";
    private  String Image="";
    private int id = -1;

    /*********** Set Methods ******************/
    public void setItemDescription(String CompanyName)
    {
        this.itemDescription = CompanyName;
    }

    public void setImage(String Image)
    {
        this.Image = Image;
    }

    public void setId(int id) {
        this.id = id;
    }

    /*********** Get Methods ****************/
    public String getItemDescription()
    {
        return this.itemDescription;
    }

    public String getImage()
    {
        return this.Image;
    }

    public int getId() {
        return this.id;
    }
}
