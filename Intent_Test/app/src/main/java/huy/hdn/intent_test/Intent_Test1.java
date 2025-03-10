package huy.hdn.intent_test;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Intent_Test1 extends AppCompatActivity {
    EditText edLog;
    Button OK;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_intent_test1);
        OK = findViewById(R.id.btnOK);
        edLog = findViewById(R.id.edtUName);
        OK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Code
                Intent iQuiz = new Intent(Intent_Test1.this, Intent_Test2.class);
                //Lay data
                //String strLogName = edLog


            }
        });


        });
    }
}