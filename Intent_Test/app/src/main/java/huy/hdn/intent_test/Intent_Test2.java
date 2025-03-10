package huy.hdn.intent_test;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Intent_Test2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_intent_test2);



        //Nhan Intent
        Intent iNhan = getIntent();
        //Boc data
         String LogName = iNhan.getStringExtra("Ten bien chua username ben Intent1");
        //Xu li
        //Hien ra dieu khien
        //TextView DN = findViewById(R.id.UName);
        //DN = DN.setText()...;

        });
    }
}