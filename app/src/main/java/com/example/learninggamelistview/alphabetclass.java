package com.example.learninggamelistview;

public class alphabetclass {
    String alphabetName;
    String smallName;
    String alphabetStandsfor;

    public alphabetclass(String alphabetName, String smallName, String alphabetStandsfor) {
        this.alphabetName = alphabetName;
        this.smallName = smallName;
        this.alphabetStandsfor = alphabetStandsfor;
    }

    public alphabetclass(String alphabetName, String smallName) {
        this.alphabetName = alphabetName;
        this.smallName = smallName;
        this.alphabetStandsfor = alphabetStandsfor;
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
}
