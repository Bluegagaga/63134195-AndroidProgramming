package huy.hdn.lvtest;

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

public class MainActivity extends AppCompatActivity {
    ListView lvv;
    ArrayList<String> ds;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        lvv = findViewById(R.id.lv);


        ds = new ArrayList<String>();
        ds.add("CSS");
        ds.add("Jav");
        ds.add("HTML");

        ArrayAdapter<String> adap;
        adap =  new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, ds);

        lvv.setAdapter(adap);
        lvv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                String value=adap.getItem(i);
                Toast.makeText(getApplicationContext(),value, Toast.LENGTH_SHORT).show();

            }
        });
    }
}