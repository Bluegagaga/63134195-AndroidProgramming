package huy.hdn.listener;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

//public class MainActivity extends AppCompatActivity {
//    Button btnHello;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
//        setContentView(R.layout.activity_main);
//
//        //C1: Listener in Variable
////        //Gan bo lang nghe cho nut bam
////        btnHello = findViewById(R.id.btnHi);
////        btnHello.setOnClickListener(lang_nghe_xin_chao);
////
////        }
////
////
////    }
////
////    //C1: Listener in Variable
////    View.OnClickListener lang_nghe_xin_chao = new View.OnClickListener() {
////        @Override
////        public void onClick(View view) {
////        //Code xu li
////            //Toast.makeText(ngu canh, nd thong bao, thoi gian hien).show()
////            Toast.makeText(MainActivity.this, "Hello", Toast.LENGTH_LONG).show();
////
////        }
//
//      //C2: Listener an danh
//      btnHello = findViewById(R.id.btnHi);
//      btnHello.setOnClickListener(new View.OnClickListener() {
//          @Override
//          public void onClick(View view) {
//              Toast.makeText(MainActivity.this, "Hello", Toast.LENGTH_LONG).show();
//          }
//      });
//    };
//
//
//}

        //C3: Activity as Listener
        public class MainActivity extends AppCompatActivity implements View.OnClickListener {
            Button btnHello;

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                EdgeToEdge.enable(this);
                setContentView(R.layout.activity_main);

                btnHello = findViewById(R.id.btnHi);

            }
            @Override
            public void onClick(View v){
                //Code

            }


        }