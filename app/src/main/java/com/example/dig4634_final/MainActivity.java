package com.example.dig4634_final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button compareOffers;
    Button myoffers;
    Button howitworks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        assignId(compareOffers, R.id.compareOffersButton);
        assignId(myoffers,R.id.myoffers);
        assignId(howitworks,R.id.howitworks);
    }

    void assignId(Button btn, int id){
        btn = findViewById(id);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Button button = (Button) view;
        String buttonText = button.getText().toString();
        if (buttonText.equals("compare offers")) {
            Log.d("compare", "onClick: Clicked compare offers button");
            Intent compareIntent = new Intent(getBaseContext(), CompareOffersActivity.class);
            startActivity(compareIntent);
            //Intent myIntent = new Intent(getBaseContext(), CompareOffersActivity.class);
            //startActivity(myIntent);
            return;
        }
        if (buttonText.equals("my offers")) {
            Intent myIntent = new Intent(getBaseContext(), MyOffers.class);
            startActivity(myIntent);
            return;
        }
        if (buttonText.equals("how it works")) {
            Intent myIntent = new Intent(getBaseContext(), HowItWorks.class);
            startActivity(myIntent);
            return;
        }

    }
}