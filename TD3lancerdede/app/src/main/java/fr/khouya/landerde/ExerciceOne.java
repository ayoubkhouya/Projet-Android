package fr.khouya.landerde;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ExerciceOne extends AppCompatActivity {

    TextView txv_resultat;
    Button btn_lancer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercice_one);

        txv_resultat = findViewById(R.id.exo_one_textView);
        btn_lancer = findViewById(R.id.exo_one_btn);

        btn_lancer.setOnClickListener(v -> {
            Toast.makeText(ExerciceOne.this, "Dé lancé ...", Toast.LENGTH_LONG).show();
            int result = (int) (Math.random() * 6) + 1;
            this.txv_resultat.setText(String.valueOf(result));
        });
    }
}