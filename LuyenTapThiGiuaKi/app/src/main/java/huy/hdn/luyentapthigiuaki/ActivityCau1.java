package huy.hdn.luyentapthigiuaki;

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

public class ActivityCau1 extends AppCompatActivity {
    Button calc;
    EditText eda, edb;
    TextView result;
    String strs, streda, stredb;
    int a,b,s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cau1);
        calc = findViewById(R.id.calc);
        result = findViewById(R.id.result);
        eda = findViewById(R.id.ednuma);
        edb = findViewById(R.id.ednumb);


        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                streda = eda.getText().toString();
                stredb = edb.getText().toString();
                a = Integer.parseInt(streda);
                b = Integer.parseInt(stredb);
                s = a+b;

                strs = String.valueOf(s);
                result.setText(strs);
            }
        });

    }
}