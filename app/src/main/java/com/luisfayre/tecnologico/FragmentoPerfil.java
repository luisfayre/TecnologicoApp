package com.luisfayre.tecnologico;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.Toast;

/**
 * Created by luisf on 29/04/2017.
 */
public class FragmentoPerfil extends Fragment {

   // private RatingBar ratingBar;

    public FragmentoPerfil() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_profile,
                container, false);

        //addListenerOnRatingBar(view);

        return view;
    }

//    private void addListenerOnRatingBar(View view) {
//       // ratingBar = (RatingBar) view.findViewById(R.id.ratingBar2);
//
//
//        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
//            @Override
//            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
//                Toast.makeText(getActivity(),""+v, Toast.LENGTH_SHORT).show();
//            }
//        });
//    }


}
