package com.example.android.marcadorplacar;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    int pontosTimeA = 0;
    int pontosTimeB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.pontosA);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.pontosB);
        scoreView.setText(String.valueOf(score));
    }

    public void touchDownA(View view) {
        pontosTimeA += 6;
        displayForTeamA(pontosTimeA);
    }

    public void inc1A(View view) {
        pontosTimeA += 1;
        displayForTeamA(pontosTimeA);
    }

    public void inc2A(View view) {
        pontosTimeA += 2;
        displayForTeamA(pontosTimeA);
    }

    public void fieldGoalA(View view) {
        pontosTimeA += 3;
        displayForTeamA(pontosTimeA);
    }

    public void safetyA(View view) {
        pontosTimeA += 2;
        displayForTeamA(pontosTimeA);
    }

    public void touchDownB(View view) {
        pontosTimeB += 6;
        displayForTeamB(pontosTimeB);
    }

    public void inc1B(View view) {
        pontosTimeB += 1;
        displayForTeamB(pontosTimeB);
    }

    public void inc2B(View view) {
        pontosTimeB += 2;
        displayForTeamB(pontosTimeB);
    }

    public void fieldGoalB(View view) {
        pontosTimeB += 3;
        displayForTeamB(pontosTimeB);
    }

    public void safetyB(View view) {
        pontosTimeB += 2;
        displayForTeamB(pontosTimeB);
    }

    public void reset(View view) {
        pontosTimeA = 0;
        pontosTimeB = 0;
        displayForTeamA(pontosTimeA);
        displayForTeamB(pontosTimeB);
    }
}
