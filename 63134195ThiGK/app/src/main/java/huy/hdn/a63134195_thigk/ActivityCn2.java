package huy.hdn.a63134195_thigk;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ActivityCn2 extends AppCompatActivity {
    EditText edd, edm, edy;
    Button chk;
    TextView kq;
    String strd, strm, stry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cn2);
        edd = findViewById(R.id.edday);
        edm = findViewById(R.id.edmon);
        edy = findViewById(R.id.edyea);
        chk = findViewById(R.id.btnchk);
        kq = findViewById(R.id.tvkq);

        chk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                strd = edd.getText().toString();
                strm = edm.getText().toString();
                stry = edy.getText().toString();

                if(strd.equals(30) && strm.equals(4) && stry.equals(1975))
                    kq.setText("Dung");
                else
                    kq.setText("Sai");

            }
        });

    }
}