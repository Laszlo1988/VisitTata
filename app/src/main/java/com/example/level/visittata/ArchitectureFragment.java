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
public class ArchitectureFragment extends Fragment {

    public ArchitectureFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();

        attractions.add(new Attraction(R.string.castle, R.string.castle_details,
                R.string.castle_address, R.drawable.tata_castle));
        attractions.add(new Attraction(R.string.esterhazy_palace, R.string.esterhazy_palace_details,
                R.string.esterhazy_palace_address, R.drawable.esterhazy_palace));
        attractions.add(new Attraction(R.string.belfry, R.string.belfry_details,
                R.string.belfry_address, R.drawable.belfry));
        attractions.add(new Attraction(R.string.lookout, R.string.lookout_details,
                R.string.lookout_address, R.drawable.lookout));
        attractions.add(new Attraction(R.string.temple, R.string.temple_details, R.string.temple_address,
                R.drawable.temple));
        attractions.add(new Attraction(R.string.small_palace, R.string.small_palace_details,
                R.string.small_palace_address, R.drawable.small_palace));


        // Create an {@link AttractionAdapter}, whose data source is a list of {@link Attraction}s. The
        // adapter knows how to create list items for each item in the list.
        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions, R.color.colorPrimaryDark);

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
