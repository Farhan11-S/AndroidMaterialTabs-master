package info.androidhive.materialtabs.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import info.androidhive.materialtabs.R;
import info.androidhive.materialtabs.activity.BangunDatar;
import info.androidhive.materialtabs.activity.BangunRuang;


public class ThreeFragment extends Fragment{
    CardView kubus;
    public ThreeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_three, container, false);
        kubus = view.findViewById(R.id.kubus);
        kubus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCalculator(BangunRuang.class);
            }
        });
        return view;
    }
    public void openCalculator(Class bangun){
        Intent intent = new Intent(getActivity(), bangun);
        startActivity(intent);
    }
}
