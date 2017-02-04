package com.saz.customlistview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

public class MainActivity extends Activity {
    ListView list;
    String[] web = {
            "google Plus",
            "twitter",
            "windows",
            "Bing",
            "Itunes",
            "Wordpress",
            "drupal"
    } ;
    Integer[] imageId = {
            R.drawable.google,
            R.drawable.twitter,
            R.drawable.windows,
            R.drawable.bing,
            R.drawable.apple,
            R.drawable.word,
            R.drawable.drupal

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomAdapter adapter = new
                CustomAdapter(MainActivity.this,web,imageId);
        list=(ListView)findViewById(R.id.listView);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(MainActivity.this, "You Clicked at " +web[+ position], Toast.LENGTH_SHORT).show();

            }
        });

    }

}