package com.example.rahul.imagegallery.model;

import com.example.rahul.imagegallery.R;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is a dummy data source, used to simulate the kind of input recieve from a
 * Database or Web source.
 * Created by Rahul on 1/12/17.
 */

public class ImageData {

    private static final String[] dates = {"22nd Jan 2016", "16th Feb 2015", "18th Nov 2016",
            "6th Oct 2014", "15th Aug 2014", " 26th June 2016", " 13th May 2016",
            "12th May 2016", "20th Nov 2014", "26th June 2016", "10th Jan 2015",
            "18th Nov 2015", "22nd May 2016", "22nd March 2016"};

    private static final String[] locations = {"Miami, Florida", "Austin, Texas",
            "Houston, Texas", "Chicago, Illinois", "Tampa, Florida",
            "San Jose, California", "Dubai", "Atlanta,Georgia",
            "Lombard, Illinois", "Saint Lois, Indiana", "New jercy, NewYork", "Manali, India"};

    private static final int[] images = {R.drawable.scene1, R.drawable.scene2, R.drawable.scene3,
            R.drawable.scene4, R.drawable.scene5, R.drawable.scene6,
            R.drawable.scene7, R.drawable.scene8, R.drawable.scene9,
            R.drawable.scene10, R.drawable.scene11, R.drawable.scene12,};


    public static List<ImageList> getListData() {
        List<ImageList> data = new ArrayList<>();
        //Repeat process 3 times, so that we have enough data to demonstrate a scrollable
        for (int x = 0; x < 3; x++) {

            for (int i = 0; i < images.length; i++) {
                ImageList image = new ImageList();
                image.setImageResId(images[i]);
                image.setLocation(locations[i]);
                image.setDate(dates[i]);

                data.add(image);
            }


        }
        return data;
    }


}
