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

    // les elements de vue
    private EditText username_input;
    private EditText password_input;
    private EditText pseudo_input;
    private TextView error_login;
    private Button loginButton;

    private GlobalApplication app;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setTitle(getLocalClassName());

        // Avoir le contexte de l'application
        app = (GlobalApplication) getApplicationContext();

        // liaison
        loginButton = findViewById(R.id.login);
        username_input = findViewById(R.id.username);
        password_input = findViewById(R.id.password);
        error_login = findViewById(R.id.login_error);
        pseudo_input = findViewById(R.id.pseudo);

        loginButton.setOnClickListener(v -> {
            String username = String.valueOf(username_input.getText());
            String password = String.valueOf(password_input.getText());
            // Simulation
            if (username.equals(app.getUser_name_correct()) && password.equals(app.getPassword_correct())) {
                Intent intent = new Intent(LoginActivity.this, NewsActivity.class);
                intent.putExtra("pseudo", String.valueOf(pseudo_input.getText()));
                app.setPseudo(String.valueOf(pseudo_input.getText()));
                startActivity(intent);
                finish();
            } else {
                error_login.setVisibility(View.VISIBLE);
                Toast.makeText(this, "Login et/ou mot de pass incorrecte !", Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public void onBackPressed() { }
}