package th.part2.ex4_addsubmuldiv_onclick;

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
        editTextso1 = findViewById(R.id.edtA);
        editTextso2 = findViewById(R.id.edtB);
        editTextkq = findViewById(R.id.edtkq);
        nutCong = findViewById(R.id.btncong);
        nutTru = findViewById(R.id.btntru);
        nutNhan = findViewById(R.id.btnnhan);
        nutChia = findViewById(R.id.btnchia);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimDieuKhien();
    }

    public void XuLyCong(View view){

        String stra = editTextso1.getText().toString();
        String strb = editTextso2.getText().toString();

        float soA = Float.parseFloat(stra);
        float soB = Float.parseFloat(strb);

        float Sum = soA + soB;

        String strkq = String.valueOf(Sum);

        editTextkq.setText(strkq);
    }

    public void XuLyTru(View view){

        String stra = editTextso1.getText().toString();
        String strb = editTextso2.getText().toString();

        float soA = Float.parseFloat(stra);
        float soB = Float.parseFloat(strb);

        float Tru = soA - soB;

        String strkq = String.valueOf(Tru);

        editTextkq.setText(strkq);
    }

    public void XuLyNhan(View view){

        String stra = editTextso1.getText().toString();
        String strb = editTextso2.getText().toString();

        float soA = Float.parseFloat(stra);
        float soB = Float.parseFloat(strb);

        float Nhan = soA * soB;

        String strkq = String.valueOf(Nhan);

        editTextkq.setText(strkq);
    }

    public void XuLyChia(View view){

        String stra = editTextso1.getText().toString();
        String strb = editTextso2.getText().toString();

        float soA = Float.parseFloat(stra);
        float soB = Float.parseFloat(strb);

        float Chia = soA / soB;

        String strkq = String.valueOf(Chia);

        editTextkq.setText(strkq);
    }
}