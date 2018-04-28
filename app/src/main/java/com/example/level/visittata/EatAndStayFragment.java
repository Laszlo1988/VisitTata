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
public class EatAndStayFragment extends Fragment {

    public EatAndStayFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();

        attractions.add(new Attraction(R.string.ebreszto_cafe, R.string.ebreszto_cafe_details));
        attractions.add(new Attraction(R.string.chocolate_shop, R.string.chocolate_shop_details));
        attractions.add(new Attraction(R.string.don_salvatore_pizza, R.string.don_salvatore_details));
        attractions.add(new Attraction(R.string.fishermens_inn, R.string.fishermens_details));
        attractions.add(new Attraction(R.string.hotel_kristaly, R.string.hotel_kristaly_details));
        attractions.add(new Attraction(R.string.oregto_club_hotel, R.string.oregto_club_details));
        attractions.add(new Attraction(R.string.hotel_kiss, R.string.hotel_kiss_details));

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

