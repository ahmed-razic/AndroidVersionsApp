package com.example.android.androidversion;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class AndroidVersionAdapter extends ArrayAdapter<Version> {
    public AndroidVersionAdapter(@NonNull Activity context, @NonNull ArrayList<Version> versions) {
        super(context, 0, versions);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Version currentVersion = getItem(position);

        TextView nameTextView = listItemView.findViewById(R.id.version_name);
        TextView versionTextView = listItemView.findViewById(R.id.version_number);
        ImageView iconImageView = listItemView.findViewById(R.id.version_icon);

        nameTextView.setText(currentVersion.getVersion_name());
        versionTextView.setText(currentVersion.getVersion_number());
        iconImageView.setImageResource(currentVersion.getVersion_icon_ID());

        return listItemView;
    }
}
