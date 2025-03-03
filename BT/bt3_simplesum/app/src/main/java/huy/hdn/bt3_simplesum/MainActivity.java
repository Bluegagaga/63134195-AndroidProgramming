package huy.hdn.bt3_simplesum

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Gắn Layout tương ứng với file này
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }


    //Bộ lắng nghe và xử lý sự kiện click lên button "Tính Tổng"
    public void XuLyCong(View view){
        //Tìm, tham chiếu đến điều khiển trên tệp XML
        EditText editTextA = findViewById(R.id.edtA);
        EditText editTextB = findViewById(R.id.edtb);
        EditText editTextKQ = findViewById(R.id.edtkq);
        //Lấy dữ liệu về
        String strA = editTextA.getText().toString();
        String strB = editTextB.getText().toString();

        //Chuyển dữ liệu sang dạng số
        int soA = Integer.parseInt(strA);
        int soB = Integer.parseInt(strB);
        //Tính tổng theo yêu cầu
        int sum = soA + soB;
        //Chuyển kết quả sang dạng chuỗi
        String strsum = String.valueOf(sum);
        editTextKQ.setText(strsum);
    }
}