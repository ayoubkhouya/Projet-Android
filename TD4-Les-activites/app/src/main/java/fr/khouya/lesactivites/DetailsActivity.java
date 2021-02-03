package fr.khouya.lesactivites;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {
    /**
     * @Author: Ayoub KHOUYA
     * @Class: Ing 3
     * @GroupeTP/TD: TP2
     * */

    private Button btn_ok;
    private TextView pseudo_user;
    private GlobalApplication app;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        setTitle(getLocalClassName());

        // Avoir le contexte de l'application
        app = (GlobalApplication) getApplicationContext();

        btn_ok = findViewById(R.id.details_to_news);
        pseudo_user = findViewById(R.id.details_pseudo);

        btn_ok.setOnClickListener(v -> {
            Intent intent = new Intent(DetailsActivity.this, NewsActivity.class);
            startActivity(intent);
            finish();
        });

        pseudo_user.setText(app.getPseudo());

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}