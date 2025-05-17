package huy.hdn.ck_63134195;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText mail, pass;
    Button signin;
    TextView signup,forpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        //findID
        mail = findViewById(R.id.maillog);
        pass = findViewById(R.id.passlog);
        signin = findViewById(R.id.btnsin);
        signup = findViewById(R.id.signup);
        forpass = findViewById(R.id.forpass);

        //Press Sign In button
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String smail = mail.getText().toString();
                String spass = pass.getText().toString();

                if(TextUtils.isEmpty(smail)){
                    mail.setError("Email is Required!");
                    return;
                }

                if(TextUtils.isEmpty(spass)){
                    mail.setError("Password is Required!");
                    return;
                }
            }

        });

        //Press Signup text
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SignUpActivity.class);
                startActivity(intent);
            }
        });

        //Press Forgot Password text
        forpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ResetPassActivity.class);
                startActivity(intent);
            }
        });

    }
}