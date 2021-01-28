package com.example.android.androidversion;

public class Version {
    private String mVersion_name;
    private String mVersion_number;
    private int mVersion_icon_ID;

    public Version(String version_name, String version_number, int version_icon_ID){
        mVersion_name = version_name;
        mVersion_number = version_number;
        mVersion_icon_ID = version_icon_ID;
    }

    public String getVersion_name() {
        return mVersion_name;
    }

    public String getVersion_number() {
        return mVersion_number;
    }

    public int getVersion_icon_ID() {
        return mVersion_icon_ID;
    }
}
