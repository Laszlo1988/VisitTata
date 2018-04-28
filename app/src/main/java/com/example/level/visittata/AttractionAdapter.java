package com.example.level.visittata;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/*
* {@link AttractionAdapter} is an {@link ArrayAdapter} that can provide the layout for each list
* based on a data source, which is a list of {@link Attraction} objects.
* */
public class AttractionAdapter extends ArrayAdapter<Attraction> {

    private int mColorResourceId;

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context         The current context. Used to inflate the layout file.
     * @param attractions     A List of Attraction objects to display in a list
     * @param colorResourceId is the resource ID for the background color for this list of attractions
     */
    public AttractionAdapter(Activity context, ArrayList<Attraction> attractions, int colorResourceId) {
        super(context, 0, attractions);

        mColorResourceId = colorResourceId;
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position    The position in the list of data that should be displayed in the
     *                    list item view.
     * @param convertView The recycled view to populate.
     * @param parent      The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;

        if (listItemView == null) {

            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.location_item, parent, false);
        }

        // Get the {@link Attraction} object located at this position in the list
        final Attraction currentAttraction = getItem(position);

        // Find the TextView in the location_item.xml layout with the ID version_number
        TextView attractionNameTextView = (TextView) listItemView.findViewById(R.id.attraction_name);
        attractionNameTextView.setText(currentAttraction.getAttractionName());

        // Find the TextView in the location_item.xml layout with the ID version_number
        TextView attractionDetailsTextView = (TextView) listItemView.findViewById(R.id.attraction_details);
        attractionDetailsTextView.setText(currentAttraction.getAttractionDetails());

        //If there is valid additional information, the adapter displays it.
        if (currentAttraction.hasAdditionalInfo()) {

            // Find the TextView in the location_item.xml layout with the ID version_number
            TextView additionalAttractionInfoTextView = (TextView) listItemView.findViewById(R.id.additional_info_1);
            additionalAttractionInfoTextView.setText(currentAttraction.getAdditionalAttractionInfo());
        }

        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        //If there is a valid image, imageView is set to be VISIBLE, otherwise to GONE.
        if (currentAttraction.hasImage()) {

            // Get the image resource ID from the current Attraction object and
            // set the image to iconView
            imageView.setImageResource(currentAttraction.getImageResourceId());

            //Make sure the view is visible.
            imageView.setVisibility(View.VISIBLE);

        } else {
            //Set the imageView GONE (invisible without taking any space for layout purposes.
            imageView.setVisibility(View.GONE);
        }

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.attraction_name);

        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);

        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}