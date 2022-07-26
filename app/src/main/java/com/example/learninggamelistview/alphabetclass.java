package com.example.learninggamelistview;

public class alphabetclass {
    String alphabetName;
    String smallName;
    String alphabetStandsfor;
    String picturename;
    int image;

    public alphabetclass(String alphabetName, String smallName, String alphabetStandsfor,String picturename,int image;) {
        this.alphabetName = alphabetName;
        this.smallName = smallName;
        this.alphabetStandsfor = alphabetStandsfor;
        this.picturename=picturename;
        this.image=image;
    }

    public alphabetclass(String alphabetName, String smallName,String picturename,int image;) {
        this.alphabetName = alphabetName;
        this.smallName = smallName;
        this.alphabetStandsfor = alphabetStandsfor;
        this.picturename=picturename;
        this.image=image;


    }


    public String getAlphabetName() {
        return alphabetName;
    }

    public String getSmallName() {
        return smallName;
    }

    public String getAlphabetStandsfor() {
        return alphabetStandsfor;
    }
    public String getPicturename(){return picturename;}

    public int getImage() {
        return 0;
    }
}
