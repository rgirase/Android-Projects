package com.example.rahul.imagegallery.ui;

import android.app.AppOpsManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Bundle;
import android.os.health.SystemHealthManager;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.rahul.imagegallery.R;

public class DetailsActivity extends AppCompatActivity {
    private static final String BUNDLE_EXTRAS = "BUNDLE_EXTRAS";
    private static final String LOCATION = "LOCATION";
    private static final String DATE = "DATE";
    private static final String IMAGEID = "IMAGEID";
    private ImageView imageView;
    private TextView location;
    private TextView date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        imageView = (ImageView) findViewById(R.id.locationimage);
        date = (TextView) findViewById(R.id.DateValue);
        location = (TextView) findViewById(R.id.locationValue);

        Bundle extras = getIntent().getBundleExtra(BUNDLE_EXTRAS);

        date.setText(extras.getString(DATE));
        location.setText(extras.getString(LOCATION));
        imageView.setImageResource(extras.getInt(IMAGEID));
        ConnectivityManager connectivityManager=(ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);

        connectivityManager.getActiveNetworkInfo().getType()
    }
}
