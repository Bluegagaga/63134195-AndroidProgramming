package huy.hdn.luyentapthigiuaki;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button c1, c2, c3, c4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        c1 = findViewById(R.id.Cau1);
        c2 = findViewById(R.id.Cau2);
        c3 = findViewById(R.id.Cau3);
        c4 = findViewById(R.id.Cau4);

        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ic1 = new Intent(MainActivity.this, ActivityCau1.class);
                startActivity(ic1);
            }

        });

        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ic2 = new Intent(MainActivity.this, ActivityCau2.class);
                startActivity(ic2);
            }

        });

    }
}