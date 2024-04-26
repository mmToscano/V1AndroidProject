package com.example.v1luciene;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ComunitiesList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_comunities_list);

        configureLogOut();
        configureConfigButton();

        ConstraintLayout chat1 = findViewById(R.id.chat1);
        ConstraintLayout chat2 = findViewById(R.id.chat2);
        ConstraintLayout chat3 = findViewById(R.id.chat3);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ComunitiesList.this, ChatActivity.class);
                startActivity(intent);
            }
        };

        chat1.setOnClickListener(onClickListener);
        chat2.setOnClickListener(onClickListener);
        chat3.setOnClickListener(onClickListener);


    }

    private void configureConfigButton(){
        ImageView configButton = findViewById(R.id.hamburguerButton);
        configButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ComunitiesList.this, ChatInfo.class));

            }
        });
    }





    private void configureLogOut(){
        ImageView toLogOut = findViewById(R.id.logOutComunities);
        toLogOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}