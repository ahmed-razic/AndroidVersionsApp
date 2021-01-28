package com.example.android.androidversion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Version> versions = new ArrayList<Version>();

        versions.add(new Version("Donut", "1.6", R.drawable.donut));
        versions.add(new Version("Eclair", "2.0-2.1", R.drawable.eclair));
        versions.add(new Version("Froyo", "2.2-2.2.3", R.drawable.froyo));
        versions.add(new Version("GingerBread", "2.3-2.3.7", R.drawable.gingerbread));
        versions.add(new Version("Honeycomb", "3.0-3.2.6", R.drawable.honeycomb));
        versions.add(new Version("Ice Cream Sandwich", "4.0-4.0.4", R.drawable.icecream));
        versions.add(new Version("Jelly Bean", "4.1-4.3.1", R.drawable.jellybean));
        versions.add(new Version("KitKat", "4.4-4.4.4", R.drawable.kitkat));
        versions.add(new Version("Lollipop", "5.0-5.1.1", R.drawable.lollipop));
        versions.add(new Version("Marshmallow", "6.0-6.0.1", R.drawable.marshmallow));
        versions.add(new Version("Nougat", "7.0-7.1.2", R.drawable.nougat));
        versions.add(new Version("Oreo", "8.0-8.1", R.drawable.oreo));
        versions.add(new Version("Pie", "9.0", R.drawable.pie));
        versions.add(new Version("Android 10", "10.0", R.drawable.android10));
        versions.add(new Version("Android 11", "11.0", R.drawable.android11));


        AndroidVersionAdapter adapter = new AndroidVersionAdapter(this, versions);
        ListView listView = findViewById(R.id.list_item);
        listView.setAdapter(adapter);

    }
}