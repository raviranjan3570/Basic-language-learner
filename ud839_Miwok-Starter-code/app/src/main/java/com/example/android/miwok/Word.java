package com.example.android.miwok;

public class Word {
    /** Default translation for the word*/
    private String mDefaultTranslation;
    /** Miwok translation for the word*/
    private String mMiwokTranslation;

    private int mIMageResourceId = NO_IMAGE_PROVIDED;

    private int mAudioResourceId;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId){
        mDefaultTranslation= defaultTranslation;
        mMiwokTranslation= miwokTranslation;
        mIMageResourceId= imageResourceId;
        mAudioResourceId= audioResourceId;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResourceID() {return mIMageResourceId; }

    public boolean hasImage(){
        return mIMageResourceId != NO_IMAGE_PROVIDED;
    }

    public int getAudioResourceId() {
        return mAudioResourceId;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mIMageResourceId=" + mIMageResourceId +
                ", mAudioResourceId=" + mAudioResourceId +
                '}';
    }
}