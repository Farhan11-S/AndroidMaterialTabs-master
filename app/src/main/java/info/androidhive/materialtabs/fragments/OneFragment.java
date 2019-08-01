package info.androidhive.materialtabs.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import info.androidhive.materialtabs.R;


public class OneFragment extends Fragment{
    EditText number1;
    EditText number2;
    TextView result;
    Button btnplus;
    Button btnminus;
    Button btnkali;
    Button btnbagi;

    public OneFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_one, container, false);
        number1 = view.findViewById(R.id.txtnumber);
        number2 = view.findViewById(R.id.txtnumber2);
        btnplus = view.findViewById(R.id.btnplus);
        btnminus = view.findViewById(R.id.btnminus);
        btnkali = view.findViewById(R.id.btnkali);
        btnbagi = view.findViewById(R.id.btnbagi);
        result = view.findViewById(R.id.hasil);
        btnplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String angka = number1.getText().toString();
                String angka2 = number2.getText().toString();
                if (angka.isEmpty()||angka2.isEmpty())
                {
                    Toast.makeText(getContext(),"Invalid Operation",Toast.LENGTH_LONG).show();
                }
                else
                {
                    double ubah = Double.parseDouble(angka);
                    double ubah2 = Double.parseDouble(angka2);
                    double tambah = ubah + ubah2;
                    result.setText(String.valueOf(tambah));
                }
            }
        });
        btnminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String angka = number1.getText().toString();
                String angka2 = number2.getText().toString();
                if (angka.isEmpty()||angka2.isEmpty())
                {
                    Toast.makeText(getContext(),"Invalid Operation",Toast.LENGTH_LONG).show();
                }
                else
                {
                    double ubah = Double.parseDouble(angka);
                    double ubah2 = Double.parseDouble(angka2);
                    double tambah = ubah - ubah2;
                    result.setText(String.valueOf(tambah));
                }
            }
        });
        btnkali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String angka = number1.getText().toString();
                String angka2 = number2.getText().toString();
                if (angka.isEmpty()||angka2.isEmpty())
                {
                    Toast.makeText(getContext(),"Invalid Operation",Toast.LENGTH_LONG).show();
                }
                else
                {
                    double ubah = Double.parseDouble(angka);
                    double ubah2 = Double.parseDouble(angka2);
                    double tambah = ubah * ubah2;
                    result.setText(String.valueOf(tambah));
                }
            }
        });
        btnbagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String angka = number1.getText().toString();
                String angka2 = number2.getText().toString();
                if (angka.isEmpty()||angka2.isEmpty())
                {
                    Toast.makeText(getContext(),"Invalid Operation",Toast.LENGTH_LONG).show();
                }
                else
                {
                    double ubah = Double.parseDouble(angka);
                    double ubah2 = Double.parseDouble(angka2);
                    double tambah = ubah / ubah2;
                    if (ubah2 == 0)
                    {
                        Toast.makeText(getContext(),"Invalid Operation",Toast.LENGTH_LONG).show();
                    }
                    else
                    {
                        result.setText(String.valueOf(tambah));
                    }
                }
            }
        });
        return view;


    }


}
