package info.androidhive.materialtabs.activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import info.androidhive.materialtabs.R;

public class BangunDatar5 extends AppCompatActivity {
    EditText number2;
    TextView result;
    Button luas;
    Button keliling;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangun_datar4);
        number2 = findViewById(R.id.txtnumber2);
        result = findViewById(R.id.hasil);
        luas = findViewById(R.id.luas);
        keliling = findViewById(R.id.keliling);
        luas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String angka2 = number2.getText().toString();
                if (angka2.isEmpty())
                {
                    Toast.makeText(getApplicationContext(),"Invalid Operation",Toast.LENGTH_LONG).show();
                }
                else
                {
                    double ubah2 = Double.parseDouble(angka2);
                    double tambah = ubah2 * ubah2;
                    result.setText(String.valueOf(tambah));
                }
            }
        });

        keliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String angka2 = number2.getText().toString();
                if (angka2.isEmpty())
                {
                    Toast.makeText(getApplicationContext(),"Invalid Operation",Toast.LENGTH_LONG).show();
                } else{
                    double ubah2 = Double.parseDouble(angka2);
                    double tambah = ubah2*4;
                    result.setText(String.valueOf(tambah));
                }
            }
        });
    }
}