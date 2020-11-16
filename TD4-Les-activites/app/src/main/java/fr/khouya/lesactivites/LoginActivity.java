package fr.khouya.lesactivites;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    // Pour tester le login
    private final String user_name_correct = "ayoub@khouya.fr";
    private final String password_correct = "password";

    // les elements de vue
    private EditText username_input;
    private EditText password_input;
    private TextView error_login;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setTitle(getLocalClassName());

        // liaison
        loginButton = findViewById(R.id.login);
        username_input = findViewById(R.id.username);
        password_input = findViewById(R.id.password);
        error_login = findViewById(R.id.login_error);z

        loginButton.setOnClickListener(v -> {
            String username = String.valueOf(username_input.getText());
            String password = String.valueOf(password_input.getText());
            // Simulation
            if (username.equals(user_name_correct) && password.equals(password_correct)) {
                Intent intent = new Intent(LoginActivity.this, NewsActivity.class);
                startActivity(intent);
                finish();
            } else {
                error_login.setVisibility(View.VISIBLE);
                Toast.makeText(this, "Login et/ou mot de pass incorrecte !", Toast.LENGTH_LONG).show();
            }
        });
    }
}