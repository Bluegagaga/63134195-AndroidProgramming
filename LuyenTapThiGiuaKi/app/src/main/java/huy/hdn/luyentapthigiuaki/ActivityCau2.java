package huy.hdn.luyentapthigiuaki;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.Arrays;

public class ActivityCau2 extends AppCompatActivity {
    ArrayList<String> dsmon;
    ArrayAdapter<String> adapmon;
    ListView lvmon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cau2);
        lvmon = findViewById(R.id.LV);
        dsmon = new ArrayList<String>(Arrays.asList(
                "Toan",
                "Van",
                "Anh",
                "Hoa",
                "Sinh",
                "Su",
                "Dia",
                "Ly"
        ));

        adapmon = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, dsmon);

        lvmon.setAdapter(adapmon);
        lvmon.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String tenmon = dsmon.get(i);
                //Toast.makeText(ActivityCau2.this, "Mon " + tenmon, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(ActivityCau2.this, ItemActivity.class);
                intent.putExtra("mon",tenmon);
                startActivity(intent);

            }
        });

    }
}