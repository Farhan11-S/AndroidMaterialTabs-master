package info.androidhive.materialtabs.activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import info.androidhive.materialtabs.R;

public class BangunDatar4 extends AppCompatActivity {
    private Toolbar toolbar;
    EditText number2;
    TextView result;
    Button luas;
    Button keliling;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangun_datar4);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
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
                    double tambah = 22 * ubah2 * ubah2 /7;
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
                    double tambah = 2* 22 * ubah2 / 7;
                    result.setText(String.valueOf(tambah));
                }
            }
        });
    }
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
