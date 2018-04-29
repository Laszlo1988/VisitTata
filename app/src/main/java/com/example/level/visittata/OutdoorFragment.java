package com.example.level.visittata;


import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of number vocabulary words.
 */
public class OutdoorFragment extends Fragment {

    public OutdoorFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();

        attractions.add(new Attraction(R.string.old_lake, R.string.old_lake_details,
                R.string.old_lake_address, R.drawable.around_the_lake));
        attractions.add(new Attraction(R.string.ecotourism, R.string.ecotourism_details,
                R.string.ecotourism_address, R.drawable.ecotourism_center));
        attractions.add(new Attraction(R.string.nature_trail, R.string.nature_trail_details,
                R.string.nature_trail_address, R.drawable.education_trail));
        attractions.add(new Attraction(R.string.golf_club, R.string.golf_club_details,
                R.string.golf_club_address, R.drawable.golf_club));
        attractions.add(new Attraction(R.string.lake_derito, R.string.lake_derito_details,
                R.string.lake_derito_address, R.drawable.lake_derito));
        attractions.add(new Attraction(R.string.arboretum, R.string.arboretum_details,
                R.string.arboretum_address, R.drawable.arboretum));

        // Create an {@link AttractionAdapter}, whose data source is a list of {@link Attraction}s. The
        // adapter knows how to create list items for each item in the list.
        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions,
                R.color.outdoor_name_color);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link AttractionAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Attraction} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }

    @Override
    public void onStop() {
        super.onStop();
    }
}
