package com.caramat.mharvin.block2.p1.quiz

import android.content.Context
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import android.widget.Button
import java.util.Scanner

class MainActivity : AppCompatActivity() {

    private lateinit var clickme: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        clickme = findViewById(R.id.click)
        clickme.setOnClickListener{
            var mediaPlayer = MediaPlayer.create(applicationContext, R.raw.catsound)
            mediaPlayer.start()
        }
    }
}
