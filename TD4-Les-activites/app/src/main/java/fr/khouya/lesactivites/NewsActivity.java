package fr.khouya.lesactivites;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class NewsActivity extends AppCompatActivity {
    /**
     * @Author: Ayoub KHOUYA
     * @Class: Ing 3
     * @GroupeTP/TD: TP2
     * */

    private Button btn_details;
    private Button btn_logout;
    private Button btn_about;
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
        btn_about = findViewById(R.id.news_to_web);
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

        btn_about.setOnClickListener(v -> {
            String url = "https://news.google.com/";
            Intent web = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(web);
        });

    }

    @Override
    public void onBackPressed() {
        this.finish();
    }
}