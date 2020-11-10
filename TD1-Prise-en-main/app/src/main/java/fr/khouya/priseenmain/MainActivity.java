package fr.khouya.priseenmain;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public static final String TAG_METHOD = "Method : ";
    public static final String TAG_FACTORIAL = "Factoriel : ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(TAG_METHOD, "onCreate called");

        int v = 54;
        int n = v / 9 - 2;
        Log.i("num : ", "n = " + n);
        int f = factorielle(n);
        Log.i(TAG_FACTORIAL, n + "! = " + f);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG_METHOD, "onStart called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG_METHOD, "onResume called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG_METHOD, "onPause called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG_METHOD, "onStop called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG_METHOD, "onRestart called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG_METHOD, "onDestroy called");
    }

    private int factorielle(int n) {
        int r;
        if (n > 1) {
            int fnm1 = factorielle(n-1);
            r = n * fnm1;
        } else {
            r = 1;
        }
        return r;
    }
}