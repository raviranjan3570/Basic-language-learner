package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    // for setting background color

    private int mColorResourceID;

    //constructor

    WordAdapter(Activity context, ArrayList<Word> Words, int colorResourceId) {
        super(context,0, Words);
        mColorResourceID= colorResourceId;
    }

    // We override getView method when creating custom array adapter

    @Override
    @NonNull

    public View getView(int position, View convertView, @NonNull ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list

        Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID miwok_text_view

        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);

        // Get the miwokTranslation from the current Word object and
        // set this text on the miwok_text_view TextView

        miwokTextView.setText(currentWord.getMiwokTranslation());

        // Find the TextView in the list_item.xml layout with the ID default_text_view

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);

        // Get the default translation from the current Word object and
        // set this text on the default TextView

        defaultTextView.setText(currentWord.getDefaultTranslation());

        // Find the ImageView in the list_item.xml layout with the image

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.image);

        // first we'll confirm if the view has image or not

        if (currentWord.hasImage()) {
            iconView.setImageResource(currentWord.getImageResourceID());
            iconView.setVisibility(View.VISIBLE);
        }

        else{
            iconView.setVisibility(View.GONE);
        }

        //set the theme color for the list item

        View textContainer = listItemView.findViewById(R.id.text_container);

        // find the color that resource id maps to

        int color= ContextCompat.getColor(getContext(), mColorResourceID);

        //set the background color for the text container view

        textContainer.setBackgroundColor(color);
        
        return listItemView;

    }
}