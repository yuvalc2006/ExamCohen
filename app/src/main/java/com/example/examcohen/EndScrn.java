package com.example.examcohen;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Toast;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Random;
public class EndScrn extends AppCompatActivity {
    int numberOfShapes;
    Shape shape;
    PaintView s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end_scrn);
        Intent intent = getIntent();
        numberOfShapes = intent.getExtras().getInt("numberOfShapes");
        int[] x = new int[numberOfShapes];
        int[] y = new int[numberOfShapes];
        float h;
        float w;
        for (int i = 0; i < numberOfShapes; i++){
            h = Math.random() * height;
            w = Math.random() * weidth;
            while (h != 0 && w != 0){
                for (int j = 0; j < i; j++){
                    if ()
                }
            }
        }
    }
}