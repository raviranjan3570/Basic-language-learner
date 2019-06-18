package com.example.android.miwok;

public class Word {
    /** Default translation for the word*/
    private String mDefaultTranslation;
    /** Miwok translation for the word*/
    private String mMiwokTranslation;

    private int mResourceID = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    public Word(String defaultTranslation, String miwokTranslation, int resourceId){
        mDefaultTranslation= defaultTranslation;
        mMiwokTranslation= miwokTranslation;
        mResourceID= resourceId;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResourceID() {return mResourceID; }

    public boolean hasImage(){
        return mResourceID != NO_IMAGE_PROVIDED;
    }
}