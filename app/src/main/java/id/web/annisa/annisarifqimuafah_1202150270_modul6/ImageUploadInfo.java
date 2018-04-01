package id.web.annisa.annisarifqimuafah_1202150270_modul6;

/**
 * Created by Ryan Ar-rofiq on 01/04/2018.
 */
public class ImageUploadInfo {
    public String imageName;

    public String imageURL;

    public ImageUploadInfo() {

    }

    public ImageUploadInfo(String name, String url) {

        this.imageName = name;
        this.imageURL= url;
    }

    public String getImageName() {
        return imageName;
    }

    public String getImageURL() {
        return imageURL;
    }

}
