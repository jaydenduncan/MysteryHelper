package com.example.mysteryhelper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mysteryhelper.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private String[] plots;
    Button helpBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        plots = getResources().getStringArray(R.array.plot_fragments);

        helpBtn = binding.helpButton;

        helpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int randNum = chooseRandNum();

                String plotFragment = plots[randNum];

                binding.plotText.setText(plotFragment);

            }
        });
    }



    private static int chooseRandNum(){

        int result = 0;

        result = (int)(Math.random() * 18);

        return result;

    }
}