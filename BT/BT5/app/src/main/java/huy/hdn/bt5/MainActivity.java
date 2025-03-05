package huy.hdn.bt5;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText editTextso1;
    EditText editTextso2;
    EditText editTextkq;
    Button nutCong, nutTru, nutNhan, nutChia;

    void TimDieuKhien(){
        editTextso1 = findViewById(R.id.edtso1);
        editTextso2 = findViewById(R.id.edtso2);
        editTextkq = findViewById(R.id.edtKQ);
        nutCong = findViewById(R.id.btnCong);
        nutTru = findViewById(R.id.btnTru);
        nutNhan = findViewById(R.id.btnNhan);
        nutChia = findViewById(R.id.btnChia);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimDieuKhien();

        View.OnClickListener boLangNgheCong = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XuLyCong();
            }
        };

        nutCong.setOnClickListener(boLangNgheCong);


        nutTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XuLyTru();
            }
        });

        nutNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XuLyNhan();
            }
        });

        nutChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XuLyChia();
            }
        });
    }

    void XuLyCong(){

        String stra = editTextso1.getText().toString();
        String strb = editTextso2.getText().toString();

        float soA = Float.parseFloat(stra);
        float soB = Float.parseFloat(strb);

        float Sum = soA + soB;

        String strkq = String.valueOf(Sum);

        editTextkq.setText(strkq);
    }

    void XuLyTru(){

        String stra = editTextso1.getText().toString();
        String strb = editTextso2.getText().toString();

        float soA = Float.parseFloat(stra);
        float soB = Float.parseFloat(strb);

        float Tru = soA - soB;

        String strkq = String.valueOf(Tru);

        editTextkq.setText(strkq);
    }

    void XuLyNhan(){

        String stra = editTextso1.getText().toString();
        String strb = editTextso2.getText().toString();

        float soA = Float.parseFloat(stra);
        float soB = Float.parseFloat(strb);

        float Nhan = soA * soB;

        String strkq = String.valueOf(Nhan);

        editTextkq.setText(strkq);
    }

    void XuLyChia(){

        String stra = editTextso1.getText().toString();
        String strb = editTextso2.getText().toString();

        float soA = Float.parseFloat(stra);
        float soB = Float.parseFloat(strb);

        float Chia = soA / soB;

        String strkq = String.valueOf(Chia);

        editTextkq.setText(strkq);
    }
}