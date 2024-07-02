package com.avidus.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
   val bookButton = findViewById <Button> (R.id.bookButton)
        bookButton.setOnClickListener {
            intent = Intent(this, BookActivity::class.java)
            startActivity(intent)
        }

        val movieButton = findViewById <Button> (R.id.movieButton)
        movieButton.setOnClickListener {
            intent = Intent(this, MoviesActivity::class.java)
            startActivity(intent)
        }

        val playButton = findViewById <Button> (R.id.playButton)
        playButton.setOnClickListener {
            intent = Intent(this, PlayActivity::class.java)
            startActivity(intent)
        }

        val aboutButton = findViewById <Button> (R.id.aboutButton)
        aboutButton.setOnClickListener {
            intent = Intent(this, AboutActivity::class.java)
            startActivity(intent)
        }
    }
}