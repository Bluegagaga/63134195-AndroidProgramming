package huy.hdn.ck_63134195;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
    EditText mail, pass;
    Button signin;
    TextView signup,forpass;
    ProgressDialog dialog;

    //Firebase
    FirebaseAuth Auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);

        //findID
        mail = findViewById(R.id.maillog);
        pass = findViewById(R.id.passlog);
        signin = findViewById(R.id.btnsin);
        signup = findViewById(R.id.signup);
        forpass = findViewById(R.id.forpass);

        Auth = FirebaseAuth.getInstance();
        dialog = new ProgressDialog(this);

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

                Auth.signInWithEmailAndPassword(smail,spass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            dialog.dismiss();
                            Toast.makeText(MainActivity.this, "Login Successful!", Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                            startActivity(intent);
                        }
                        else {
                            //dialog.dismiss();
                            Toast.makeText(MainActivity.this, "Login Failed!", Toast.LENGTH_SHORT).show();
                        }

                        dialog.setMessage("Loading...");
                        dialog.show();

                    }
                });
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