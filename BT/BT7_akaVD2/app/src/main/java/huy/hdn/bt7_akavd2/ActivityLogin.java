package huy.hdn.bt7_akavd2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.util.Patterns;

public class ActivityLogin extends AppCompatActivity {

    EditText edtUserName, edtPassword, edtEmail;
    Button btnConfirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        TimDieuKhien();

        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strUserName = edtUserName.getText().toString();
                String strPassword = edtPassword.getText().toString();
                String strEmail = edtEmail.getText().toString().trim();
                if(strUserName.equals("HuynhHuy") && strPassword.equals("HuyVipPro") && Patterns.EMAIL_ADDRESS.matcher(strEmail).matches()){
                    Intent iHome = new Intent(ActivityLogin.this, ActivityHome.class);
                    iHome.putExtra("UserName", strUserName);
                    startActivity(iHome);
                }
                else if (!Patterns.EMAIL_ADDRESS.matcher(strEmail).matches()) {
                    Toast.makeText(ActivityLogin.this, "Incorrecr Mail Format!!", Toast.LENGTH_SHORT).show();
                    edtEmail.setText("");
                }
                else if (!strUserName.equals("HuynhHuy") && !strPassword.equals("HuyVipPro")) {
                    Toast.makeText(ActivityLogin.this, "Incorrect Password or Username!!", Toast.LENGTH_SHORT).show();
                    edtUserName.setText("");
                    edtPassword.setText("");
}
                }

        });
    }

    public void TimDieuKhien(){
        edtUserName = findViewById(R.id.edtUserName);
        edtPassword = findViewById(R.id.edtPass);
        edtEmail = findViewById(R.id.edtEmail);
        btnConfirm = findViewById(R.id.btnOK);
    }
}