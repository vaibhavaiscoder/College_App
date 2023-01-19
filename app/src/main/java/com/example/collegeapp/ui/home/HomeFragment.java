package com.example.collegeapp.ui.home;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.collegeapp.R;
import com.google.firebase.database.DatabaseReference;
import com.smarteist.autoimageslider.DefaultSliderView;
import com.smarteist.autoimageslider.IndicatorAnimations;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderLayout;
import com.smarteist.autoimageslider.SliderView;

import kotlin.random.Random;

public class HomeFragment extends Fragment {

    private DatabaseReference reference, dbRef;


//    private SliderLayout sliderLayout;
    private ImageView map;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

//        sliderLayout = view.findViewById(R.id.slider);
//        sliderLayout.setIndicatorAnimation(IndicatorAnimations.FILL);
//        sliderLayout.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
//        sliderLayout.setScrollTimeInSec(1);
//        setSliderViews();

//        getSliderImage();

        map = view.findViewById(R.id.map);
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMap();
            }
        });
        return view;
    }

    private void openMap() {
        Uri uri = Uri.parse("geo:0, 0?q=J D College Of Engineering & Management");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        intent.setPackage("com.google.android.apps.maps");
        startActivity(intent);
    }

//    private void setSliderViews() {
//        for (int i = 0; i < 5; i++) {
//            DefaultSliderView sliderView = new DefaultSliderView(getContext());
//
//            switch (i) {
//                case 0:
//                    sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/my-clg-app-a7bab.appspot.com/o/gallery%2F%5BB%4037c891jpg?alt=media&token=f56f7435-7dc3-44b5-9e3e-b610d7754695");
//                    break;
//                case 1:
//                    sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/my-clg-app-a7bab.appspot.com/o/gallery%2F%5BB%40cef84d6jpg?alt=media&token=a8b8b371-cf7f-4d36-b970-3bf585d0e53f");
//                    break;
//                case 2:
//                    sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/my-clg-app-a7bab.appspot.com/o/gallery%2F%5BB%40f6db07jpg?alt=media&token=b6e174d7-13db-4b11-8238-973be191b100");
//                    break;
//            }
//            sliderView.setImageScaleType(ImageView.ScaleType.CENTER_CROP);
//            sliderLayout.addSliderView(sliderView);
//        }
//    }
}