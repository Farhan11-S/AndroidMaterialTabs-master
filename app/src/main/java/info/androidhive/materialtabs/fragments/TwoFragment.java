package info.androidhive.materialtabs.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import info.androidhive.materialtabs.R;
import info.androidhive.materialtabs.activity.BangunDatar;
import info.androidhive.materialtabs.activity.BangunDatar2;
import info.androidhive.materialtabs.activity.BangunDatar3;
import info.androidhive.materialtabs.activity.BangunDatar4;


public class TwoFragment extends Fragment{
    CardView persegipanjang;
    CardView persegi;
    CardView segitiga;
    CardView lingkaran;
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
        persegi = view.findViewById(R.id.persegi);
        segitiga = view.findViewById(R.id.segitiga);
        lingkaran = view.findViewById(R.id.lingkaran);
        persegipanjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCalculator(BangunDatar.class);
            }
        });
        persegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCalculator(BangunDatar2.class);
            }
        });
        segitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCalculator(BangunDatar3.class);
            }
        });
        lingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCalculator(BangunDatar4.class);
            }
        });
        return view;
    }
    public void openCalculator(Class bangun){
        Intent intent = new Intent(getActivity(), bangun);
        startActivity(intent);
    }

}
