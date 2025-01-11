package com.haya.impactroulette;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private ImageView imgPaimon, imgRoleta;

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        imgRoleta = findViewById(R.id.img_roleta);

        imgRoleta.animate()
                .rotationBy(360f)
                .setDuration(2000)
                .setInterpolator(null)
                .withEndAction(new Runnable() {
                    @Override
                    public void run() {
                        imgRoleta.animate().rotationBy(360f).setDuration(2000).withEndAction(this).start();
                    }
                }).start();
    }
}