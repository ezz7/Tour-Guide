package com.example.android.tourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;

import java.util.List;


public class ListItemContentAdapter extends ArrayAdapter<ListItemContent> {

    //Constructor
    public ListItemContentAdapter( Context context, List<ListItemContent> listItemContents) {
        super(context, 0, listItemContents);
    }

    public View getView(int position,  View convertView,  ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view

        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }


        // Getting the Position of the listItem content
        ListItemContent currentListItemContent = getItem(position);

        // Getting the Image of the List item
        ImageView imageView = listItemView.findViewById(R.id.list_item_image);

        // Setting the Image source
        imageView.setImageResource(currentListItemContent.getImage_source());

        // Getting the List Item content Text
        TextView list_item_content_text = (TextView) listItemView.findViewById(R.id.list_item_content_text);

        // Setting the List Item Content Text
        list_item_content_text.setText(currentListItemContent.getList_item_content_text());

        // Getting List Item location Text
        TextView location_text = (TextView) listItemView.findViewById(R.id.location_text);

        // Setting List Item Location Text
        location_text.setText(currentListItemContent.getLocation_text());

        return listItemView;

    }

}
