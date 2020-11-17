package fr.khouya.lesactivites;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class DetailsActivity extends AppCompatActivity {

    private Button btn_ok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        setTitle(getLocalClassName());

        btn_ok = findViewById(R.id.details_to_news);

        btn_ok.setOnClickListener(v -> {
            Intent intent = new Intent(DetailsActivity.this, NewsActivity.class);
            startActivity(intent);
            finish();
        });

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}