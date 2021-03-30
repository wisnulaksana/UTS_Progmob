package id.ac.umn.recycleview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    EditText username, password;
    Button btnLogin;
    Button balikbtn;

    String rightusername = "1905551128";
    String rightpassword = "wisnu123";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = findViewById(R.id.Name);
        password = findViewById(R.id.Password);
        btnLogin = findViewById(R.id.logBtn);
        balikbtn = findViewById(R.id.balikBtn);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(username.getText().toString()) || TextUtils.isEmpty((password.getText().toString()))) {
                    Toast.makeText(Login.this, "Empty Data", Toast.LENGTH_LONG).show();
                } else if (username.getText().toString().equals(rightusername)) {
                    if (password.getText().toString().equals(rightpassword)) {
                        loginSukses();
                    } else {
                        Toast.makeText(Login.this, "Invalid Username/Password", Toast.LENGTH_LONG).show();
                    }
                } else {
                    Toast.makeText(Login.this, "Invalid Username/Password", Toast.LENGTH_LONG).show();
                }
            }
        });
        balikbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                back();
            }
        });
    }

    public void loginSukses() {
        Intent intent = new Intent(this, Music.class);
        startActivity(intent);
    }

    private void back() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}


