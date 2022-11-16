package ru.samsung.itschool.mdev.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import ru.samsung.itschool.mdev.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

   // private Button btn;
    private ActivityMainBinding bind;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bind = ActivityMainBinding.inflate(getLayoutInflater());
        bind.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });



      //  setContentView(R.layout.activity_main);
      //  btn = findViewById(R.id.button);

    }
}