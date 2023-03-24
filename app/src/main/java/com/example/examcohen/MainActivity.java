package com.example.examcohen;

import java.util.*;
import java.io.*;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileInputStream;
import java.util.Random;
import java.util.stream.Stream;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText letters;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        letters = findViewById(R.id.letters);
        Intent intent = new Intent(MainActivity.this, EndScrn.class);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("numberOfShapes", Integer.parseInt(letters.getText().toString()));
                startActivity(intent);
            }
        });
    }
}