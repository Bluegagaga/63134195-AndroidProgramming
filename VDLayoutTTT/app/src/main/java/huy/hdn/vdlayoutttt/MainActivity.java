package huy.hdn.vdlayoutttt;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Khai bao cac bien
        Button Solve;

        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main_lay), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Solve = findViewById(R.id.Solve);
        //Solve.setText("Solve");
    }


    public void Test1(View v){
        //Test phep cong


    }

    public void Test2(View v){
        //Test phep tru


    }

    public void Test3(View v){
        //Test phep nhan


    }

    public void Test4(View v){
        //Test phep chia


    }

}

