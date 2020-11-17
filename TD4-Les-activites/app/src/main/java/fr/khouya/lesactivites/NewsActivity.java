package fr.khouya.lesactivites;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class NewsActivity extends AppCompatActivity {

    private Button btn_details;
    private Button btn_logout;
    private TextView pseudo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        setTitle(getLocalClassName());

        Intent login_intent = getIntent();

        // Association
        btn_details = findViewById(R.id.news_to_details);
        btn_logout = findViewById(R.id.news_to_logout);
        pseudo = findViewById(R.id.news_pseudo);

        if (login_intent.hasExtra("pseudo")) {
            pseudo.setText(login_intent.getStringExtra("pseudo"));
        } else {
            pseudo.setText(R.string.faut_logger);
        }

        btn_details.setOnClickListener(v -> {
            Intent intent = new Intent(NewsActivity.this, DetailsActivity.class);
            startActivity(intent);
        });

        btn_logout.setOnClickListener(v -> {
            Intent intent = new Intent(NewsActivity.this, LoginActivity.class);
            startActivity(intent);
            finish();
        });

    }

    @Override
    public void onBackPressed() {
        finish();
    }
}