package huy.hdn.a63134195_thigk;

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

public class ActivityCn3 extends AppCompatActivity {
    ArrayList<String> dsmon;
    ArrayAdapter<String> adapmon;
    ListView LV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cn3);
        LV = findViewById(R.id.LV);

        dsmon = new ArrayList<String>(Arrays.asList(
                "Toan",
                "Ly",
                "Hoa",
                "Sinh",
                "Su",
                "Dia",
                "Van",
                "Anh",
                "Am Nhac",
                "My Thuat"
        ));

        adapmon = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, dsmon);

        LV.setAdapter(adapmon);

        LV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String monn = dsmon.get(i);
                //Y 1
                //Toast.makeText(ActivityCn3.this, "Mon " + monn, Toast.LENGTH_SHORT).show();
                //Y 2
                Intent intent = new Intent(ActivityCn3.this, ItemActivity.class);
                intent.putExtra("mon",monn);
                startActivity(intent);
            }
        });

    }
}