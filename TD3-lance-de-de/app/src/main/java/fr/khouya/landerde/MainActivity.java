package fr.khouya.landerde;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    /**
     * @Author: Ayoub KHOUYA
     * @Class: Ing 3
     * @GroupeTP/TD: TP2
     * */

    Button btn_exo_one;
    Button btn_exo_two;
    Button btn_exo_three;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_exo_one = findViewById(R.id.btn_main_exo1);
        btn_exo_two = findViewById(R.id.btn_main_exo2);
        btn_exo_three = findViewById(R.id.btn_main_exo3);

        btn_exo_one.setOnClickListener(v -> {
            Intent intent = new Intent(this, ExerciceOne.class);
            startActivity(intent);
        });

        btn_exo_two.setOnClickListener(v -> {
            Intent intent = new Intent(this, ExercieTwo.class);
            startActivity(intent);
        });

        btn_exo_three.setOnClickListener(v -> {
            Intent intent = new Intent(this, ExerciceThree.class);
            startActivity(intent);
        });

    }
}