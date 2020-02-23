package com.example.android.miwok;

public class Word {

    /**
     * Default translation for the word
     */

    private String mDefaultTranslation;

    /**
     * Miwok translation for the word
     */

    private String mMiwokTranslation;

    /**
     * Image for the word
     */

    private int mIMageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Audio for the word
     */

    private int mAudioResourceId;

    /**
     * For representing no image state
     */

    private static final int NO_IMAGE_PROVIDED = -1;

    // constructor for view containing no image

    Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    // constructor for view containing image

    Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mIMageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    // for checking if a view has image or not

    boolean hasImage() {
        return mIMageResourceId != NO_IMAGE_PROVIDED;
    }

    // functions for getting data

    String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    int getImageResourceID() {
        return mIMageResourceId;
    }

    int getAudioResourceId() {
        return mAudioResourceId;
    }

    /**
     * Returns the string representation of the {@link Word} object.
     * for printing current state of an object to thr logs
     */

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