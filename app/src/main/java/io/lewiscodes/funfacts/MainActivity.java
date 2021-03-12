package io.lewiscodes.funfacts;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView factTextView;
    private RelativeLayout layout;
    private Button showFactButton;
    private FactBook factBook = new FactBook();
    private ColorWheel colorWheel = new ColorWheel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        factTextView = findViewById(R.id.factTextView);
        showFactButton = findViewById(R.id.showFactButton);
        layout = findViewById(R.id.relativeLayout);

//        View.OnClickListener factBtnListener = new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                factTextView.setText(factBook.getFact());
//            }
//        };
        showFactButton.setOnClickListener((view) -> {
            int color = colorWheel.getColor();
            factTextView.setText(factBook.getFact());
            layout.setBackgroundColor(color);
            showFactButton.setTextColor(color);
        });
    }
}