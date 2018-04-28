package com.example.level.visittata;

// {@link Attraction} represents one of the sights in the town of Tata, in Hungary, Europe.

public class Attraction {

    //This constant is for using as a default state  of the mImageResourceId variable.
    private static final int NO_IMAGE_PROVIDED = -1;

    //Name of the attraction.
    private int mAttractionNameResId;

    //Attraction details
    private int mAttractionDetailsResId;

    //Additional information to the tourist attraction.
    private int mAdditionalAttractionInfoResId;

    //Image for the tourist attraction.
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Create a new Attraction object.
     *
     * @param attractionNameResId           is the name of the tourist attraction
     * @param attractionDetailsResId        contains the details of the tourist attraction
     * @param additionalAttractionInfoResId is containing additional information about the tourist
     *                                      attraction, e.g. address, opening hours, contact info
     * @param imageResourceId               is a picture of the tourist attraction
     */
    public Attraction(int attractionNameResId, int attractionDetailsResId, int additionalAttractionInfoResId,
                      int imageResourceId) {

        mAttractionNameResId = attractionNameResId;

        mAttractionDetailsResId = attractionDetailsResId;

        mAdditionalAttractionInfoResId = additionalAttractionInfoResId;

        mImageResourceId = imageResourceId;
    }

    //Get the attraction name.
    public int getAttractionName() {
        return mAttractionNameResId;
    }

    //Get the attraction details.
    public int getAttractionDetails() {
        return mAttractionDetailsResId;
    }

    //Get the additional attraction information
    public int getAdditionalAttractionInfo() {
        return mAdditionalAttractionInfoResId;
    }

    //Get the image associated with the words.
    public int getImageResourceId() {
        return mImageResourceId;
    }

    //Returns whether or not there is an image for this word.
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}

