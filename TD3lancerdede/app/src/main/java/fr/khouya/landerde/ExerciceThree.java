package fr.khouya.landerde;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ExerciceThree extends AppCompatActivity {

    TextView txv_resultat_un;
    TextView txv_resultat_deux;
    EditText edtx_nombre_de_face;
    Button btn_lancer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercice_three);


        txv_resultat_un = findViewById(R.id.exo_three_textView_first);
        txv_resultat_deux = findViewById(R.id.exo_three_textView_second);

        edtx_nombre_de_face = findViewById(R.id.exo_three_edit_text);

        btn_lancer = findViewById(R.id.exo_three_btn);

        btn_lancer.setOnClickListener(v -> {
            Toast.makeText(ExerciceThree.this, "Deux dés lancés ...", Toast.LENGTH_SHORT).show();
            String nb_utilisateur = edtx_nombre_de_face.getText().toString();
            int nb_faces =  (nb_utilisateur.equals("")) ? 1 : Integer.parseInt(nb_utilisateur);
            int resultat_un = (int) (Math.random() * nb_faces) + 1;
            int resultat_deux = (int) (Math.random() * nb_faces) + 1;
            this.txv_resultat_un.setText(String.valueOf(resultat_un));
            this.txv_resultat_deux.setText(String.valueOf(resultat_deux));
        });

    }
}