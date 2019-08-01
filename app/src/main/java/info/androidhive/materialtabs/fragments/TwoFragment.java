package info.androidhive.materialtabs.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import info.androidhive.materialtabs.R;
import info.androidhive.materialtabs.activity.BangunDatar;


public class TwoFragment extends Fragment{
    ImageButton persegipanjang;
    public TwoFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_two, container, false);
        persegipanjang = view.findViewById(R.id.persegipanjang);
        persegipanjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        return view;
    }
    public void openCalculator(){
        Intent intent = new Intent(getActivity(), BangunDatar.class);
        startActivity(intent);
    }

}
