package fr.khouya.landerde;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ExercieTwo extends AppCompatActivity {

    TextView txv_resultat_un;
    TextView txv_resultat_deux;
    Button btn_lancer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercie_two);

        txv_resultat_un = findViewById(R.id.exo_two_textView_first);
        txv_resultat_deux = findViewById(R.id.exo_two_textView_second);

        btn_lancer = findViewById(R.id.exo_two_btn);

        btn_lancer.setOnClickListener(v -> {
            Toast.makeText(ExercieTwo.this, "Deux dés lancés ...", Toast.LENGTH_SHORT).show();
            int result_un = (int) (Math.random() * 6) + 1;
            int result_deux = (int) (Math.random() * 6) + 1;
            this.txv_resultat_un.setText(String.valueOf(result_un));
            this.txv_resultat_deux.setText(String.valueOf(result_deux));
        });

    }
}