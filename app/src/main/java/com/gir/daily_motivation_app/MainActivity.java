package com.gir.daily_motivation_app;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    String[] quotes = {
            "Push yourself, because no one else is going to do it for you.",
            "Success doesn’t just find you. You have to go out and get it.",
            "Dream it. Wish it. Do it.",
            "Don’t stop when you’re tired. Stop when you’re done.",
            "Stay positive. Work hard. Make it happen.",
            "Discipline beats motivation.",
            "You are alive !!",
            "The only way to do great work is to love what you do.",
            "It’s not whether you get knocked down, it’s whether you get up",
            "Believe you can and you’re halfway there.",
            "The future belongs to those who believe in the beauty of their dreams.",
            "The only limit to our realization of tomorrow will be our doubts of today.",
            "You are never too old to set another goal or to dream a new dream",
            "You are nor lesser than anyone by any means.",
            "You can do, whatever you can think",
            "You are created by the greatest creator, so don't lose yourself.",
            "Small progress is still progress.",
            "Focus on the goal, not the obstacles.",
            "Your only limit is your mind.",
            "Great things never come from comfort zones.",
            "Work hard in silence, let success make the noise.",
            "Consistency is what transforms average into excellence.",
            "Doubt kills more dreams than failure ever will.",
            "Believe in yourself and all that you are.",
            "The harder you work, the luckier you get.",
            "Do something today that your future self will thank you for.",
            "Success is the sum of small efforts repeated daily.",
            "Don’t wait for opportunity. Create it.",
            "Action is the foundational key to success.",
            "Fall seven times, stand up eight.",
            "Your future is created by what you do today.",
            "Be stronger than your excuses.",
            "You don’t have to be great to start, but you have to start to be great.",
            "Success is not for the lazy.",
            "Make yourself proud."
    };

    int[] colors = {
            0xFF1F1F1F,
            0xFF3700B3,
            0xFF6200EE,
            0xFF03DAC5,
            0xFFB00020,
            0xFF018786,
            0xFF2E7D32,
            0xFF1565C0,
            0xFFF57C00
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView quoteText = findViewById(R.id.quoteText);
        Button nextButton = findViewById(R.id.nextButton);
        ConstraintLayout mainLayout = findViewById(R.id.mainLayout);

        Random random = new Random();

        nextButton.setOnClickListener(v -> {

            int index = random.nextInt(quotes.length);
            quoteText.setText(quotes[index]);

            int colorIndex = random.nextInt(colors.length);
            mainLayout.setBackgroundColor(colors[colorIndex]);
        });
    }
}