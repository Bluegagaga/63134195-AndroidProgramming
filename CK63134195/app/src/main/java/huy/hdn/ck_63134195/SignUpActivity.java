package huy.hdn.ck_63134195;

import android.app.Dialog;
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
import com.google.firebase.ktx.Firebase;
import com.google.firebase.auth.FirebaseAuth;

public class SignUpActivity extends AppCompatActivity {
    EditText mail, pass;
    Button signup;
    TextView signin;
    FirebaseAuth auth;
    ProgressDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sign_up);

        //findID
        mail = findViewById(R.id.maillog);
        pass = findViewById(R.id.passlog);
        signup = findViewById(R.id.btnsup);
        signin = findViewById(R.id.signin);

        //Authentication
        auth = FirebaseAuth.getInstance();

        //Dialog
        dialog = new ProgressDialog(this);

        //Press Sign Up Button
        signup.setOnClickListener(new View.OnClickListener() {
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

                dialog.setMessage("Loading..");
                dialog.show();

                auth.createUserWithEmailAndPassword(smail,spass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            dialog.dismiss();
                            Toast.makeText(SignUpActivity.this, "Registration Successful!", Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(SignUpActivity.this, MainActivity.class);
                            startActivity(intent);
                        }
                            else {
                            dialog.dismiss();
                            Toast.makeText(SignUpActivity.this, "Registration Failed!", Toast.LENGTH_SHORT).show();
                        }
                    }
                });

            }
        });

        //Press Return to Sign In Page
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });


    }
}