package com.example.android.tourguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class Monuments extends Fragment {

    public Monuments(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

//
        ArrayList<ListItemContent> listItemContents = new ArrayList<ListItemContent>();
        listItemContents.add(new ListItemContent(R.drawable.image_1, R.string.list_item_content_text, "24 Oraby Street, cario-Egypt"));
        listItemContents.add(new ListItemContent(R.drawable.image_2, R.string.list_item_content_text, "24 Oraby Street, cario-Egypt"));
        listItemContents.add(new ListItemContent(R.drawable.image_3, R.string.list_item_content_text, "24 Oraby Street, cario-Egypt"));
        listItemContents.add(new ListItemContent(R.drawable.image_4, R.string.list_item_content_text, "24 Oraby Street, cario-Egypt"));
        listItemContents.add(new ListItemContent(R.drawable.image_5, R.string.list_item_content_text, "24 Oraby Street, cario-Egypt"));
        listItemContents.add(new ListItemContent(R.drawable.image_6, R.string.list_item_content_text, "24 Oraby Street, cario-Egypt"));
        listItemContents.add(new ListItemContent(R.drawable.image_7, R.string.list_item_content_text, "24 Oraby Street, cario-Egypt"));
        listItemContents.add(new ListItemContent(R.drawable.image_8, R.string.list_item_content_text, "24 Oraby Street, cario-Egypt"));
        listItemContents.add(new ListItemContent(R.drawable.image_9, R.string.list_item_content_text, "24 Oraby Street, cario-Egypt"));
        listItemContents.add(new ListItemContent(R.drawable.image_10, R.string.list_item_content_text, "24 Oraby Street, cario-Egypt"));
        listItemContents.add(new ListItemContent(R.drawable.image_11, R.string.list_item_content_text, "24 Oraby Street, cario-Egypt"));

        //Making the Adapter For the List Item Content List
        ListItemContentAdapter listItemContentAdapter = new ListItemContentAdapter(getActivity(), listItemContents);
        ListView listView = getActivity().findViewById(R.id.list);

        listView.setAdapter(listItemContentAdapter);

        return inflater.inflate(R.layout.content_layout, container, false);



    }


}